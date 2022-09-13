package chapter07.EX04;

class A{
	int m;
	int n;
	
	void init (int a, int b) {
		int c;
		c=3;
		this.m=a;	// 원래 this는 생략되어있다.
		this.m=b;	// 자신 객체의 필드를 뜻함. but 지역변수에 this를 붙이지 않는다.
	}
	
	void work() {
		init(2,3); // init 앞에 this 생략되어있음
		System.out.println(this.m+","+this.n); // m과 n 앞에 this 생략됨
	}
	
}



public class This_Keyword {

	public static void main(String[] args) {
		
		// This Keyword : 클래스의 생성자나 메소드 내부의 필드 & 메소드에 컴파일러가 자동으로 할당해줌
		// 객체 자신을 뜻함. 필드와 메소드를 선언시 this 키워드 사용불가
		// 필드와 메소드가 클래스의 메소드 내에서 사용시 컴파일러가 자동으로 생성됨 (기본적으론 생략되어 있음)
		// 메소드나 생성자에서 인풋 매개변수 이름, 필드이름이 동일 할 경우 명시
		
		
		// This Method : 클래스 내에서 다른 생성자를 호출, 생성자에서 사용됨, 생성자의 첫 라인에 와야함
		
		
		
	}

}
