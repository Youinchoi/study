package chapter09.EX01;

// 클래스의 접근 지정자 : public, default (생략)
// 필드, 생성자, 메소드 : public, protected, default, private

// public : 다른 패키지, 같은 패키지 모두 접근 가능
// protected : 다른패키지에서 접근 가능하지만 *상속이 되어 있을때만 가능*
// default : 같은 패키지에서만 접근 가능
// private : 동일한 파일에서만 접근 가능 


public class A {
	
	// 필드의 접근 제어자
	public int a = 10;	// 다른 패키지, 같은 패키지
	protected int b = 20;	// 다른 패키지 (상속), 같은 패키지
	int c = 30;	// default	// 같은 패키지 
	private int d = 40;	// 같은 파일에서만 (접근가능)
	
	
	// 메소드의 접근 제어자 
	public void print1() {
		System.out.println("A 클래스 출력 - public");
	}
	protected void print2() {
		System.out.println("A 클래스 출력 - protected");
	}
	protected void print3() {
		System.out.println("A 클래스 출력 - default");
	}
	private void print4() {
		System.out.println("A 클래스 출력 - private");
	}
	
	
	
	
	
	
}
