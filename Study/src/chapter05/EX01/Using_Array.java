package chapter05.EX01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Using_Array {

	public static void main(String[] args) {
		/* 기본 자료형인 경우, RAM의 Stack 영역에 변수와 값이 함께 저장됨
		 * 참조 자료형인 경우, RAM의 Stack 영역에 변수명이 저장됨
		 				  Heap 영역에 변수의 값이 저장됨
		   배열 (Array) : 하나의 [배열] 변수에 여러개의 값을 할당
		   1. 동일한 자료형의 값을 할당 가능
		   2. 배열의 방의 크기를 지정하면 수정이 불가능					*/
		
		// 배열 변수 a를 선언
		int[] a = new int[5];	// a는 참조 변수이다. (참조 주소값을 갖고 있다.)
			// 배열 a 변수의 방의 크기를 5개 생성 후, 주소 값을 a에 할당해라 
			// 방 번호를 [index]0~4 방까지 Heap 영역에 생성됨
		 	// new : Heap 영역의 방을 5개 생성해서 Heap 번지를 a변수에 할당해라
		
		// 배열 변수의 값을 할당
		a[0] = 10; // Heap 영역의 index 0방에 정수 10을 넣어라
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// 직접 배열 방의 값을 출력
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("=======================");
		
		// for문을 사용하여 배열방의 값을 출력
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=======================");
		System.out.println("배열변수 a 방의 갯수 : " + a.length); // 배열방의 총 갯수를 출력
		System.out.println();
		
		System.out.println("===for문에서 a.length를 사용하여 출력===");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=======================");
		
		System.out.println(a); 		//Heap 메모리의 주소
		
		System.out.println("=======================");
		
		// 향상된(enhanced) for문으로 배열의 모든 값을 출력
		// -- 배열의 모든 방을 순환하면서 출력
		// -- 배열의 모든 값을 한꺼번에 출력
		for(int k:a) {
			System.out.println(k);
		}
		
		System.out.println("=======================");
		
		// Arrays.toString(a)로 출력
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("=======================");
		
		
		
		
	}

}
