package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		
		// 탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목당 전체 구성원 수의 합과 평균을 출력하시오 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("각 종목의 구성원 수를 공백을 이용해서 넣으세요>>> ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		String [] arr; // 배열 선언
		arr = s1.split(" ");
		
		int b;
		int sum = 0;
		int count  = 0;
		
		for(int i = 0; i<arr.length; i++) { // 문자열을 정수형으로 변환 
			if(i%2==1) {	// (i%2!=0)
				b = Integer.parseInt(arr[i]);
				sum+=b;
				count++;
				
			}
		}
		
		
		System.out.println("전체 구성원 수 : " + sum);
		System.out.println("평균 : "+ sum / (double)count);
		
		String s;
		
		do {
			s=sc.nextLine();
			if(s.equals("그만~")) {
				break;
			}
					
			
		}while(true);
		
		System.out.println("프로그램을 종료합니다!");
		
		
		
		sc.close();
		
		
		

	}

}
