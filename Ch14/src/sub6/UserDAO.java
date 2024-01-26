package sub6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	//싱글톤
	private static UserDAO instance = new UserDAO();
	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}

	//DB정보
	private final String HOST= "jdbc:mysql://127.0.0.1:3306/studydb";
	private final String USER= "wnsgud1997";
	private final String PASS= "abc1234";

	//DB자원
	private Connection conn =null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs =null;

	//커넥션 생성
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		//1단계 데이터베이스 로드
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2단계 데이터베이스 접속
		return  DriverManager.getConnection(HOST, USER, PASS);

	}

	//자원해제 메서드
	public void close() throws SQLException{
		if(rs != null) {
			rs.close();
		}
		if(psmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}

	//CRUD 메서드
	public void insertUsers(UserDTO user) {
		try {
			conn = getConnection();
			//3단계 - SQL실행 객체 생성
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			//4단계 - SQL실행
			psmt.executeUpdate();
			//5단계 - 작업처리

			close();
			//6단계 - 데이터베이스 종료
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectUsers() {

	}
	public void selectUser() {

	}
	public void updateUsers() {

	}
	public void deleteUsers() {

	}
}
