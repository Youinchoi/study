package polymo;

public class Book extends Item {
	
	private String author;
	private String publisher;
	
	public Book() {  // 기본 생성자
		this(000,"제목없음","무명","출판사");
		System.out.println("Book 기본생성자");
	}
	
	public Book(int number, String title, String author, String publisher){
//		super.number = number;
//		super.title = title;
		
		super(number,title);
		this.author = author;
		this.publisher = publisher;
		System.out.println();
		System.out.println("===Book===");
	}
	
	public void output() { // 출력
		System.out.println("번호 : " + number);
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("출판사 : " + publisher);
	}

}
