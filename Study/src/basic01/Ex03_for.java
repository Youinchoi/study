package basic01;

/* 반복문 : for / while / do~while
 * 
 * (1) for (초기치; 조건문; 증가치){
 * 			반복구문
 * 			}
 * 
 * 
 */





public class Ex03_for {

	public static void main(String[] args) {
		
		// 1. 1~10까지 숫자 출력
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		// 1부터 10까지의 합 출력
		
		int even = 0;
		int odd = 0;
		
		for(int t = 1; t<=10; t++) {
			if(t%2==0) {
				even+=t;
			}else {
				odd += t;
			}
		}
		
		System.out.print("짝수의 합 : " + even);
		System.out.println();
		System.out.print("홀수의 합 : " + odd);
		System.out.println();
		
		
//		int sum=0; 
//		for (int i=1; 1<=10; i++) {
//			sum+=i;
//		}

		
		
	// 2. 알파벳 a~z까지 출력 
//		
//		for(char i = 'a'; i<='z'; i++) {
//			System.out.print(i);
//		}
//		
//		System.out.println();
//		
//		for(char i = 'a'; i<='z'; i++) {
//			System.out.print(i);
//		}
//		
//		z~a까지 출력
		
//		for(char a ='a';  a>='z'; a--) {
//			System.out.print(a + " ");
//		}
//		System.out.println();
		
	}

}
