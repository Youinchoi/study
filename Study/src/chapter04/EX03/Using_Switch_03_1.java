package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch_03_1 {

	public static void main(String[] args) {
		/* 2. 스위치 문제
		 - 스캐너로 월을 인풋받아서 해당 월의 총 날짜를 출력
		 예제) 8월을 31일 까지 있습니다. (월) (일) <- 이 변수
		 */

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Choose month>>> N월");
		System.out.println("=========================");
		
		String month = sc.next();
		
		switch (month) {
		case "1월" : case "3월" : case "5월" : case "7월": case "8월": case "10월" :case "12월" :
			System.out.println("해당 월은 총 31일입니다.");
			break;
		case "4월" : case "6월" : case "9월" : case "11월" :
			System.out.println("해당 월은 총 30일입니다.");
		default :
			System.out.println("해당 월은 총 29일입니다.");
		}
		
		sc.close(); 
		
	}

}
