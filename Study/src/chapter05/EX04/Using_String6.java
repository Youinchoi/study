package chapter05.EX04;

import java.util.Arrays;

public class Using_String6 {

	public static void main(String[] args) {
		/*  String의 다양한 메소드
		
		 	5. 문자열 수정 (toLowerCase(), toUpperCase())
		 					소문자 변환      대문자 변환      */
		
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); // 전부 소문자로 출력
		System.out.println(str1.toUpperCase()); // 전부 대문자로 출력
		
		System.out.println("=================");

		// replace (원본, 수정) = 원본을 수정으로 변환해라
		String str2 = str1.replace("Study", "공부");
		
		System.out.println(str1.replace("Study", "공부")); // 출력 : Java 공부
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("=================");
		
		// substring = 글자를 잘라서 출력 / (0,5)인 경우... 0(시작점)은 포함, 5(끝점)는 미포함
		System.out.println(str1.substring(0,5)); // index 0부터 index 5 앞 까지 잘라라
												 // 출력값 : Java
		
		System.out.println(str1.substring(3,8)); // 출력값 : a Stu
		System.out.println(str1.substring(5)); // 출력값 : Study (index 5번 방 부터 뒤로 모두 자름)
		
		System.out.println("=================");
		
		// split () : 특정 문자를 기준으로 잘라서 배열에 저장 (*중요!!)
		String [] strArr1 = "abe/def-ghi jkl".split("/|-| ");
		
		for(int i = 0; i<strArr1.length; i++) {
			System.out.print(strArr1[i] + " ");
		}
		
		System.out.println();
		
		for(String k : strArr1) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(strArr1));
		
		// 공백을 기준으로 모두 잘라서 배열에 저장 후 출력 (for, Enhanced for, Arrays.toString)
		
		String [] aa = "오늘은 날씨가 매우 맑습니다. 참 화창한 날씨입니다".split(" ");
		
		// for문
		for(int j = 0; j<aa.length; j++) {
			System.out.println(aa[j] + " ");
		}
		System.out.println();
		
		// enhanced for문
		for(String l : aa) {
			System.out.println(l + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(aa));
		System.out.println();
		
		System.out.println("=================");
		System.out.println();
		
		// trim() : 좌우의 공백을 제거
		System.out.println("    abc   ".trim());
		
		System.out.println();
		
		// 6. 문자열 비교 ( == ) : 참조 자료형일때 Stack의 주소값을 비교 
		String str3 = new String ("Java");
		String str4 = new String ("Java");
		String str5 = new String ("java");
		
		System.out.println(str3 == str4); // false <== 주소를 비교 
		System.out.println(str4 == str5); // false
		System.out.println(str5 == str3); // false
		
		// equals() : Heap 메모리의 값을 비교 (대소문자 구분)
		System.out.println(str3.equals(str4)); // True
		System.out.println(str4.equals(str5)); // False
		System.out.println(str4.equalsIgnoreCase(str5)); // equalsIgnoreCase : 대소문자 구별없이 출력
		
		
		
	}

}
