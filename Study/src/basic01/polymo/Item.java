package polymo;

public class Item {
	
	protected int number; // 자식들이 접근가능하게끔 protected를 붙여준다 
	protected String title;

	public Item() {  // 기본 생성자 
		
	}
	
	Item(int number, String title){
		this.number = number;
		this.title = title;
	}
	
	public void output() {
		
	}
}
