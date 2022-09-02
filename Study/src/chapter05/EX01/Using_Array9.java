package chapter05.EX01;

import java.util.Scanner;

public class Using_Array9 {

	public static void main(String[] args) {
		
		// 
		Scanner sc = new Scanner(System.in);
		
		
		// 단어가 아닌, 라인 전체를 통채로 인풋 받음 >>> 국어 영어 수학 과학
		// sc.next()  ==> '국어'만 인풋 받음
		// sc.nextLine() ==> '국어 영어 수학 과학' 전체를 인풋 받음
		
		System.out.print("문자열을 입력하세요(라인 전체) >> ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("=============================");
		
		System.out.print("문자열을 입력하세요(한 단어) >> ");
		String s2 = sc.next();
		System.out.println(s2);
		
		// 국어 80점, 영어 50점, 수학 77점, 과학 88점 
					// <== 전체 라인을 인풋받아서 공백을 기준으로 잘라 배열에 저장
		
		
		
		sc.close();
		
		
		

	}

}
