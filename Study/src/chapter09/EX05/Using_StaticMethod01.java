package chapter09.EX05;

// 메소드 이름 앞에 static이 없는 메소드 : 인스턴스 메소드 (객체 생성 후 호출가능)
// 메소드 이름 앞에 static이 있는 메소드 : 정적 메소드 (객체 생성 후 호출 가능, 없어도 가능)

class A{
	void abc() {
		System.out.println("인스턴스 메소드");
		
	}
	static void bcd() {
		System.out.println("정적 메소드");
	}
	
}

public class Using_StaticMethod01 {

	public static void main(String[] args) {
		// 객체 생성없이 바로 호출 : 정적 메소드 
//		A.abc();  <== 인스턴스 메소드 (객체 생성 후, 객체명으로 호출해야 함)
		A.bcd();
		
		// 객체 생성 후 호출
		System.out.println("=================");
		A a = new A();
		
		a.abc();	// 인스턴스 메소드
		a.bcd();	// 정적 메소드 
		
		
	}

}
