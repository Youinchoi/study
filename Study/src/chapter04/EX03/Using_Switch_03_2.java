package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch_03_2 {

	public static void main(String[] args) {
		/* 2. 스위치 문제
		 - 스캐너로 월을 인풋받아서 해당 월의 총 날짜를 출력
		 예제) 8월을 31일 까지 있습니다. (월) (일) <- 이 변수
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Choose month>>> N월");
		System.out.println("=========================");
		
		int month = sc.nextInt();
		int day = 0;
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day = 31;
			break;
		case 4 : case 6 : case 9 : case 11 :	
			day = 30;
			break;
		case 2 :	
			day = 29;
			break;
		default :
			System.out.println("존재하지 않는 달입니다.");
		}
		
		System.out.printf("%d월은 %d일 까지 존재합니다.", month,day);

	}

}
