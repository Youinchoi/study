package chapter05.EX01;

import java.util.Arrays;

public class Using_Array4 {

	public static void main(String[] args) {
		/* 배열 : 하나의 [배열] 변수에 여러개의 값을 넣는다. / Array는 참조자료형이다.
		 * 참조자료형 변수는 Stack에 저장, 배열 내 값은 Heap 메모리에 저장
		 * 				= 변수의 Heap영역의 주소값이 들어있다.
		 * 기본자료형 변수는 변수와 값 모두 Stack에 저장되어있다.
		 (boolean byte short int long float double char)
		 
		 * 기본자료형 배열 변수 : 
		 * 참조자료형 배열 변수 : String
		 */
		

		// 1. 동일한 자료형의 값을 갖고있다. 
		// 2. 방의 갯수를 변경할 수없다.
		
			// Heap 공간에는  반드시 값이 들어 있어야 한다.
			// 초기 값을 넣지 않는 경우 JBM이 자동으로 넣는다.
		   // 정수 :0 , 실수 0.0 boolean : false
		// 참조 자료형인 경우 JVM이 자동으로
		
		
	    // 배열 선언과 초기화
		
		int [] a = new int[5];
		
		//int 배열변수([])에 a를 생성
		// new : Heap 공강네 int  배열방 5개를 생성해서 Heap뤼 주소를 a변 후에 
		
		//2. 방의 값을 입력
			// index (방) = 직겁 값을 대입
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		// 직접 출력
		System.out.println("========직접출력========");
		
	    System.out.println(a[0]);
	    System.out.println(a[1]);
	    System.out.println(a[2]);
	    System.out.println(a[3]);
	    System.out.println(a[4]);
	    
	    System.out.println("========for를 사용하여 값을 입/출력========");
		
	    // 입력
		for(int i = 0, j =100; i<5; i++, j+=100) {
			a[i] = j;
		} //  a[0] = 100, a[1] = 200, a[2] = 300, a[3] = 400, a[4] = 500
		
		// 출력
		for (int i = 0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("========a.length를 사용하여 입/출력========");
		 
		System.out.println(a.length);  // 배열방의 갯수를 출력
		
		// 각 방의 값을 입력
		for(int i = 0, j =1000; i<a.length; i++, j+=100) {
			a[i] = j;
		} for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		// 3. 배열 방의 정보를 출력 (Enhanced For : 배열의 저장된 모든 값을 출력)
		
		System.out.println("========향상된 for문=========");
		
		for(int k : a) {
			System.out.println(k);
		}
		
		// 4. 출력 Arrays.toString(a) : Arrays 객체의 toString() 메소드(함수)
		// 대괄호 안에 출력됨
		
		System.out.println("========Arrays.toString을 사용=========");
		System.out.println(Arrays.toString(a));
		
		
		
	}

}
