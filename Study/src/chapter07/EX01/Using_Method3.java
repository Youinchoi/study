package chapter07.EX01;

public class Using_Method3 {
	
	// 인스턴스 필드 : static 키가 붙지 않는 필드 (객체화를 해야 사용가능)
	int c;	
	int b;
	
	// 스태틱 필드 : 객체화 하지 않고 바로 사용 가능  
	static int e;
	static int f;
	
	// 인스턴스 메소드 : 객체화 해야만 사용가능
	void a1 () {
	 System.out.println("a1 () 메소드 호출");
	}
	
	// static 메소드 : 객체화 없이 호출이 가능
	static void def() {
		System.out.println("def() 메소드 호출");
	}
	
	// 스태틱 메소드 내부엔 인스턴스 필드나 메소드를 바로 사용할 수 없다. (객체화 시켜야 사용가능)
	

	
	
	public static void main(String[] args) {
	
	// 메인 메소드도 method 이다
	int a; 	// 지역변수이다 <== Stack에 저장, Stack 영역 강제 초기화가 안됨 
				// Stack에 값이 저장, main() method 내에서만 사용됨
	
	// System.out.println(a); <== 초기값을 넣지 않고 출력 하면 오류, 자동 초기화 불가능
	
	a = 10;
	System.out.println(a); // <== 이제 실행 가능
	
//	메인 메소드 내부의 메소드 선언 불가, 클래스 블락에서만 선언 가능
//	void a1 () {
//		System.out.println("안녕하세요");
//	}
	
	// 필드명, 메소드명 앞에 static키다 적용 되어 있으면 객체 생성없이 호출 가능 
	// static 메소드 내에서는 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다
	// static 메소드 내에서는 스태틱 필드나 스태틱 메소드를 사용 할 수 있다
	
	
//	c= 5;	(인스턴스 필드) 오류발생 (Static 메소드 내부에서 인스턴스 필드 직접 호출 불가)
	e = 10; // 같은 클래스 내레서 직접 호출, static 필드 호출 
	
//	a1(); 인스턴스 메소드라 오류발생
	def();
	
		
	}

}
