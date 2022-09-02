package chapter02.EX01;

public class UsageOfDataType {
	public static void main(String[] args) {
		
		// # 변수 선언과 동시에 값 대입
		int  a = 10;
		System.out.println(a);
		
		// # 변수 선언 후, 변수의 값을 대입
		int b ; //변수 선언, Java는 비어있는 상태가 됨. 
				// (C언어와는 다름. 변수를 선언만 했을때, garbage값이 들어감)	
		b=30; 	//값 할당
		System.out.println(b);
		
		
	}

}
