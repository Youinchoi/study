package polymo;

public class MainTest {

	public static void main(String[] args) {
		
		Item i = new Item(); // abstract를 붙이면 오류가 남
		
		Book b = new Book(001,"사피엔스","하라리","코스모출판");
		b.output();
		
//		Item b = new Book(001,"사피엔스","하라리","코스모출판");
//		b.output();
// 		이런 식으로도 호출이 가능하다... 부모변수의 자식객체 생성 가능
		
		Dvd d = new Dvd(002,"헌트","정우성","이정재");
		d.output();
		
		Cd c = new Cd(003,"힐링 클래식","모짜르트");
		c.output();

	}

}
