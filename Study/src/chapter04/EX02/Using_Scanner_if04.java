package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소, 카페라떼를 주문할경우 : 3,500원
		// 아메리카노를 주문할경우 : 2,500원
		// 그 외의 메뉴를 주문할 경우 : 우리 매장에 없는 메뉴입니다.
		
		//출력 : 주문하신 <에스프레소>는 가격이 <3,500>원 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하실 메뉴를 골라주세요>>>");
		System.out.println("=========================");
		System.out.println("아메리카노 / 에스프레소 / 카페라떼");
		System.out.println("=========================");
		
		String order = sc.next();
		
		int price = 0;
		
		
		if (order.equals("에스프레소") || order.equals("카페라떼")) {
			price = 3500;
		}
		else if (order.equals("아메리카노")) {
			price = 2500;
		}
		else {
			System.out.println("우리 매장에는 없는 메뉴입니다!");
		}
		
		System.out.printf("주문하신 %s는 가격이 %d원 입니다.", order, price);
		
		
		sc.close();
		

	}

}
