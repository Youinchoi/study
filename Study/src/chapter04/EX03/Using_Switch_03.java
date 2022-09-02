package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch_03 {

	public static void main(String[] args) {
		/* 1. 스위치 문제
		 - 스캐너로 "Gold"를 넣으면 "금메달입니다"를 출력
		 - 스캐너로 "Silver"를 넣으면 "은메달입니다"를 출력
		 - 스캐너로 "Bronze"를 넣으면 "동메달입니다"를 출력
		 그외는 "메달이 없습니다"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 포켓몬을 고르세요>>>");
		System.out.println("===================================");
		System.out.println(" 얌 / 왹 / 왈");
		System.out.println("===================================");
		
		String medal = sc.next();
		
		switch (medal) {
		case "얌": 
			System.out.println("개구리좋아!");
			break;
		case "왹":
			System.out.println("건강하자ㅋㅋ");
			break;
		case "왈":
			System.out.println("졸업축하해...");
			break;
		default :
			System.out.println("해당 포켓몬이 없습니다");
		}
		
		System.out.println("===================================");
		
		
		
		
	}

}
