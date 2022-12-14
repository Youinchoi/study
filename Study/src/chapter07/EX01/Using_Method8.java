package chapter07.EX01;

import java.util.Arrays;

public class Using_Method8 {
	
	// 가변 길이 배열 입력 매개변수
	
	// For 문으로 출력
	static void method1 ( int ...values) { 
		for(int i = 0; i<values.length; i++) {
			System.out.println(values[i]+" ");
		} System.out.println();
	}
	
	// Enhanced For문으로 출력
	//	for(int k : values) {
	//		System.out.println(k+" ");
	//			} System.out.println();
	
	// System.out.println(Arrays.toString());
	
	static void method2 (String ...values) {
		// 임의의 문자열을 입력받아 출력
		
		for(int i=0; i<values.length; i++) {	// for문
			System.out.print(values[i]);
		}System.out.println();
		
		for(String i : values) {	//Enhances for문
			System.out.print(i + " ");
		}System.out.println();
		
		System.out.println(Arrays.toString(values));
	}
	
	
	
	
	
	public static void main(String[] args) {
		// 가변 길이 배열 매개변수 (FlexibleSizeArray Argument)
		
		method1 (1,2);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("==================");
		
		method2("강감찬", "이순신", "홍길동");
		method2("호랑이", "토끼");
		method2("금붕어", "가물치", "잉어", "붕어", "악어");
		
		
	}

}
