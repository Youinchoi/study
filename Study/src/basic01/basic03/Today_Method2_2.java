package basic03;

import java.util.Scanner;

public class Today_Method2_2 {
	
	// Q. 영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고,
	// 대문자라면 그대로 반환하는 메소드를 작성하시오.

	public static void main(String[] args) {
		
		String in = ""; // 입력
		String out = ""; // 출력
		char temp; // char를 사용해 입력'문자'를 담을 임시 저장공간을 만듦
		
		Scanner sc = new Scanner(System.in); // 스캐너 작성
		System.out.print("문자열을 입력하시오 : "); // Hello World!!를 넣을거임
		in = sc.nextLine(); // 입력받은 문자열을 in변수에 저장
		
		for(int i = 0; i<in.length(); i++) { // 문자열 길이를 반환하는 length 함수를 쓴다
			temp = in.charAt(i); // 입력된 문자를 한 글자씩 temp에 저장
			if((97<=temp)&&(temp<=122)){ // 아스키코드를 이용해 좌항과 우항이 모두 소문자인 경우일 때 
				out += in.valueOf(temp).toUpperCase(); // 괄호 안의 해당 객체를 String 객체로 변환하는 valueOf() 함수 사용
															 // 소문자는 대문자로 변환되는 toUpperCase() 함수 사용
			}else {out += (char)temp;}
		}
		
		System.out.println("반환된 문자열 : " + out); // 출력값 HELLO WORLD!!
		
		
	}

}
