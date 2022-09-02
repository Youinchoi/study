package chapter05;

import java.util.Scanner;

public class Using_Array12 {

	public static void main(String[] args) {

		// "그만" 할 때까지 정수값을 넣어서 합계와 평균을 출력
		// 문자열을 정수로 변환
		
		/*  1. String s = sc.nextLine();
		 	2. s.Splite(" "); <== 공백을 기준으로 잘라서 배열에 저장
		 	3. 문자형 String을 정수형으로 변환, Integer.ParseInt();
		 	4. 전체 합계와 평균을 구하면 됩니다.  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("[그만]이라고 입력하기 전까지 정수값을 넣습니다.>>> ");
		String s = sc.nextLine();
		System.out.println(s);
		
		String [] arr;
		arr = s.split(" ");
		
		int b;
		int sum = 0;
		int count  = 0;
		
		for(int i = 0; i<arr.length; i++) { // 문자열을 정수형으로 변환 
				b = Integer.parseInt(arr[i]);
				sum+=b;
				count++;
			}
		
		
		System.out.println("전체 합계 : " + sum);
		System.out.println("평균 : "+ sum / (double)count);
		
		do {
			s=sc.nextLine();
			if(s.equals("그만")){break;}
			}while(true);
		
		
		sc.close();
			
	}

}
