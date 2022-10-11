package b_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertEmp {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.9:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("DB 연결 성공");
			
			// 입력값
			String myName = "최유인";
			int mySal = 10000;
			String myJob = "IT";
			
			// 3. sql 문장
			
			String sql = "INSERT INTO emp(empno, ename, sal, job) "
					+ " VALUES(5555, ?,?,?)"; 
			
			// 4. sql 전송객체
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, myName);
			stmt.setInt(2, mySal);
			stmt.setString(3, myJob);
			
			// 5. sql 전송
			int result = stmt.executeUpdate(); // 4번에서 이미 sql 연결 
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("DB 실패 : " + e);;
		}
		
		
		
	}

}
