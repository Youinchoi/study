package basic03;

// 참조 자료형 : call by reference 로 동작 (Array, Class Instance, String) 

public class Ex03_CallbyReference {
	
	// Call by reference는 메서드 호출 시에 사용되는 인자가 값이 아닌 주소(Address)를 넘겨줌으로써, 
	// 주소를 참조(Reference)하여 데이터를 변경할 수 있음

	// '참조를 직접 넘기기 때문'에 호출자의 변수와 수신자의 파라미터는 '완전히 동일한 변수'이다

	// 메서드 내에서 파라미터를 수정하면 그대로 원본 변수에도 반영됨
	
	// 해당 객체의 주소값을 직접 넘기는 게 아닌!! 객체를 보는 또 다른 주소값을 만들어서 넘기다는 사실!!
	

	public static void main(String[] args) {
		// 클래스와 배열은 참조형 
		// 주소가 넘어가 원본을 수정할 수 있게 됨 
		
		StringBuffer a = new StringBuffer("안녕");
		StringBuffer b = new StringBuffer("hi");
		
		add(a,b);
		System.out.println("A=" + a + ",B=" + b); // A = 안녕, B = hi
	}
	
//	"Reference Type 은 주소값을 넘겨 받아서 같은 객체를 바라본다" 
//   "그래서 변경하면 원본 변수에도 영향이 있다"
	
	static void add(StringBuffer a, StringBuffer b) { 
	// StringBuffer 클래스에서는 문자열 끝에 문자열을 추가할 수 있는 append 함수를 제공
		a.append(b);
		System.out.println("A=" + a + ",B=" + b); // A = 안녕, B = hi
	}

}


/* 문자열 처리 클래스
 * - String
 * - StringBuffer / StringBuilder
 */
