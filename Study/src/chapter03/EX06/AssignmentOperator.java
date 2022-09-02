package chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		// 대입 연산자의 축약 표현
		
		/* 산술 연산의 축약표현
		 * a=a+b	-> a+=b
		 * a=a-b	-> a-=b
		 * a=a*b	-> a*=b
		 * a=a/b	-> a/=b
		 *
		 * 비트 연상의 축약표현
		 * a=a&b	-> a&=b
		 * a=a|b	-> a|=b
		 * 
		 * 쉬프트 연산의 축약표현
		 * a=a>>b	-> a>>=b
		 * a=a>>b	-> b<<=b
		 * 
		 * 논리 쉬프트 연산의 축약표현
		 * a=a>>>b	-> a>>>=b
		 */
		
		int value1 = 3;
		value1 = value1+3;	//대입연산자는 제일 나중에 적용 
		System.out.println(value1);
		System.out.println("==========");
		
		int value2=1; //변수선언 및 값 할당
		
		System.out.println(value2+=2); //value2=value2+2
		System.out.println(value2-=2); //value2=value2-2
		System.out.println(value2*=2); //value2=value2*2
		System.out.println(value2/=2); //value2=value2/2
		System.out.println(value2%=2); //value2=value2%2(의 나머지 값)
		System.out.println("==========");
		System.out.println(value2<<=2); //value2=value2<<2
		System.out.println(value2>>=2); //value2=value2>>2
		
		
		
		
	}

}
