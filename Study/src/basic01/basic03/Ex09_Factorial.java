package basic03;

public class Ex09_Factorial {

	public static void main(String[] args) {
		
		int fac = factorial(5);
		System.out.println("! = " + fac);
		
		// fac(5) = 5 * fac(4)
		// fac(4) = 5 * fac(3)
		// fac(3) = 5 * fac(2)
		// fac(2) = 5 * fac(1)
		// fac(1) = 5 * 1 = 5
		// **반복
		
		
		
	}
	
	static int factorial(int i) {
		if(i==1) return 1; 
		return i*factorial(i-1);
	}

}

