package chapter09.EX05;

class B{
	int a = 10;	
	static int b = 20;
	
	void abc() {
		System.out.println("인스턴스 메소드 - abc()");
		System.out.println(a);
		System.out.println(b);
		cde();
	}
	
	static void bcd() {
		System.out.println("정적 메소드 - bcd()");
//		System.out.println(a);
		System.out.println(b);
//		cde();
		def();
		
	}
	
	void cde() {
		System.out.println("인스텀스 메소드 - cde()");
	}
	
	static void def() {
		System.out.println("정적 메소드 - def()");
	}

}



public class Using_StaticMethod02 {

	public static void main(String[] args) {
		
		System.out.println("==static : 객체 생성 없이 호출==");
//		System.out.println(B.a);
		System.out.println(B.b);
		
//		B.abc();
		B.bcd();
		B.def();
		
		System.out.println("==객체 생성 후 필드, 메소드 호출==");
		
		B b = new B();
		
		System.out.println(B.b);
		
		
	}

}
