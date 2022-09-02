package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/*  
		 	나이(age)가 8세 미만이면 : "미취학 아동입니다."
		 				    	  "입장료는 <1000>원 입니다."
		 	나이가 14세 미만이면 : "초등학생입니다."
		 					  "입장료는 <2000>원 입니다."
		 	나이가 20세 미만이면 : "중고등학생입니다"
		 					  "입장료는 <2500>원 입니다."
		 	나이가 20세 이상이면 : "일반인 입니다."
		 					  "입장료는 <3000>원 입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		int year=0;
		int price = 0;
		
		System.out.println("당신은 몇세입니까?>>>");
		System.out.println("=========================");
		
		year = sc.nextInt();
		
		if(year<8) {	
			price = 1000;
			System.out.println("미취학 아동이며, 입장료는 "+ price+ "원 입니다."); 
		}
		else if(year<14) {	
			price = 2000;
			System.out.println("초등학생이며, 입장료는 "+ price+ "원 입니다."); 
		}
		else if(year<20) {	
			price = 2500;
			System.out.println("중고등학생이며, 입장료는 "+ price+ "원 입니다."); 
		}
		else {	
			price = 3000;
			System.out.println("성인이며, 입장료는 "+ price+ "원 입니다."); 
	   }
		
		sc.close();
		
	}
}















