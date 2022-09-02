package chapter02.EX04;

public class DataType {

	public static void main(String[] args) {
		/*
		 자바의 자료형
		 	- 기본 자료형 8가지 : 첫자가 소문자
		 		- boolean : true, false	
		 		- byte 	  : 정수  (1byte = 8bit), -2^7  ~ + 2^7-1까지만 삽입가능
		 								  		 범위 = (-128 ~ 127)
		 		- short   : 정수  (2byte = 16bit)
		 						-2^15  ~ + 2^15-1까지만 삽입가능
		 						범위 = (-32,768 ~ 32,767)
		 		- long    : 정수  (8byte = 64bit), 값을 할당할때 1234L (이런 식으로 대문자L을 붙임)
		 						-2^63  ~ + 2^63-1까지만 삽입가능
		 		- int     : 정수  (4byte = 32bit)
		 						-2^31  ~ + 2^31-1까지만 삽입가능
		 		- float   : 실수  (4byte), 값을 할당할때 123.45F (이런 식으로 대문자F를 붙임)
		 		- double  : 실수  (8byte) 이쪽이 기본 명령어
		 		- char    : 한문자, 작은 따옴표 사용 ('')
		 		
		 	- 참조 자료형 무한대 : 첫자가 대문자 <String은 기본자료형이 아닌 "참조자료형"이다.>
		 		- String : 문자열, 큰 따옴표 사용 ("")
		 			배열, 클래스(는 첫자 대문자)/인터페이스, 
		 	
		 */

		boolean aaa; 	// true, false 둘 중 하나 넣기
		aaa=true;
		System.out.println(aaa);
		
		byte bbb; 		// 정수 값만 할당 가능, 1byte = 8bit
		bbb=100; 		//(-128 ~ 127 <== 의 범위의 숫자만 삽입가능)
		System.out.println(bbb);
		
		byte bb;
	//	bb=(byte)128;			// byte 범위를 넘겨서 입력 오류가 남, (byte)를 캐스팅해주면 괜찮아짐
		bb=(byte)128;
		System.out.println("bb의 출력값"+bb);
		
		byte cc;
		cc=(byte)129;
		System.out.println("cc의 출력값"+cc);
		
		short ccc;
		ccc = -32767;	// (-32768 ~32767의 범위의 숫자만 삽입가능)
		System.out.println(ccc);
		
		short abc;
		abc=23767;		//short 변수의 마지막
		abc=(short)32768;
		System.out.println("abc 변수의 출력값"+abc);
		
		
		int ddd;
		ddd=1234567891;
		
		System.out.println(ddd);
		
		long eee;		// long 값을 넣을땐 L을 붙여야 함
		eee=1234567891234567890L;
		
		
	}

}
