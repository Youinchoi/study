package basic01;

public class Ex02_ShortCircuit_logic2 {

	public static void main(String[] args) {
		
		int a = 3;
		
		if(a<3 & ++a>3) {
			System.out.println("access"); // x
		}System.out.println("a = " + a); // 4
		if(a>1 | ++a>3) {
			System.out.println("access2"); // o
		}System.out.println("a = " + a); // 5
		
	}

}


