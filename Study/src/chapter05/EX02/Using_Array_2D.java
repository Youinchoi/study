package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D {

	public static void main(String[] args) {
		// 2차원 배열을 출력 
		
		int[][] arr1 = new int [][] {{1,2,3,4,5},{6,7},{8,9,10},{11,12,13}};
		System.out.println(arr1[0][0] + " " + arr1[0][1] + " " + arr1[0][2] + " " + 
				arr1[0][3] + " " + arr1[0][4]);	
		System.out.println(arr1[1][0] + " " + arr1[1][1]);
		System.out.println(arr1[2][0] + " " + arr1[2][1] + " " + arr1[2][2]);
		System.out.println(arr1[3][0] + " " + arr1[3][1]);
		
		System.out.println("=============");
		System.out.println(arr1.length);  //(행의 갯수)
		System.out.println("=============");
		System.out.println(arr1[0].length);  // (0행의 열의 갯수)
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);
		
		System.out.println("=============");

		//for문 출력
		
		for(int i = 0; i<arr1.length; i++){	// i는 행의 index 번호
			for (int k = 0; k <arr1[i].length;k++) {  // k는 열의 index 번호
				System.out.print(arr1[i][k]+" ");
			}
		}
		
		System.out.println();
		System.out.println("=============");
		
		for(int[]i:arr1) {	
			for(int b : i) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============");
		
		//  4. Arrays.toString <== 1차원 배열의 값을 출력
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		
		
	}

}
