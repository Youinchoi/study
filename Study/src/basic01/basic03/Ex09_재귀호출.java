package basic03;

public class Ex09_재귀호출 {

	public static void main(String[] args) {
		
		int sum = recrursive(3);
		System.out.println(sum);
	}
	
	static int recrursive(int n) {
		
		if(n==1) return 1;
		return n + recrursive(n-1); // 재귀호출  
		
	}

}
