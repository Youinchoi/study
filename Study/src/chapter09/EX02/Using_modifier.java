package chapter09.EX02;

import chapter09.EX01.A;

// A 클래스와 다른 패키지에 존재하는 클래스 : 

public class Using_modifier {

	public static void main(String[] args) {
		
		
		A a = new A(); // ctrl + shift + o 로 임포트 시킴
		
		// 필드 접근
		System.out.println(a.a); // public
//		System.out.println(a.b); <- protected라 접근 불가, 상속 관계에 있어야만 접근가능
		// 상속 값이 설정되어있지 않아서 public인 a만 출력 
		
//		System.out.println(a.c); <- default라 접근 불가
//		System.out.println(a.d); <- private이라 접근 불가 
		
		// 메소드 접근 
		a.print1();		// public만 출력 가능!!
//		a.print2();		<= protected
//		a.print3();		<= default
//		a.print4();		<= private
		
		System.out.println("==상속관계 객체 출력 (D)==");
		D d = new D();
		
		d.print();
		
	}

}
