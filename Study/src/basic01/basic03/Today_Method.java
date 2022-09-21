package basic03;

public class Today_Method {
	
	// 소문자 입력시 true, 아닐시 false 반환하는 checkLower 메소드 만들기
	// 인자 : char
	// 리턴(반환) : boolean
	
	public static void main(String[] args) {
		
		boolean a = checkLower('A'); // 참 또는 거짓의 값을 갖는 'boolean' 자료형으로 리턴받기
									 // 인자를 char로 설정했으니 ""가 아닌 ''를 사용
		System.out.println(a);		 // 출력
		
	}

	static boolean checkLower(char s) { 
	// 메인 함수와 소통되게끔 boolean으로 자료형을 통일 + checkLower함수 입력 + 인자를 char로 설정
		if(Character.isUpperCase(s)) return false; // 만약 대입한 문자가 대문자이면 '거짓'을 반환하도록 한다
		else return true;	// 그 외의 경우 (소문자일 경우), '참'을 반환한다
		
		// 이렇게 설정한 후, 리턴 값은 메인 함수에서 출력될 것
	}
	 
	
	
}


