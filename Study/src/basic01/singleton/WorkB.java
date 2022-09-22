package singleton;

public class WorkB {
	
	DB_Connect con;
	
	public WorkB() {
//		con = new DB_Connect();
		con = DB_Connect.getInstance();
	}
	
	public void use() {
		System.out.println("B 작업");
	}
	
	
}
