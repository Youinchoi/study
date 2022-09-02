package chapter05.EX01;

public class Using_Array7 {

	public static void main(String[] args) {
		
		// 배열 변수의 값 대입 방법 (1)
		//  - 배열을 선언=> 초기화 => 값을 대입
		//  - 선언과 초기화를 분리할 수 있다.
		
		int [] arr1 = new int [3];	// 선언
		
		arr1[0] = 3;	// 초기화
		arr1[1] = 4;
		arr1[2] = 5;
		
		// 대입 방법 (2)
		//  - 배열을 선언과 동시에 값을 할당 (주의 : 방의 갯수를 지정하면 오류가 남)
		//  - 선언과 초기화를 분리할 수 있다.
		
		int [] arr2 = new int [] {1,2,3,4,5,6,7,8,9,10};
				
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("=====================");
		
		
		int [] arr22;
		arr22 = new int [] {22,33,44,55};
		
		for(int i = 0; i<arr22.length; i++) {
			System.out.print(arr22[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("=====================");
		
		// 대입 방법 (3)
		//  - new int []를 생략하고 바로 값을 넣을 수 있다.
		//  - 선언과 초기화를 분리할 수 없다.
		
		int [] arr3 = {11,12,13,14,15};
		
		for(int i = 0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		
		// int [] arr33 ;
		// arr33 = {77,88,99};	<== 분리해서 적으면 오류발생 
		
		

	}

}
