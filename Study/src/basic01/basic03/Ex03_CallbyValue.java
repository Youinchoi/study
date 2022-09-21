package basic03;

// 기본 자료형 : call by value 로 동작 (int, short, long, float, double, char, boolean)

public class Ex03_CallbyValue {
	
	// Call by Value 는 메서드를 호출할 때 값을 넘겨주기 때문에 Pass by Value 라고도 부릅니다.

	// 메서드를 호출하는 호출자 (Caller) 의 변수와 호출 당하는 수신자 (Callee)의 파라미터는 
	// '복사된 서로 다른 변수'입니다.

	// '값만' 전달하기 때문에 수신자의 파라미터를 수정해도 호출자의 변수에는 아무런 영향이 없습니다.



	public static void main(String[] args) {
		
		// 기본형을 함수의 인자로 보내는 것이 CallbyValue. 
		// add로 받아 기본값으로 장난친다음 다시금 위로(main 함수 쪽으로) 보내도 원본에 영향을 미치지 않음 
		
		int a = 10, b = 20; 
		add(a,b);
		System.out.println("A=" + a + ",B=" + b); // A = 10, B = 20
		// 후출력
		
	}

	static void add(int a, int b) { // int a,b가 올 공간 확보 먼저, 위에 지정한 값도 그대로 복사됨
		a+=b; // a=b+a (30), a = 30 /  b = 20
		System.out.println("A=" + a + ",B=" + b); // ? A = 30, B = 20
		// 선출력
	}
	
	
}
