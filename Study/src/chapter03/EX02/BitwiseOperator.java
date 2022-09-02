package chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		// bit 연산
		// 자바  메서드를 사용해서 진법변환 (2,8,16 진수)
		
		int data = 13;
		
		// Integer 객체의 함수를 사용 (총 32bit, 4byte, int)
		// -- toBinaryString (입력값) : 10 => 2진수
		
		System.out.println(Integer.toBinaryString(data)); //정수를 2진수로
		System.out.println(Integer.toOctalString(data)); //정수를 8진수로
		System.out.println(Integer.toHexString(data)); //정수를 16진수로
		System.out.println("============");
		
		// 2진수, 8진수, 16진수의 값을 10진수로 변환
		System.out.println(Integer.parseInt("1101",2)); //2진수 =>10진수
		System.out.println(Integer.parseInt("15",8)); //8진수 =>10진수
		System.out.println(Integer.parseInt("d",16));  //16진수 =>10진수
		System.out.println("============");
		
		// 다양한 진법 표현
		System.out.println(13); 
		System.out.println(0b1101); //0b : 2진수
		System.out.println(015); //0b : 8진수
		System.out.println(0xd); //0x : 16진수
		System.out.println("============");
		
		//비트연산자 And : & (10진수를 2진수로 변환 후, 두 비트를 연산)
		System.out.println(3&10);
		System.out.println(0b0011&0b1010);
		System.out.println(0x3 & 0xA);
		System.out.println("============");
		
		//비트연산자 Or : | (비트 중 하나라도 1이 존재할 경우, 결과 1)
		System.out.println(3|10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x3 | 0xA);
		System.out.println("============");
		
		//비트연산자 XOR : (두 비트가 동일할 때 : 0, 다를 때 :1)
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x3 ^ 0xA);
		System.out.println("============");
		
		//비트연산자 NOT : ~ <===  0일때 1, 1일때 0 (반대)
		//MSB (부호비트 : 체일 앞쪽에 위치한 비트
		// 0 : +1 , 1 : -1
		//+일땐 1의 값을 기준으로 값을 부여함
		//-일땐 0의 값을 기준으로 값을 부여하고 +1험
		
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x3);
		System.out.println("============");
		
		System.out.println(~100);
		System.out.println(~0b01100100);
		System.out.println(~0x100);
		System.out.println("============");
		
		
		int abc = 123;	//10진수
		int bcd = 0123;	//8진수
		int efg = 0x123;//16진수
		
		System.out.println(abc);
		System.out.println(bcd);
		System.out.println(efg);
		
		
		
		
	}

}
