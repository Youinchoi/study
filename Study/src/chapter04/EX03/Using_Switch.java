package chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {

		// 1. 브레이크 사용 안 할때
		// switch문 : 반드시 break;를 사용해서 해당 case를 탈출한다
		// switch 구문에서 break;를  사용하지 않는 경우 :
		// 해당 case로 점프 후에 하위의 모든case를 실행
		// break ; 해당 실행문을 빠져나온다...
		
		
		int a = 5;
		
		switch (a) { // (위치 변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("변수 값을 출력"+a);
		case 2:
			System.out.println("변수 값을 출력"+a);
		case 3:
			System.out.println("변수 값을 출력"+a);
			break;
		case 4:
			System.out.println("변수 값을 출력"+a);
		default :  // default는 if구문의 else와 같이 case값이 없는 모든 경우임
			System.out.println("변수 값을 출력"+a);
			
		}
		
		System.out.println("=======================");
		
		// 2. switch문에서 break; 사용 (일반적)
		
		a = 1;
		
		switch (a) { // (위치 변수) : 정수, 문자, 문자열
		case 1:
			System.out.println("case1 출력"+a);
			break;
		case 2:
			System.out.println("case2 출력"+a);
			break;
		case 3:
			System.out.println("case3 출력"+a);
			break;
		case 4:
			System.out.println("case4"+a);
			break;
		default :  // default에서는 일반적으로 break 생략
			System.out.println("default 출력"+a);
		}
		
		System.out.println("=======================");
		
		// 7점 이상인 경우, pass 그렇지 않을 경우 fail
		
		int b = 5;
		
		switch(b) {
		case 10: 
			System.out.println("pass");
			break;
		case 9:
			System.out.println("pass");
			break;
		case 8:
			System.out.println("pass");
			break;
		case 7:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
		
		System.out.println("========축약표현========");
		
		// 축약 표현
		
		b=8;
		
		switch (b) {
		case 10: case 9: case 8: case 7:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
		
		// switch문 <=========> if ~ else if문과 상호 변환
		
		int  c = 8;
		
		switch (c) {
		case 10 : case 9 : 
			System.out.println("A 학점");
			break;
		case 8 : 
			System.out.println("B 학점");
			break;
		case 7 : 
			System.out.println("C 학점");
			break;	
		default :
			System.out.println("D 학점");
			
		}
		
		// 위 구문을 if else if문으로 변환하면 break 없이도 자동으로 구문을 뺘져나옴
		
		c = 7;
		if (c>9) {
			System.out.println("A 학점");
		}else if	(c == 8) {
			System.out.println("B 학점");
		}else if	(c == 7) {
			System.out.println("C 학점");
		}else {
			System.out.println("D 학점");
		}
		
		
		}
		
		
		
	}


