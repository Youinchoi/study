package basic04;

public class Cal {
	
	private int addition;	// 덧셈
	private int substraction; // 뺄셈
	private int multiplication; // 곱셈
	private double  division; // 나눗셈 
	
	public Cal() { // 기본 생성자 만들기
		
	}
	
	public Cal(int addition, int substraction, int multiplication, double division) {
		this.addition = addition;
		this.substraction = substraction;
		this.multiplication = multiplication;
		this.division = division;
		
	}
	
	public int getAddition() {
		return addition;
	}

	public void setAddition(int addition) {
		this.addition = addition;
	}

	public int getSubstraction() {
		return substraction;
	}

	public void setSubstraction(int substraction) {
		this.substraction = substraction;
	}

	public int getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}

	public double getDivision() {
		return division;
	}

	public void setDivision(double division) {
		this.division = division;
	}
	
	

	public static void main(String[] args) {
		
		
		
		Cal cal = new Cal();
		
		cal.addition = 40;
		
	}

}
