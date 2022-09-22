package basic04;

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
		
		CalculatorExpr cal = new CalculatorExpr(); // 객체 생성 -> 생성자 호출 
		
		Scanner sc = new Scanner(System.in); // 스캐너 생성
		
		while (true) {
			System.out.print("num 1 = ");
			int num1 = sc.nextInt();
			
			System.out.print("num 2 = ");
			int num2 = sc.nextInt();
			
			cal.setNum1(num1); // setter를 이용해 변수에 수를 입력한다 
			cal.setNum1(num2);
			
			System.out.println("덧셈 : " + cal.getAddition());
			System.out.println("뺼셈 : " + cal.getSubstraction());
			System.out.println("곱셈 : " + cal.getMultiplication());
			System.out.println("나눗셈 : " + cal.getDivision());
			
			// 계속 진행할 지 물어본 후 판단
			System.out.print("계속 진행하시겠습니까? (Y/N) >> ");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("N")) break;
		}
		
		sc.close();
		
	}

}
