package chapter05.EX02;

import java.util.Arrays;

public class Using_Array_2D_2 {

	public static void main(String[] args) {
		
		String [][] arr1 = new String[][] {{"홍길동","이순신","세종대왕"},
				{"독수리","부엉이","닭","오리"},{"붕어","가물치","잉어"},
				{"호랑이","사자"}};
		String arr2 [] = {"사람이름 : ","새 이름 : ", "물고기 이름 : ", "포유류 이름 : "};		
				
		System.out.println(arr1[0][0] + " " + arr1[0][1] + " " + arr1[0][2]);
		System.out.println(arr1[1][0] + " " + arr1[1][1] + " " + arr1[1][2] +" " + arr1[1][3]);
		System.out.println(arr1[2][0] + " " + arr1[2][1] + " " + arr1[2][2]);
		System.out.println(arr1[3][0] + " " + arr1[0][1]);
		
		System.out.println("====================");
		
		// for문
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr2[i]);
			for(int j = 0; j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		// 향상된 for문
		int i =0;
		for(String[] ar : arr1) {
			System.out.print(arr2[i++]);
			for(String s : ar) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		
		// Arrays.toString() 문제
		
		i=0;
		
		for(String ar[]:arr1) {
			System.out.print(arr2[i++]);
				System.out.print(Arrays.toString(ar) + " ");
			System.out.println();
		}
				
		

	}

}
