package a_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmp2 {

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
			
			// - 월급이 10000이상인 사원들 삭제
			
			String sql = "INSERT INTO emp(empno, ename, sal, job) "
			+ " VALUES(seq_temp2.nextval, '" + myName +"'," + mySal + ", '" + myJob+"')"; 
			System.out.println(sql);
			
			// 4. sql 전송객체
			Statement stmt = con.createStatement();
			
			// 5. sql 전송
			/* ResultSet executeQuery() : SELECT
			 * int executeUpdate() : INSERT / DELETE / UPDATE */
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("DB 실패 : " + e);;
		}
		
		
		
	}

}
