package basic01;

// import java.lang.*; <- String을 쓰려면 import되는 것. 자동으로 들어오기 때문에 굳이 쓸 필욘 없음 

public class Ex01_Var { // extends objects 
	
	// 멤버 변수 (굳이 null을 적지 않아도 초기화 된다)

	public static void main(String[] args) {
		
		// 지역 변수 
		
		String a;	// String a = null; (지역변수는 이렇게 직접 초기화 시켜주는 습관) 
		int b;
		
		a = "Hello"; // a = new String ("Hello");
		b = 200; 
		
		System.out.println(a+" "+b);
		
		/*
		 * 자료형 (Data Type)
		 * 1. 기본형 (boolean, char, int/long, double)
		 * 2. 참조형 (class, array)
		 * + String
		 */
		
		
	}

}
