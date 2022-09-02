package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// 정수를 스캐너로 5개 인풋받아서 양수만 더한 값을 출력하세요.
		// for문 내의 if
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;	// 양수만 더함 
		int count = 0;	// 양수를 카운트하는 변수
		
		System.out.println("(음수 포함) 정수 5개를 입력하시오>>>");
		
		for (int i = 0; i<5; i++) {
			int n =  sc.nextInt();
			if (n>0) {
				sum += n; 
				count++; // 양수일때 1씩 증가
			}
		}

		System.out.println("5개의 정수 중... 양수의 합은 "+ sum + "이며, 출력 값의 평균은 " + sum / (double)count + "입니다!");
	
			
	}

}


