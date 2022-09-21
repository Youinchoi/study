package basic03;

public class Ex09_Awesome_Test {

	public static void main(String[] args) {
		
		int sum = sumFunc(3);
		System.out.println("합 : " + sum);
		// sum(3) = 3 + sum(2)
		// sum(2) = 2 + sum(1)
		// sum(1) = 1 + 0 = 1
		// sum(2) = 2 + 1 = 3
		// sum(3) = 3 + 3 = 6
		
	}
	
	static int sumFunc(int i) {
		// sum = 1+2+3
		if(i==1) return 1;
		return i + sumFunc(i-1); // 재귀호출  
		
	}

}
