package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 골라주세요>>>");
		System.out.println("===================================");
		System.out.println("아메리카노 / 에스프레소 / 카페라떼/ 아포가토");
		System.out.println("===================================");
		
		String order = sc.next();
		int price  = 0;
		
		switch (order) {
		case "아메리카노" : 
			price = 2500;
			break;
		case "에스프레소" : case "카페라떼" : case "아포가토" : 
			price = 3500;
			break;
		default : 
			System.out.println("우리 매장에 없는 메뉴입니다.");
	}
		
		System.out.printf("주문하신 음료는 %s이며, 가격은 %d 입니다.", order, price);
		
		sc.close();
		
		
	}		

}
