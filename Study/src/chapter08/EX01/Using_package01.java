package chapter08.EX01;

public class Using_package01 {

	public static void main(String[] args) {
		
		// A 클래스와 같은 패키지에 존재 : import없이 바로 접근 가능 
		System.out.println("==A클래스 접근 / public==");
		A a = new A();
		
		System.out.println(a.m); // 접근 가능 
		System.out.println(a.n);
		a.print();
		
		System.out.println("==B클래스 접근 / default==");
		// 동일한 패키지에 존재 
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();
		
	}

}
