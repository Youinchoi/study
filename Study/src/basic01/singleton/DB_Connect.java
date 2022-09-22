package singleton;

public class DB_Connect { // 자동으로 대충자료형 변환 
	
	private DB_Connect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DB_Connect con = null; // 외부에서 인스턴스 생성을 못하도록 생성자를 private로 설정
	
	public static DB_Connect getInstance() {  // 싱글톤은 static instance를 가지고 있다
		if(con == null) {
			con = new DB_Connect();
		}
		
		return con;
	}

}

