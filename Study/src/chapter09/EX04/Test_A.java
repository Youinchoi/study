package chapter09.EX04;

public class Test_A {

	public static void main(String[] args) {
		
		// 객체 생성 후 출력 (인스턴스 필드, 정적필드)
		System.out.println("==객체 생성 후 출력==");
		A a1  = new A();
		System.out.println(a1.m);	// 인스턴스 필드 출력 : 객체 생성 후 출력
		System.out.println(a1.n);	// 정적필드 출력 : 객체 생성후 또는 없이도 출력가능
		
		// 객체 생성없이 출력 (클래스이름.n)
		System.out.println("==객체 생성없이 출력==");
		System.out.println(A.n);  // <== 클래스명.n (인스턴스 필드)
		
//		System.out.println(A.m);  <== 반드시 객체 생성 후에 객체이름.m (정적필드)
		
		// 정적필드는 모든 객체에서 공유하는 필드 
		System.out.println("==정적필드의 객체간 공유==");
		A a2 = new A(); // m ==> 10
		a2.m = 10;		// n : 5 ===> 모든 객체에서 공유되는 필드 
		a2.n = 1000;
		
		A a3 = new A();
		a3.m = 70;	// 
		a3.n= 2000; 
		
		A a4 = new A();
		a4.m = 30;
		a4.n= 3000;
		// 객체 정보 출력
		
		A.n = 5000;
		a2.print();;
		a3.print();
		a4.print();
			
		
	}

}
