package polymo;

public class Dvd extends Item {
	
	private String actor;
	private String director;
	
	public Dvd() {  // 기본 생성자
		
	}
	
	//값을 받아들이는 생성자
	public Dvd(int number, String title, String actor, String director) { 
		super(number,title);
		
		this.actor = actor;
		this.director = director;
		System.out.println();
		System.out.println("===Dvd===");
	}
	
	public void output() { // 출력
		System.out.println("번호 : " + number);
		System.out.println("제목 : " + title);
		System.out.println("배우 : " + actor);
		System.out.println("감독 : " + director);
	}
	

}
