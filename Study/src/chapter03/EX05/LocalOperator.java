package chapter03.EX05;

public class LocalOperator {
	public static void main(String[] args) {
		
		// 논리 연산자 (&& - AND, || - OR, ^ - XOR, ! - NOT)
		// 연산자 좌측과 우측에는 true나 false가 있어야 함
		
		// AND 연산 : && (좌우 모두 참일 때)
		System.out.println(true&&true);
		System.out.println(true&&false);
		System.out.println(true&&(5<3));
		System.out.println((5<=5)&&(7>2));
		System.out.println("=============");
		
		// OR 연산 : || <= 좌우 중 하나만 true면 true
		System.out.println(true || true); 
		System.out.println(true || false); 
		System.out.println(false || (5<3)); 
		System.out.println((5<=5) || (7>2)); 
		System.out.println("=============");
		
		// XOR 연산 : ^ <= 좌우 중 동일 할 때, false / 다를 때 true
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false ^ (5<3));
		System.out.println((5<=5)^(7>2));
		System.out.println("=============");
		
		// NOT 연산 : ! <= 반대로 출력. false면 true, true면 false
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!false || !(5<3));
		System.out.println((5<=5) || !(7>2));
		System.out.println("=============");
		
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(true|(5>3));
		System.out.println((5<=5)|(7>2));
		System.out.println("=============");
		
		// 숏 서킷 (short circuit) : 
		// 왼쪽의 결과 값만으로 오른쪽의  값을 실행하지 않는 것
		// 논리 연산자에서만 작동됨, 비트연상자에서는 작동 불가 (&,||,^,!)
		// 비트연상자에서는 작동 불가 (&,|,^,!)
		
		// AND 연산에서 숏 서킷일때 발생되는 예제
		//논리 연산에서는 short circuit이 발생됨
		int value1 = 3; 
		System.out.println(false && ++value1 > 6); // short circuit
		System.out.println(value1);
		
		// 비트 연산은 short circuit이 발생 안됨
		int value2 = 3;
		System.out.println(false & ++value2 > 6);// short circuit 모두확인
		System.out.println(value2);
		
		// OR 연산에서 숏 서킷이 발생되는 예제
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true || ++value4 > 6);
		System.out.println(value4);
		
		
	}

}
