package chapter05.EX02;

public class Using_Non_Rectangle_Array {

	public static void main(String[] args) {
		// 비정방형 배열 : 각 행에 대해서 열의 갯수가 다를때
		
		// 1. 비정방형 배열 선언 후, 방 크기를 생성하고 값 할당 
		int[][] arr1 = new int[2][];	// 행의 갯수만 지정, 열의 갯수는 나중에 지정
		arr1[0] = new int[2];	// 0번째 행의 열의 갯수 2개를 지정
		arr1[0][0] = 1;
		arr1[0][1] = 2;
		
		arr1[1] = new int [3];	// 첫번째 행의 열의 갯수를 지정
		arr1[1][0] = 3;
		arr1[1][1] = 4;
		arr1[1][2] = 5;
		
		System.out.print(arr1[0][0] + " " + arr1[0][1]);
		System.out.println();
		System.out.println(arr1[1][0] + " " + arr1[1][1] + " " + arr1[1][2]);
		System.out.println();
		
		// 2. 비정방형 배열 선언시 값을 할당
		
	   int[][] arr2 = new int[2][3];	// 비정방형 배열 선언: 형의 갯수만 먼저 선언, 열은 선언x
	   arr2 [0] = new int[] {1,2};	// 0의 값을 바로 할당 (주의 : 방크기를 지정하면 오류)
	   arr2 [1] = new int[] {3,4,5};	// 1행의 값을 바로 할당 
	   
	    System.out.print(arr2[0][0] + " " + arr2[0][1]);
		System.out.println();
		System.out.println(arr2[1][0] + " " + arr2[1][1] + " " + arr2[1][2]);
		System.out.println();
		
		// 3. 비정방형 배열 선언시 값을 할당
		int [][] arr3 = new int[][] {{1,2},{3,4,5}};
		
		System.out.print(arr3[0][0] + " " + arr3[0][1]);
		System.out.println();
		System.out.println(arr3[1][0] + " " + arr3[1][1] + " " + arr3[1][2]);
		System.out.println();
		
		int [][] arr4;  // 선언, 초기화, 값 할당 분리
		arr4 = new int[][] {{1,2},{3,4,5}};
		
		System.out.print(arr4[0][0] + " " + arr4[0][1]);
		System.out.println();
		System.out.println(arr4[1][0] + " " + arr4[1][1] + " " + arr4[1][2]);
		System.out.println();
		
		// 4. 비정방형 배열 선언시 값을 할당 (선언과 초기화 분리 불가)
		int[][] arr5 = {{1,2},{3,4,5}};
		
		System.out.print(arr5[0][0] + " " + arr5[0][1]);
		System.out.println();
		System.out.println(arr5[1][0] + " " + arr5[1][1] + " " + arr5[1][2]);
		System.out.println();
		
		
		
		
	}

}
