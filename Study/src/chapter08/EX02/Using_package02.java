package chapter08.EX02;

import chapter08.EX01.A;
// import chapter08.EX01.B;  오류 발생, 접근 제어자가 default이기 때문

// import chapter08.EX01.com;
// 동일한 클래스는 import로도 사용 불가

public class Using_package02 {

	public static void main(String[] args) {

		// A 클래스는 동일한 패키지 내에 존재하지 않는다. (import를 해서 사용)
		// A class는 접근 제어자가 public, protected (상속) 지정되어 있어야 한다 
		
		System.out.println("==A class public==");
		
		A a = new A();
		System.out.println(a.m); // 다른 패키지에서 접근
		System.out.println(a.n);
		
		a.print();
		
		System.out.println("==B class default==");
		// B class는 다른 패키지에 존재하고, 접근 제어자가 default로 할당되어있음
		// = 외부 패키지에서는 접근 불가
		// B b = new B();
		
		System.out.println("==com.A class==");
		chapter08.EX01.com.A ab = new chapter08.EX01.com.A();
	//      (전체 패키지 이름) (클래스 명)
		// 동일한 클래스는 import가 불가능하므로 전체 이름을 사용 
		System.out.println(ab.aa);
		System.out.println(ab.bb);
		
		ab.print();
		
		
		
		
	}

}
