package chapter09.EX04;

// static 접근 제어자 : 필드, 메소드 앞에 설정 
// - 객체 생성 없이 사용가능, 객체 생성후에도 사용가능 
// - 모든 객체에서 공유되는 필드 
// 인스턴스 필드 : Heap 영역에 변수와 값이 저장되어 있다
// 정적 필드 : 클래스 영역에 변수와 값이 저장되어 있으며, Heap영역에서는 클래스 영역의 값을 가리킨다


public class A {
	int m = 3;	// 인스턴스 필드 : 객체를 생성 후 사용가능 
	static int n = 5;	// 정적(static) 필드 : 객체 생성없이 사용가능
						// 모든 객체가 공유하는 필드 
	
	void print() {
		System.out.println(m+","+n);
	}
	
	
}
