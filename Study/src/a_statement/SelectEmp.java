package a_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmp {
	
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
			
			// 3. sql 문장
			String sql = "SELECT empno, ename, sal, job from emp";
			
			// 4. sql 전송객체
			Statement stmt = con.createStatement();
			
			// 5. sql 전송
			/* ResultSet executeQuery() : SELECT
			 * int executeUpdate() : INSERT / DELETE / UPDATE */
			ResultSet result = stmt.executeQuery(sql);
			while (result.next()) {
				int empno 	 = result.getInt("EMPNO");
				String ename = result.getString("ENAME");
				int sal 	 = result.getInt("SAL");
				String job 	 = result.getString("JOB");
				System.out.println(empno + "/" + ename + "/" + sal + "/" + job);
			}
			
			// 6. 닫기
			result.close();
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("DB 실패 : " + e);;
		}
		
	}

}
