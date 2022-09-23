package polymo;

public class Cd extends Item {
	
	private String Singer;
	
	public Cd() { // 기본 생성자
		
	}
	
	public Cd(int number, String title, String Singer) { 
		super(number,title);
		
		this.Singer = Singer;
		System.out.println();
		System.out.println("===Cd===");
	}
	
	
	public void output() { // 출력
		System.out.println("번호 : " + number);
		System.out.println("제목 : " + title);
		System.out.println("가수 : " + Singer);
	}

}
