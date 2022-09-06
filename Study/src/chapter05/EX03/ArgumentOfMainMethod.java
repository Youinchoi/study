package chapter05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		/* main Method의 입력 매개변수 전달하기 / 메소드 (객체지향언어) = 함수
		  - 메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수){ 실행부 }
		  - 				  void main  (String[]  args){ 실행부 }
		  					 (void는 리턴값이 없을 때 사용한다.)
		  					  (args = arguments : 인풋/입력 매개변수)  */
		
		// 메인 메소드 입력 매개변수 args[i] 값을 받아서 각 변수에 할당
		String a = args[0]; // 안녕하세요 
		String b = args[1];	// 3
		String c = args[2];	// 5.8
		
		// 출력 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// = 안녕하세요 3 5.8  <== String[] args 
		
		// 연산 (String) : + (연결연산자)
		
		System.out.println(b + 1 ); // 3(String) + 1(int) = 31 (+s는  연결하기 위함이다.)
		System.out.println(c +1 ); // 5.8(String) + 1(int) = 31 (+s는  연결하기 위함이다.)
		System.out.println("==========");
		
		// 숫자 형식으로 되어있는 String => 정수, 더블형으로 변환
		// Integer.parsrseInt (String 변수)
		// Integer.parseDouble (String 변수)
		
		
		// 연산 (형 변환 후, 연산)
		int d = Integer.parseInt(b);
		double e = Double.parseDouble(c);
		
		System.out.println(d);	// 정수 3
		System.out.println(e);	// 실수 5.8
		
		System.out.println("===형변환 후 연산===");
		
		System.out.println(d+1);	// 정수 + 정수 (값 : 4)
		System.out.println(e+1);	// 정수 + 실수 (값 : 6.8)

	}

}
