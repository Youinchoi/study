package chapter06.EX01;

// 같은 패키지 내에서 클래스 이름이 중복되면 오류 발생

class C {
	
	
	// 필드 : Heap 영역에 값이 저장되며, 강제 초기화 됨
	int a;
	int b;
	String name;
	
	C() {}		// 기본 생성자 : 매개변수 값이 없고, 실행부도 없는 생성자, 생략가능
	
	void call() {
		int c; 	// 지역 변수 : Stack, 강제 초기화가 안되므로 반드시 기본값을 넣고 출력
		System.out.println("출력 내용입니다.");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		
	}
}


public class Using_Class3 {

	public static void main(String[] args) {
		
		C c = new C();
		c.call();
		

	}

}
