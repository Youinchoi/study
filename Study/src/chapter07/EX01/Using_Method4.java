package chapter07.EX01;

public class Using_Method4 {
	
	
	// 같은 클래스에서 메소드 호출
	// 메인 메소드는 스태틱 키가 붙은 메소드
	

	static void print() {
		System.out.println("hi");
	}
	
	static int twice (int k) {	// 인풋값을 두배로 돌려주는 메소드 
		return k*2;
	}
	static double sum (int m, double n) {	// 두 값을 받아 더해서 되돌려줌
		return m + n ;
	}
	
	
	
	public static void main(String[] args) {
		// 클래스 내부에서 메소드 호출
		
		print();	// "hi"
		int a = twice(3);	// 6
		System.out.println(a);
		
		double b = sum(a,5.8);	// 11.8
		System.out.println(b);
		
		

	}

}
