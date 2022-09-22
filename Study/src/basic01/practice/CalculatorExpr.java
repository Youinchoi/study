package practice;

import java.util.Scanner;

public class CalculatorExpr {
	
	private int num1;
	private int num2;
	
	// getter & setter 생성
	
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// 계산 메소드 생성 
	
	int getAddition() { // 덧셈
		return num1 + num2;
	}
	
	int getSubstraction() { // 뺄셈
		return num1 - num2;
	}

	int getMultiplication() { // 곱셈
		return num1 * num2;
	}
	
	double getDivision() { // 나눗셈
		return (double)num1 / num2;
	}
	

	public static void main(String[] args) {
		
		CalculatorExpr c = new CalculatorExpr(); // 객체 생성
		Scanner sc = new Scanner(System.in);
		String answer; // do while 문을 쓸거라 while문 밖에서 선언
		
		do {
			// 입력문
			System.out.print("첫번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			c.setNum1(num1);
			c.setNum2(num2);
			
			// 결과 출력
			System.out.println("덧셈 : " + c.getAddition());
			System.out.println("뺼셈 : " + c.getSubstraction());
			System.out.println("곱셈 : " + c.getMultiplication());
			System.out.println("나눗셈 : " + c.getDivision());
			System.out.println();
			
			// 계속 진행할건가 물어보기
			System.out.print("계속 진행하려면 (Y)를 입력 / 종료를 원한다면 (N)를 입력 >> ");
			answer = sc.next();
			System.out.println();
		} while(answer.equalsIgnoreCase("Y"));
		
		System.out.println("프로그램이 종료되었습니다!");
		
		sc.close();
		
	}

}
