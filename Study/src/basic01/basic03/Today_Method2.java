package basic03;

public class Today_Method2 {
	
	//  영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하는 checkUpper 메소드 만들기
	//	대문자라면 그대로 반환하는 메소드를 작성
	
	// 인자 : char
	// 리턴(반환) : char

	public static void main(String[] args) {
		
		char a = checkUpper('a');
		System.out.println(a);
		
	}
	
	static char checkUpper(char s) {
		
		if(Character.isLowerCase(s)){s -= 32;} // 인자가 소문자일 경우 대문자로 변환
									// 대문자와 소문자의 아스키코드는 32씩 차이 난다
		return s;
		
	}
	
	

}
