package chapter05.EX01;

import java.util.Arrays;

public class Using_Array5 {

	public static void main(String[] args) {
		/* 1~500까지 3의 배수를 배열에 저장
		 * 출력 : 1. 직접출력, 2. for문을 써서 출력, 3. Enhanced for문 4. toString()
		 * 합계 / 평균도 내봅시다.	*/
		
		
		int [] num  = new int [166];
		int count = 0; //3의 배수의 갯수를 구하는 변수 
		int sum =0; // summary
		
		// for문을 사용하여 입력
		
		for (int i = 0, j=3 ; i<num.length; i++, j+=3) {
			if(j<=500) {
				num[i]=j;
				count++;
			}
		}
		
		System.out.printf("======%d======", count);
		System.out.println();
		
		
		// for문을 사용하여 출력
		
		for(int i = 0; i<num.length; i++) { 	// length는 배열의 길이
			System.out.println(num[i]);
		}
		
		System.out.println("=================");
		
		System.out.println("총 3의 배수 갯수 : " + count);
		
		System.out.println("=================");
		
		// Enhanced for문
		
		for(int k : num) {
			System.out.print(" "+k);
		}
		
		System.out.println();
		System.out.println("=================");
		
		// Arrays.toString() 출력
		System.out.println(Arrays.toString(num));
		
		System.out.println("=================");
		
		
		for(int i = 0; i<num.length; i++) {
			sum+=num[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / (double)count);
		
		
	}
	
}

