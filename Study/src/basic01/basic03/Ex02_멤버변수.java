package basic03;

public class Ex02_멤버변수 {
	
	// 메인 함수 밖에서 선언 
	static int a = 10, b = 20; // static을 붙여야 sum에서 에러가 안남
	static int sum = 0;

	public static void main(String[] args) {
		
		add();
		// 두 수를 더한 결과를 출력 
		System.out.println("합 : " + sum);

	}
	
	static void add() {
		// 두 수를 더하기 
		sum = a+b;
	}
	

}
