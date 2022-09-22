package singleton;

public class WorkA {
	
	DB_Connect con;

	public WorkA() {
		con = DB_Connect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}
	
	
}
