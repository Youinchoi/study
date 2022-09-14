package chapter08.EX02;


// 임포트 없이 외부 패키지 접근하려면 : 클래스의 전체 이름을 사용하여 접근 (package + class 이름)
// A class (public) <- 접근 가능 / B class (default) <- 접근 불가 

public class Using_package03 {

	public static void main(String[] args) {
		
		// 전체 이름 : 패키지명.클래스명 
		chapter08.EX01.A a = new chapter08.EX01.A();
		
		System.out.println(a.m); // 외부 패키지에서 접근 가능해짐 (public) 
		System.out.println(a.n); 
		
		a.print();
		
		
	}

}
