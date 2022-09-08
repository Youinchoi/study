package chapter07.EX01;

public class Using_Method7 {
	
	static void print() {
		System.out.println("입력된 데이터가 없습니다 - 매개변수없음");
	}
	
	static void print (int a) {
		System.out.println(a + " : 값이 입력되었습니다. - 매개변수 : 정수");
	}
	
//	static void print (int c) {
//		매개변수의 타입과 갯수가 같아서 오류발생. 시그니쳐가 같다 
//		(메소드 명, 매개변수의 타입, 갯수가 같으면 동일 시그니쳐로 판단)
//	}
	
	static void print (double a) {
		System.out.println(a + " : 값이 입력되었습니다 - 매개변수 : 실수");
	}
	
	static void print (double a, double b) {
		System.out.println(a + " , " + b + " : 값이 입력되었습니다. - 매개변수 : 실수 & 실수");
	}
	
	static void print (int a, int b) {
		System.out.println(a + " , " + b + " : 값이 입력되었습니다. - 매개변수 : 정수 & 정수");
	}
	static void print (int a, double b) {
		System.out.println(a + " , " + b + " : 값이 입력 되었습니다. - 매개변수 : 정수 & 실수");
	}
	
//	static int print (int c, double d) {
//		System.out.println("위의 메소드와 시그니쳐가 중복됨");
//	}
	
	
	
	public static void main(String[] args) {
		// # 메소드 오버로딩 (Method Overloading) : 
		//	: 동일한 메소드 이름에 대해서 시그니쳐가 다른 경우, 다른 메소드로 인식한다.
		//		시그니처(식별자) : 입력매개변수 타입, 입력매개변수 갯수
		
		// # 메소드 오버라이딩 (Method Overriding) : 상속
		//	: 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의해서 사용하는 것
		
		
		// 매개변수 없는 메소드 호출 : print()
		print();
		
		System.out.println("============");
		
		// 매개변수 : print (정수);
		print(10);
		
		System.out.println("===========");
		
		// 매개변수 : print (실수);
		print(20.0);
		
		System.out.println("===========");
		
		// 매개변수 : print (정수, 정수);
		print (30,40);
		
		System.out.println("===========");
		
		// 매개변수 : print (실수, 실수);
		print (10.1, 20.1);
		
		
		
		
	}

}