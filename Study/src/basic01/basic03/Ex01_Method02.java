package basic03;

public class Ex01_Method02 {

	public static void main(String[] args) {
		
		int sum = add(); // 리턴 값을 받기 위해선 add() 대신 int sum = add()여야 출력가능.
		// 합을 여기서 출력하고싶은데? sum을 불러오면 좋을텐데 
		// 하지만 제어권을 넘기는 순간 메모리가 날아갈텐데... 그렇다면 밑에서 리턴을 붙이라고 해야지
		System.out.println("합 : " + sum);
	}

	static int add() { // 자바의 메인함수가 스태틱이니 스태틱 꼭 붙이기. 자바의 규칙 같은 것 
		int a = 10, b = 20; // 값을 지정
		int sum = a+b;	// sum에 값을 넣어 보관 
		return sum; // add가 비어있어서 에러나니까 void대신 int를 붙이자
	}
	
}
