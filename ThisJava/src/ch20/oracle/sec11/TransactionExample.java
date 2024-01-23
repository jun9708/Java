package ch20.oracle.sec11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/bankerd";
		String user = "wnsgud1997";
		String pass = "abc1234";
		
		try {
			//1단계 - JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 연결
			conn = DriverManager.getConnection(host, user, pass);
			
			//트랜잭션 시작-----------------------------------------
			//자동 커밋 기능 끄기
			conn.setAutoCommit(false);
			
			//출금 작업
			String sql1 = "update `bank_account` set `a_balance` -10000 where `a_no`=?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setString(1, "101-11-1001");
			int rows1 = pstmt1.executeUpdate();
			if(rows1 == 0) throw new Exception("출금되지 않았음");
			pstmt1.close();
			
			//입금 작업
			String sql2 = "update `bank_account` set `a_balance` +10000 where `a_no`=?";
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			pstmt2.setString(1, "101-11-1002");
			int rows2 = pstmt2.executeUpdate();
			if(rows2 == 0) throw new Exception("입금되지 않았음");
			pstmt2.close();
			
			//수동 커밋 -> 모두 성공처리
			conn.commit();
			System.out.println("계좌 이체 성공");
			
			//트랜잭션 성공 ----------------------------------------------------
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			//수동롤백 -> 모두 실패처리
			conn.rollback();
		}catch(SQLException e1) {
			System.out.println("계좌이체 실패");
			e1.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					//원래대로 자동 커밋 기능 켜기
					conn.setAutoCommit(true);
					
					//연결끊기
					conn.close();
				}catch(SQLException e) {}
			}
		}
		
	}
}
