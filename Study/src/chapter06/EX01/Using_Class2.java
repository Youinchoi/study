package chapter06.EX01;


// class(붕어빵 기계)와 객체 (붕어빵)의 차이점
// 클래스 : 객체를 만들기 위한 틈, 붕어빵 기계와 설계도
// 객체(인스턴스) : 클래스를 틀로헤서 민들어진 RAM에 로드 된 객체, 붕어빵, 건물

// 필드 : 클래스 블락에서 선언된 변수 (멤버 변수)
// 생성자
// 메소드 : 메소드 내부에 선언된 변수 (지역변수)
// 이너클래스



//외부 클래스
class  A{
	// 필드 : Heap 공간에 값이 지정됨, 값을 넣지 않으면 강제 초기화 됨
	int m = 3;
	int n = 4;
	
	A(){} // 기본 생성자 : 클래스 이름과 동일한 메소드를 생성자, 리턴타입이 없다
			// 객체를 생생할 때, 초기값을 부여하는 역할을 한다.
	
	// 메소드는 호출시 작동 됨
	void print() {
		int k = 10; // 지역변수 : Stack공간에 값이 저장됨, 값을 넣지 않으면 비어있음
		System.out.println(k);
		System.out.println(m+n);
	}
}

class B {
	
}


public class Using_Class2 {

	public static void main(String[] args) {
		int aa; // 지역 변수
		
		// 객체 생성은 메인 메소드에서 작성 
		
		// 객체 생성
		A a = new A();
		
		// A : 참조 변수 타입 (A) 
		// a : 객체 (참조 변수)
		// new : Heap 메모리에 값을 넣어라. 객체를 생성해라
		// A() : 기본 생성자 호출 
		
		// 객체의 필드의 내용 출력 (a.m, a.n)
		System.out.println("==객체의 필드 값 출력==");
		System.out.println(a.m);
		System.out.println(a.n);
		
		// 객체의 메소드 호출(a.print())
		System.out.println("==객체의 메소드 호출==");
		a.print();
		
		System.out.println("=====================");
		
	//==================================================
		
		// A class : 툴 ==> 객체화
		A b = new A();
		
		System.out.println(b.m);
		System.out.println(b.n);
		
		// 객체 필드의 값을 수정
		b.m = 30;  // 3에서 30으로 수정
		b.n = 40;  // 4에서 40으로 수정
		
		// 필드의 내용 출력
		System.out.println(b.m);
		System.out.println(b.n);
		
		// 메소드 호출 : 기능을 프로그래밍 한 것
		System.out.println("==print()메소드 호출==");
		b.print();
		
		System.out.println("==A class를 틀로해서 객체를 무한정 생성==");
		A c = new A();
		
		System.out.println(c.m);
		System.out.println(c.n);
		c.print();
		
		
		
		
		
		
	}

}
