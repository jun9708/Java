package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 	날짜 : 2024.01.22
 * 	이름 : 김준형
 * 	내용 : Insert 실습하기
 */
public class InserTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb";
		String user = "wnsgud1997";
		String pass = "abc1234";
		
		try{
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL 실행
			String sql = "INSERT INTO `User1` VAlUES ('P101' ,'김유신', '90-01-22', '010-1234-0001', 23)";
			
			stmt.executeUpdate(sql);
			
			//5단계 - 결과처리(SELECT경우)
			
			
			
			//6단계 - 접속 종료
			stmt.close();
			conn.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료 ... ");
	}
}
