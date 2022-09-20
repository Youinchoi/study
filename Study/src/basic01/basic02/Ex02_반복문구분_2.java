package basic02;

import java.util.Scanner;

public class Ex02_반복문구분_2 {

	public static void main(String[] args) {

		// 1. for 문
		
		Scanner sc = new Scanner(System.in);
//
//		System.out.print("몇 번을 반복 할까요? : ");
//		int su = sc.nextInt();
//
//
//		for(int n = 0; n<su; n++) {
//			System.out.println("구구단 출력기 : 원하는 단수를 입력하시오 >>");
//			int i = sc.nextInt();
//			for(int j = 1; j<=9; j++) {
//				System.out.printf("%d*%d=%d\n", i,j,i*j);}
//		}
		
		// 2. while 문
		
//		while(true) {
//			System.out.print("원하는 단수를 입력하시오 >> ");
//			int i = sc.nextInt();
//			for(int j=1; j<=9; j++) {
//				System.out.printf("%d*%d=%d\n",i,j,i*j);
//			}
//			System.out.print("반복을 종료하려면 (Y) : ");
//			sc.nextLine();
//			String answer = sc.nextLine();
//			if(answer.equalsIgnoreCase("Y"))break;
//		}
		
		// 3. do while 문
		
		boolean run = true;
		int i = 0;
		
		do {System.out.print("원하는 단을 입력하시오 >> ");
		i = sc.nextInt();
			
		for(int j=1; j<=9; j++) {
			System.out.printf("%d*%d=%d\n",i,j,i*j);
		}System.out.print("반복을 종료하려면 (Y) : ");
		sc.nextLine();
		String answer = sc.nextLine();
		if(answer.equalsIgnoreCase("Y"));
		break;
		}
		
		while(run); 
		
		
	}

}
