package chapter02.EX02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		
		/*변수의 이름 부여 : 변수는 값을 변경 가능
		 * (변수 름을 영문, 
		 - 첫자는 소문자
		 - 특수문자  : _ , $
		 - 첫자에 숫자는 올 수 없음
		 - Java의 Keyword(예약어)는 올 수 없다.  (int, double, String 등등...)
		 */
		
		
		boolean aBcD; //aBcD변수에 True, False
		aBcD =   true;
		System.out.println(aBcD); //True
		aBcD =	false;
		
	System.out.println(aBcD); //JFar
	System.out.println();
	
	byte 가나다 ; // 사용은  가능하나 원장 사항이 아님
	short _abcd; // 특수문자는$ , _ 사용가능
	char  $ab_cd;
	double  main; //메소드 이름을 변수 이름으로 사용 가능,
				  //사용방법이  달라서 사용가능
					// 예약어를 변수명으로 사용하면 오류 발생
					//class, int, double, char, byte
	
	String myClassName ;  // 첫 단어는 소문자, 여러 단어가 있을때 첫단어 대문자.
	

		/*
		 상수의 이름부여 : 상수는 값을 변경 불가능
		 	- 대문자로 처리
		 	- 변수 선언문 앞에 final 키워드사용
		 */

	double PI; // 앞에 final을 붙이면 에러가 남, 상수엔 대문자, 변수엔 소문자 필요 / 상수에 소문자를 쓸 순 있는데, 다른 개발자가 변수로 착각 가능
	PI = 3.141592; //변수에 final을 붙이면 이 변수는 수정할 수 없다는 의미를 가집니다
	
	System.out.println(PI);
	
	PI = 1234.00;	//(상수는 한번 값을 주면 다른값으로 수정 불가)
	System.out.println(PI);
	
	final int MY_DATA ; //상수(대문자+언더바) (규칙)
	int myData ; 		//변수
	
	
	
	}

}
