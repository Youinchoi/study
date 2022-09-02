package chapter04.EX05;

import java.util.Scanner;

public class Using_while3 {

	public static void main(String[] args) {
		// "그만"할 때까지 정수값을 넣어서 합계와 평균을 출력
		
		
		int count = 0; // 정수가 입력되는 갯수를 카운트 함 (평균낼 때)
		int sum = 0;   // 입력받는 정수를  모두 더한 값
		
		System.out.println("원하는 정수를 입력하고, 마지막에 stop으로 종료를 알리세요.");
		
		Scanner sc = new Scanner(System.in);
		
		boolean stop = true;
		int nu = 0;	// 스캐너로 인풋받는 변수
		
		while(stop) {	
			sum += 0;	
			count++;	
			nu = sc.nextInt(); 
		}
		if (count==0) { 
			System.out.println("입력된 정수가 없습니다.");
		}else {	
		System.out.println("입력된 정수는 : " + count + "개 입니다.");
		System.out.println("입력된 정수의 합은 : " + sum + "입니다.");
		System.out.println("평균은 : " + sum / (double)count);
		}
		
		System.out.println();
		
		
		
		sc.close();
		
		
	}

}
