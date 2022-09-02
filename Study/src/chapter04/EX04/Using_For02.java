package chapter04.EX04;

import java.util.Scanner;

public class Using_For02 {

	public static void main(String[] args) {
		// for문을 사용해서 스캐너로 5개의 값을 인풋받아 출력
		
		Scanner sc = new Scanner (System.in);
		
		String s ;
		
		for(int i=0; i<5; i++) { //0번부터 5번까지
			s = sc.next();
			System.out.println(s);
					
		}
		
		// for문 내에서 변수 선언시, for문에서만 사용가능
		// 같은 클래스 내에서 재사용 가능 
		
		int a;	// 전역 변수 : for 밖, 안 모두 사용가능
		a=0;
		
		for (int i = 0; i <3; i++) {  // 0,1,2 총 세번 돌아감
			// i는 지역변수, for문 내에서만 사용가능
			System.out.println(a);
		}

		System.out.println(a);
		
		sc.close();
		
		
		
		
	}

}
