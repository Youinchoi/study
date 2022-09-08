package chapter07.EX02;

// class 외부에 올 수 있는 것 : 패키지, 임포트(같은 패키지에 존재하지 않는 클래스), 외부 클래스 

class A { 	// 클래스 : 객체를 생성하기 위한 설계도  
	// 클래스 내부에 올 수 있는 것 (네가지) : 1. 필드 (클래스에서 선언된 변수) 2. 생성자 3. 메소드 4. 이너 클래스 (★)
	
	// 1) 필드 (값을 넣지 않으면 0 또는 null 출력)
	int m;	// Heap 공간에 저장, 강제 초기화
	int n;	
	double k;
	String l;
	
	// 2) 생성자 : 클래스는 반드시 생성자가 존재해야 한다.
	// 			  기본 생성자(입력 매개 변수가 없는 생성자)는 생략 될 수 있다. 
	//     특징 : # 클래스 이름과 동일해야 함 / # 리턴이 존재하지 않는다 
	//           # 객체 생성시 생성자 호출 / # 객체의 초기값을 세팅
	// 			 # 기본 생성자는 생략되어 있을 경우, 컴파일러가 자동으로 등록해줌
	//           # 클래스 내부의 다른 생성자가 존재할 시, 컴파일러가 기본 생성자를 자동으로 만들어 주지 않는다
	
	
	
	A (){
		System.out.println("기본 생성자 호출");
	}
	
	// 3) 메소드 : 리턴타입 메소드 명 (입력 매개변수) { 실행 코드; }
	// 프로그램의 기능을 코드로 작성
	// 호출해서 작동됨 , work1()
	void work1 () {
		System.out.println("work1 메소드 호출");
	}
	
	// work2를 호출 할 때는 정수 2개를 넣어야 한다.	 
	int work2(int a, int b) {	// 지역 변수 : 메소드 블락에서 선언된 변수 / Stack에 값이 저장됨 
		System.out.println("work2 메소드 호출");
		
		return a+b;
	}
	
	// work3 (정수, 더블, 문자열)
	double work3 (int a, double b, String c) {
		System.out.println("work3 메소드 호출");
		System.out.println(a + ", "+ b + "," + c);
		return a+b;
	}
	
	String work4 (String a) {
		return a; 
	}
	
}




public class Using_Object {

	public static void main(String[] args) {
		// 객체 생성 : 메인 메소드에서 생성 
		
		A a1 = new A();
	 // A가 클래스, a1은 객체, new는 Heap에 객체를 생성하라는 뜻
	 // A() : 클래스 내부의 생성자 호출, 기본 생성자 : 입력 매개변수가 없는 생성자, 생략 가능하다 
	 
	 // 객체의 필드 값 출력
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println(a1.k);
		System.out.println(a1.l);
		
		System.out.println("===========");
		
	// 객체의 필드의 값을 수정
	a1.m = 10;
	a1.n = 20;
	a1.k = 30.0;
	a1.l = "안녕하세요";
	
	System.out.println(a1.m);
	System.out.println(a1.n);
	System.out.println(a1.k);
	System.out.println(a1.l);
	
	System.out.println("===========");
	
	// 메소드 호출 work1
	a1.work1();	// 매개변수가 존재하지 않는 메소드
	
	System.out.println("===========");
	
	// 메소드 호출 work2
	int k = a1.work2(10, 20);	//매개변수가 2개읜 메소드 호출 << return a+b;
	System.out.println(k);
	
	System.out.println(a1.work2(40, 50));
	System.out.println("===========");
	
	// 메소드 호출 work3 - 리턴 double
	double d = a1.work3(10, 20.0, "오늘");	// 리턴 받은 값을 변수에 할당 후 출력
	System.out.println(d);
	a1.work3(30, 30.0, "날씨");
	
	System.out.println("===========");
	
	// 메소드 호출 work4 -
	
	String s = a1.work4("안녕");
	System.out.print(s);
	System.out.println(a1.work4("하세요!"));
	
	// 클래스 : 객체를 생성하기 위한 설계도 <== 클래스 영역에 로드되어 있다
	// 객체 : 클래스를 기반을 만들어진 인스턴스 (객체) <== Heap에 로드됨
	// 인스턴스화 : 클래스는 객체화 해야 사용 가능하다 / A a = new A();
	
	A a2 = new A();
	A a3 = new A();
	A a4 = new A();
	A a5 = new A();
	
	
	
	
	
	
		
		
		
	}

}
