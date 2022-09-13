package chapter07.EX04;

//Aaaaa 클래스 : 여러개의 생성자 사용시 this() 없이 사용한 경우, 중복된 값을 매번 입력 해야함

class Aaaaa{
	int m1, m2, m3, m4;	// 정수값을 담는 필드 4개 선언
	Aaaaa(){	// 기본 생성자
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaaaa(int a){
		m1 = a; m2 = 2; m3 = 3; m4 = 4;
	}
	Aaaaa(int a, int b){
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	void print() {
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println();
	}
	
}

//Bbbbb 클래스 : 여러개의 생성자 사용시 this()를 사용한 경우, 중복된 값을 제정

class Bbbbb {
	int m1, m2, m3, m4;
	Bbbbb(){	 //기본 생성자, 각 필드의 초기값을 할당 
		m1 = 1; m2 = 2; m3 = 3; m4 = 4;
	}
	Bbbbb(int a){	// 매개변수 1개
		this();
		m1 = a;
	}
	Bbbbb(int a, int b){	// 매개변수 1개
		this(a);
		m2 = b;
	}
	
	void print() {	// 각 필드의 값을 출력하는 메소드
		System.out.println(m1 + " ");
		System.out.println(m2 + " ");
		System.out.println(m3 + " ");
		System.out.println(m4 + " ");
		System.out.println();
		
	}
	
}


public class This_Method02 {

	public static void main(String[] args) {
		
		// 1. 3개의 객체 생성 (this 미사용)
		System.out.println("===Aaaaa 객체 생성 this()미사용===");
		Aaaaa Aaaaa1 = new Aaaaa();	// 기본 생성자 호출
		Aaaaa1.print();
		
		Aaaaa Aaaaa2 = new Aaaaa(10);	// 기본 생성자 호출
		Aaaaa2.print();
		
		Aaaaa Aaaaa3 = new Aaaaa(10,20);	// 기본 생성자 호출
		Aaaaa3.print();
		
		
		// 2. 3개 객체 생성(this()사용)
		System.out.println("===Bbbbb 객체 생성 this()사용===");
		Bbbbb Bbbbb1 = new Bbbbb();
		Bbbbb1.print();
		
		Bbbbb Bbbbb2 = new Bbbbb(10);
		Bbbbb2.print();
		
		Bbbbb Bbbbb3 = new Bbbbb(10,20);
		Bbbbb3.print();
		
		

	}

}
