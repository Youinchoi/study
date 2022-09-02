package chapter02.EX08;

public class TypeCasting_2 {
	public static void main(String[] args) {
		// 1. 자동 타입 변환 (업캐스팅)
		float value1 = 3;	// int3이 float 타입으로 자동 업캐스팅 됨
		long value2 = 5;	// int5가 long 타입으로 자동 업캐스팅
		double value3=7;	// int7가 double 타입으로 자동 업캐스팅
		byte value4 = 9;	// int9가 byte 타입으로 자동 업캐스팅
		short value5 = 11;	// int11이 short 타입으로 자동 업캐스팅
		
		// 2. 수동 타입 변환 (다운캐스팅)
		byte value6 = (byte)128;	// int ==> byte, -128 
		int  value7 = (int)3.5;		// double ==> int, 3
		float value8  = 7.5f;		// double ==> float,  7.5
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
	}

}
