package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		/* char data type : 하나의 문자만 저장
		- 문자, 숫자, 유니코드로 저장 가능
		- 작은 따옴표를 사용해서 저장 
		- 유니코드 (2byte) 전 세계의 모든 문자를 16진수로 표기한 방식*/
		
		// 1. 문자로 저장하는 방법
		
		char value1 = 'A'; //두글자면 문자열이기 때문에 String을 사용해야함
		char value2 = '가';
		char value3 = '3';
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===========");
		
		// 2. 정수로 저장하는 방법
		char value4 = 65;   // A <== 65
		char value5 = 0xac00;  // 0x는 16진수를 표현, '가'를 표현
		char value6 = 51;  // 3 <== 51
		
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("===========");
		
		// 3. 유니코드 형식으로 저장 (\\u 유니코드) : 따옴표를 사용
		char value7 = '\u0041';	//A
		char value8 = '\uac00';	//가
		char value9 = '\u0033';	//3
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		System.out.println("===========");
		
		char value100 = 35;  //아스키 코드 참고'#'
		char value101 = '\uAC12'; // '값'
		
		System.out.println(value100);
		System.out.println(value101);
		
		//4. 자기 이름 유니코드
		
		char value31 = '\ucd5c';
		char value32 = '\uc720';
		char value33 = '\uc778';
		
		System.out.print(value31);
		System.out.print(value32);
		System.out.println(value33);
		
		System.out.println("===========");
		
		// 문자 A를 저장하는 다야한 방법
		char a = 'A'; 	// A는 10진수로 65다
		char b = 65; 	// (정수로 저장, 10진수)
		char c = 0b1000001;   // 0b뒤에 오는 값은 2진수이다
		char d = 0101;		// 0뒤에 오는 값은 8진수
		char e = 0x41;	// 0x뒤에 오는 값은 16진수
		char f = '\u0041';	// 유니코드로 값을 할당
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		
		
	}

}
