package chapter04.EX02;

import java.util.Scanner; // 같은 패키지 외부의 객테를 사용할 경우, import가 필요...

public class Using_Scanner {

	public static void main(String[] args) {
		// Scanner : 첫 글자가 대문자로 시작 : 클래스 (객체를 생성하는 틀, 템플릿)
		/* 
		 	- 콘솔을 통해서 값(정수-int, 문자열-next/nextln, 실수-nextDouble, 문자)을 받아서 처리
		 	- 객체를 임포트해서 사용해야함 (import java.util.Scanner)
		 	- 공백이나 엔터를 사용해서 여러개의 값을 넣을 수 있다.
		 */
		
		Scanner sc = new Scanner(System.in);   // ★
		// Scanner란 클래스로 부터 sc라는 객체를 생성함 (sc : 콘솔을 통해서 인풋받음)
		// 스캐너 위에 마우스올리고 "컨트롤+쉬프트+O (단축키)" : 외부 클래스 자동 import
		// sc는 객체
		// sc.nextInt() : 객체의 함수(메소드)
		
		System.out.println("반드시 정수를 입력하세요>>>");
		
		int a = sc.nextInt(); 	// 콘솔에서 정수값을 받아서 변수 a에 할당
		System.out.println("변수 a를 출력 : "+a);
		
		System.out.println("반드시 문자열을 입력하세요>>>");
		String b = sc.next(); // 콘솔에서 문자열을 받아서 변수 b에할당
		System.out.println("변수 b를 출력 : "+b);
		
		System.out.println("반드시 실수값을 입력하세요");
		double c = sc.nextDouble();
		System.out.println("변수 c를 출력 : "+c);
		
		// 스캐너에서 char 문자열 처리
		// 한 문자를 처리할때, String 변수 선언
		System.out.println("반드시 한 문자만 입력하세요");
		String s = sc.next();
		char d = s.charAt(0);
		System.out.println("변수 d를 출력 : "+d);

		// 콘솔에 공백을 추가해 한번에 입력가능 (ex. 100 안녕 49.22 하세요)
		
	}

}
