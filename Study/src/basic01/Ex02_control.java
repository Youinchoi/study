package basic01;

import java.util.Calendar;
import java.util.Scanner;

/* 제어문 : 프로그램 흐름을 변경하기 위해 
 * 
 * 1. if
 * 2. switch
 * 3. for
 * 4. while / do-while
 * 5. break & continue 
 */

public class Ex02_control {

	public static void main(String[] args) {

			String id = null; // new가 생략되는건 String뿐임
			
			Scanner input = new Scanner(System.in);
			System.out.print("주민번호를 입력하시오>> ");
			id = input.nextLine();
			
			char s = id.charAt(7);
			System.out.println(s); // s라는 변수에 문자가 1,3,9이면 남자, 2,4,0이라면 여자 출력 
			
			 if(s=='1' || s=='3' || s=='9'){
				 System.out.println("male");
			 }else if(s=='2'|| s=='4'||s=='0') {
				 System.out.println("female");
			 }
			
			 char chul = id.charAt(8);
			 System.out.println(chul);
			 
			 // chul 변수가 0이라면 '서울'
			 // chul 변수가 1이라면 '인천/부산'
			 // chul 변수가 2이라면 '경기'
			 // chul 변수가 9이라면 '제주도'
			 
			 String home = null;
			 
			 switch(chul) {
			 case '0' : home = "서울";
			 break;
			 case '1' : home = "인천";
			 break;
			 case '2' : home = "경기";
			 break;
			 case '3' : home = "부산";
			 break;
			 case '9' : home = "제주도";
			 break; }
			 
			 System.out.println(home + " 출신");
			 
			 String nai = id.substring(0,2); // nai = "23"
			 
			 // 문자열 => 정수 변환해야 연산 가능 
			 
			 int sunai = Integer.parseInt(nai); // age = 23 / 2
			 
			 int age = 0;
			 
			 Calendar c = Calendar.getInstance();
			 int year = c.get(Calendar.YEAR);
			 
//			 203220-434567
// 			 980720-212345
			 
			 if(s=='3' || s=='4'){
				 age = year - (2000 + sunai)+1;
			 }else if(s=='1'|| s=='2') {
				 age = year - (1900 + sunai)+1;
			 }
			 
			 System.out.println(age+"세 입니다.");
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
//			 if(sunai>1999) {
//				 System.out.println(2022-sunai);
//			 }else if(age<2000) {
//				 System.out.println(1900 + sunai);
//			 }
//			 
//			 age = year - (1900 + sunai) + 1;
////			 
////			 System.out.println(age);
			 
			 
			 
			 
			 
			
	}

}
