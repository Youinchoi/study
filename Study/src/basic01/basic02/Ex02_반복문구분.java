package basic02;

import java.util.Scanner;

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		/* for : 반복 횟수가 정해진 경우
		 * while : 반복 횟수를 모르는 경우
		 * do~while : 조건을 나중에 비교 
		 */
		
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int num = 0;
		
		do {
			System.out.print("원하는 단을 입력하시오 >> ");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println();
				
				for(int i = 1; i<=1; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				} System.out.println();
				
			}else if(num==2) {
				System.out.println();
				
				for(int i = 2; i<=2; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==3) {
				System.out.println();
				
				for(int i = 3; i<=3; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==4) {
				System.out.println();
				
				for(int i = 4; i<=4; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==5) {
				System.out.println();
				
				for(int i = 5; i<=5; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==6) {
				System.out.println();
				
				for(int i = 6; i<=6; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==7) {
				System.out.println();
				
				for(int i = 7; i<=7; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==8) {
				System.out.println();
				
				for(int i = 8; i<=8; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			else if(num==9) {
				System.out.println();
				
				for(int i = 9; i<=9; i++) {
					for(int j = 1; j<=9; j++) {
						System.out.println(i+"x"+j+"="+i*j);
					}
				}System.out.println();
			}
			
			
			
		}while(run);
		
		sc.close();
		
		
		

	}

}
