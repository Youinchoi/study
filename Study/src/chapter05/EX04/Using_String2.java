package chapter05.EX04;

public class Using_String2 {

	public static void main(String[] args) {
		// String 변수에 값을 할당하는 방법
		
		/* 1. 객체 생성 방법으로 값을 할당 (생성자) + 별도의 주소 공간에 값을 할당 (동일한 문자열인 경우)
		 * 2. 리터럴 방식으로 값을 할당 + 주소 공간을 공유 (동일한 문자열일 경우)
		 * == : 스택 공간의 값을 비교 / 참조 자료형인 경우 : Stack (주소), Heap (값)
		 *                      / 기본 자료형인 경우 : Stack 공간에 값이 들어가 있다.) 
		 		equals() : 참조 자료형일때, 힙 영역의 값을 비교
		 */
		
		String str1 = new String ("안녕");	//
		String str2 = "안녕";
		String str3 = "안녕";
		String str4 = new String("안녕");		//
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("================");
		
		// == : 참조 자료형일 경우, Stack의 Heap 영역의 주소와 비교
		
		System.out.println(str1==str4); // false
		System.out.println(str2==str3); // True
		
		System.out.println("================");
		
		// equals () : 참조 자료형의 힙영역 값을 비교
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str4));
		System.out.println(str3.equals(str4));
		
	}

}
