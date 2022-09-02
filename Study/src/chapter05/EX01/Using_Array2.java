package chapter05.EX01;

import java.util.Arrays;

public class Using_Array2 {

	public static void main(String[] args) {
		/* Array (배열)
		 * 참조 변수를 선언 후, 초기화 하면 값이 자동으로 등록됨
		 * [정수 : 0, 실수 : 0.0, String : null, boolean : false]가 기본 값이 된다.
		 * Heap 영역에는 값이 반드시 할당되어 있어야 한다.
		 
		   1. 배열 선언 및 초기화 */
		
		double [] d = new double[6];
			// Heap 영역의 double방 6개 생성 후, 주소값을 d 변수에 할당해라.
		
		// 2. 배열의 값을 할당
		
		d[0] = 10.5;
		d[1] = 20.5;
		d[2] = 30.5;
		d[3] = 40.5;
		d[4] = 50.5;
		d[5] = 60.5;
		
		// 3. 배열 방의 값을 출력
		
		// 3-1. 직접 출력
		System.out.println(d[1]);
		System.out.println(d.length); // 배열방의 갯수가 출력됨
		System.out.println("==============");
		
		// 3-2. for문을 사용하여 출력
		for(int i=0; i<d.length; i++) { // length는 6이고, 6보다 작을 때까지 출력됨
			System.out.println(d[i]);
		}
		System.out.println("==============");
		
		// 3-3. for문을 사용하여 원하는 방의 값만 출력
		for(int i = 3; i < 6; i++) {
			System.out.println(d[i]);
		}
		System.out.println("==============");
		
		// 3-4. 향상된 for문
		for(double k : d) {
			System.out.println(k);
		}
		
		System.out.println("==============");
		
		// 3-5. Arrays.toString(d); 사용
		System.out.println(Arrays.toString(d));
		
		

	}

}
