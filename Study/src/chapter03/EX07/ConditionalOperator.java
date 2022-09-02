package chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 <== 자주사용
		// (조건) ? 참:거짓 ;
		//     조건이 참이면 '참'을 실행하고, 조선이 거짓이면 '거짓'을 실행한다
		// :(콜론) = 깃발을 나타냄 
		
		int value1 = (3>5)?6:9;	// 앞의 조건이 false이므로 변수에 9가 할당
		System.out.println(value1);
		
		int value2 = (5>3)?10:20; // 앞의 조건이 True이므로 변수에 10가 할당
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println((value3%2 == 0) ? "짝수" : "홀수");
			// %는 나머지 값만 출력 
		// 5의 배수인지 삼항연산자를 통해서 확인 
		
		int value4 = 10;
		System.out.println((value4%5 == 0) ? "5의 배수이다" : "5의 배수가 아니다");
		
		// 나이가 20이상이면 성인이다. 성인이 아니다
		int value5 = 25;
		System.out.println((value5>=20) ? "당신은 성인입니다" : "당신은 성인이 아닙니다");
		
		System.out.println("=============");
		
		//3항 연산자는 if~else문으로 변환이 가능하다
		/*
		 if (조건){
		 	실행문1; <= 조건이 참이면 실행문1이 실행됨  
		 }	else {
		 	실행문2; <= 조건이 거짓일때 실행문2가 실행
		 }
		
		 */
		
		// 변수선언은 한번만 가능, but 값은 다르게 할당가능
		value3 = 5;
		
		if (value3%2 == 0) {
			System.out.println("짝수");		// 조건이 참일때 실행블락
		}else {
			System.out.println("홀수");		// 조건이 거짓일때 실행블락
		}
		
		System.out.println("=============");
		
		if (value4%5 == 0) {
			System.out.println("5의 배수이다");
		}else {
			System.out.println("5의 배수가 아니다");
		}
		
		System.out.println("=============");
		
		if (value5>=20) {
			System.out.println("당신은 성인입니다");
		}else {
			System.out.println("당신은 성인이 아닙니다");
		}
		
		
		
	}

}
