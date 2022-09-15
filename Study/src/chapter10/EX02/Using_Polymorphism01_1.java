package chapter10.EX02;

import chapter08.EX01.C;

class Aa {
	int a = 10;
}

class Bb extends Aa {
	int b = 20;
}

class Cc extends Bb {
	int c = 30;
}

class Dd extends Bb {
	int d = 40;
}


public class Using_Polymorphism01_1 {

	public static void main(String[] args) {
		
		// 다형적 표현
		
		Aa a1 = new Aa();
		System.out.println(a1.a);
		
		Bb b1 = new Bb();
		System.out.println(b1.a);
		System.out.println(b1.b);
		
		
		// 자식 객체를 생성시 부모 타입으로 지정하면 부모의 필드와 메소드만 접근이 가능하다 
		// = 좌와 우는 타입이 같아야 한다
		// 업캐스팅 : 자식 타입을 부모 타입으로 변환 (명시하지 않더라도 컴파일러가 자동으로 등록)
		
		Aa a2 = new Bb();
		System.out.println(a2.a); // B는 A다 
		
		// 다운캐스팅 : 부모타입을 자식 타입으로 변환 (수동으로 명시) 
		System.out.println("=== Aa 타입의 객체 a2를 Bb 타입으로 다운캐스팅 ===");
		Bb b2 = (Bb) a2;
		System.out.println(b2.a);	// Aa 필드
		System.out.println(b2.b);	// Bb 필드
		
		// 업캐스팅
		Aa a3 = b2;
		System.out.println(a3.a);
		// 다운캐스팅
		Bb b3 = (Bb) a3;
		System.out.println(b3.a);
		System.out.println(b3.b);
		
		System.out.println("===================");
		
		Aa a5 = new Dd();
		System.out.println(a5.a);
		
		System.out.println("===================");
		
		Bb b10 = (Bb) a5;
		System.out.println(b10.a);
		System.out.println(b10.b);
		
		System.out.println("===================");
		
		Dd d10 = (Dd) b10;
		System.out.println(d10.a);
		System.out.println(d10.b);
		System.out.println(d10.d);
		
		System.out.println("===================");
		
		Dd d11 = (Dd) a5;
		System.out.println(d11.b);
		System.out.println(d11.a);
		System.out.println(d11.d);
		
		System.out.println("===================");
		
		// 업캐스팅
		
		Aa a20 = d11;
		System.out.println( );
		
		Cc c = new Cc();
		System.out.println(c.c);
		
		Dd d = new Dd();
		System.out.println(d.d);
		
	}

}
