package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		// 점수와(score) 학년(year)을 인풋받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년일 경우, 70점 이상이여야 합격, 중첩 if문 사용 (if문 내의 if문)
		
		
		Scanner sc = new Scanner(System.in);
		
		int score=0;
		int year=0;
		
		System.out.print("점수 : ");
		score = sc.nextInt();
		
		System.out.print("학년 : ");
		year = sc.nextInt();
		
		if(year>3 && score>=70) {	
			System.out.println("합격"); 
		}
		if(year>3 && score<70) {
			System.out.println("불합격"); 
		}
		if(year<4 && score>=60) {
			System.out.println("합격");
		}	
		if(year<4 && score<60) {
			System.out.println("불합격");
		}
		
		sc.close();
		
		
		
	}
		
}

	


