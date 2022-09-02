package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		
		/* 1. 캐스팅 방법
		 - 캐스팅  방법 1 (데이터 타입을 명시)*/
		
		int value1 = (int)5.3;  // 0.3이 삭제가 됨. 값의 손실이 발생
		long value2 = 10;		// int 10이 long형으로 자동 업캐스팅	
		float value3 = (float)5.8;	// 실수(오른쪽)는 전부 더블인데 다운캐스팅 필요 / 더블 5.8을 플롯으로 다운캐스팅
		double value4 = 16;		// 업캐스팅은 자동으로 일어남, int16을 double형으로 업캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		// 2. 캐스팅 방법 (L, F)
		// 정수는 리터럴이 기본 int, 실수는 리터럴이 double
		
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
	}

}
