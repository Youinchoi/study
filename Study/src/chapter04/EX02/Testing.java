package chapter04.EX02;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("주문하실 도시락 갯수를 입력해주세요 : ");
		int a = sc.nextInt();
		
		
		if (a>=10) {
			int price =  (a*2400);
			System.out.printf("금액은 총 %d원 입니다.",price);
		}
		else if (a<10) {
			int price =  (a*2500);
			System.out.printf("금액은 총 %d원 입니다.",price);
		}

		sc.close();
		
	}

}
