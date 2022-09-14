package chapter09.EX01;

// E 클래스는 A 클레스를 상속받는다  <== A 클래스의 모든 필드와 메소드를 물려받음 
// A class <== 부모 클래스 (super class)
// E class <== 자식 클래스 (child class)
// # (동일한 패키지에서 상속 설정)

public class E extends A {
	
	public void print() { 	
		System.out.println("==부모 클래스의 필드 출력==");
		System.out.println(a);	// public (부모의 A 필드)
		System.out.println(b);	// protected (부모의 B 필드)
		System.out.println(c);	// default (부모의 C 필드)
//		System.out.println(d);	private (부모의 D 필드, but 접근 불가라 오류)
		
		System.out.println("==부모 클래스의 메소드 호출==");
		print1();	// public 부모 클래스의 메소드 호출 
		print2();	// protected
		print3();	// default
//		print4();	// private (접근 불가라 오류)
		
		
	}
	
}
