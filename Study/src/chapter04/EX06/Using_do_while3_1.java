package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int n = 0; 
		
		do {
			System.out.println("=======");
			System.out.println("1. 19단 | 2. 홀수단 | 3. 5의 배수단 |  4. 종료");
			System.out.println("원하는 숫자 선택");
			System.out.println(" ");
			n = sc.nextInt();
			
			if (n==1) {
				// 19단
				System.out.println("1 - 19단을 출력합니다.");
				System.out.println();
				
				for(int l=1; l<=9; l++) {
					for(int r=1; r<=9; r++) {
						System.out.print(l+"x"+r+"="+l*r);
						System.out.print("\t");
					}
				}
				System.out.println();
				
			}else if (n==2) {
				System.out.println("2- 홀수단을 출력합니다.");
				System.out.println();
				
				for(int w=1; w<=9; w++) {
					for(int r=1; r<=1; r++) {
						System.out.print(w+"x"+r+"="+w*r);
						System.out.print("\t");
					}
				}
				
				
				
			}
			
			
			
			
			
			
			
			
		} while(run);
		
		
		
		
		
		

	}

}
