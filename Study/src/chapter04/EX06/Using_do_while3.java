package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		int nu  = 0; //  스캐너에서 정수를 인풋받음
		
		do {
			System.out.println("====================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료 ");
			System.out.println("====================================================");
			System.out.println("원하는 숫자를 선택하세요 >>>");
			System.out.println("");
			nu = sc.nextInt();
			
			if(nu==1) {
				//1. 19단 출력
				System.out.println("[1] 19단");
				System.out.println();
				
				for (int f = 1; f<=19; f++) {
					for(int t=1; t<=19; t++) {
						System.out.print(f+"X"+t+"="+f*t);
						System.out.print("\t");
						}
					} 
				System.out.println();
				
			}else if (nu==2) {
				//2. 홀수단 출력
				System.out.println("[2] 홀수단 출력");
				System.out.println();
				
				for(int w=1; w<=19; w++) {
					for(int o=1; o<=19; o++) {
						if(w % 2 == 1) {
							System.out.print(w+"x"+o+"="+w*o);
							System.out.print("\t");
						}
					}
					if(w % 2 == 1) {
						System.out.println();
					}
				}
				
			}else if (nu==3) {
				// 3. 3의 배수단 출력
				System.out.println("[3] 3의 배수단");
				System.out.println();
				
				for(int l = 1; l<=19; l++) {
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
			}else if (nu==4) {
				System.out.println("[4] 종료");
				System.out.println();
				break;
			}
			
			
		}while(run); // 무한루프
		
		
		sc.close();
		
		
		
		
	}

}
