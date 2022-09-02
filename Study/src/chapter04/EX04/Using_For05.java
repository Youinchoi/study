package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		// 이중 for문을 사용해서 1단 ~9단까지 출력.
		//  \n:enter, \n t : tab
		
		//1*1=1 2*2=2 1*3=3 ......................
		// 
		
		int left =1;
		int right =1;
		
		for (left = 1; left<=9; left++) {
			for(right=1; right<=9; right++) {
				System.out.println(left+"X"+right+"="+(left*right));
				}
			}
		
		System.out.println("====================");
		
		// 1단에서 19단까지 3의 배수단만 출력
		
		for (int l = 1; l<=19; l++) {
			for(int r=1; r<=19; r++) {
				if(l % 3 == 0) {
					System.out.print(l+"x"+r+"="+l*r);
					System.out.print("\t");
				}
			}
			if (l % 3 == 0) {
				System.out.println();
			}
	    }
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하시오 (1~9단) : ");
		
		int i = sc.nextInt();
		
		for (int j = 1; j < 10; j++) {
			System.out.println(i+"x"+j+"="+i*j);
		}
			sc.close();	
				
	
		
		
		

}
	
}
