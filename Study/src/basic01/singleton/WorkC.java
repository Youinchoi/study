package singleton;

// 싱글톤 패턴 (중요!!)



public class WorkC {
	
	DB_Connect con;
	
	public WorkC() {
//		con = new DB_Connect();
		con = DB_Connect.getInstance();
	}
	
	public void use() {
		System.out.println("C 작업");
	}

}
