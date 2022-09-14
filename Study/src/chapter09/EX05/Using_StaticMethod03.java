package chapter09.EX05;

// static 필드의 값 초기화 : 클래스 내부에서 static {초기화}
// 클래스 명 & 필드명이 호출 될 때 static{ }이 제일 먼저 작동 

class C{
	int a;
	static int b;
	
	static {	// 클래스가 클래스 영역에 로드될 때 제일 먼저 작동. 생성자와 샅은 역할
//		a = 10;   <== 인스턴스 필드는 초기화 불가능 
		b = 5;
		System.out.println("클래스 C가 로딩되었습니다."); 
	}
	
	C(){	// 생성자 : 객체를 생성할 떄 필드의 초기값 할당 
		a = 3; 	// 인스턴스 필드 초기화
		b = 55;	// 정적 필드 초기화 
	}
	
	
}

public class Using_StaticMethod03 {
	
	int a = 100;
	static int b = 200;
	
	void abc() {
		System.out.println("abc instance");
	}
	
	static void bcd() {
		System.out.println("bcd static method");
	}

	public static void main(String[] args) {
		
		System.out.println(C.b);
		System.out.println(b);
		bcd();
		
	}

}
