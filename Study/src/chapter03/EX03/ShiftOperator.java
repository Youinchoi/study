package chapter03.EX03;

public class ShiftOperator {

	public static void main(String[] args) {
		/* 산술 Shift (<<,>>) = 총 두 가지
		 - 부호비트는 고정되어 있다
		 - 대량의 계산을 빠르게 처리 할 수 있다 */
		
		
		// << 각 비트를 왼쪽으로 이동
		System.out.println(3<<1);  //3*2^1=6 /  3을 왼쪽으로 1비트 이동해라
		System.out.println(3<<2);  //3*2^2=12 /  3을 왼쪽으로 2비트 이동해라
		System.out.println(3<<3);  //3*2^3=24 /  3을 왼쪽으로 3비트 이동해라
		
		System.out.println(-3<<1); //-3*2^1=-6
		
		// >> 각 비트를 오른쪽으로 이동
		
		System.out.println(5>>1); // 5를 오른쪽으로 1비트 이동해라
		System.out.println(5>>2); // 5를 오른쪽으로 2비트 이동해라
		System.out.println(5>>3); // 5를 오른쪽으로 3비트 이동해라
		
		// 논리 시프트 (>>>) : 오른쪽으로 밖에 못움직임
		System.out.println(3>>>1);
		

	}

}
