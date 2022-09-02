package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array8 {

	public static void main(String[] args) {
		
		// 정수 배열 방 10개를 생성하고, 임의의 값을 10의 방에 저장하시오.
		// 그 중 최댓값을 뽑아서 출력하는 프로그램을 생성하시오.
		// 출력 : 배열방 10개에서 최댓값은 : 000
		
		
		
		int [] arr = new int [10];
		System.out.println("10개의 랜덤한 수를 입력합시다!");
		Scanner sc = new Scanner(System.in);
		
		
		// 입력
		for (int i = 0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 수 : ");
			arr[i] = sc.nextInt();
		}
		
		// 출력
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i<arr.length; i++) {
			max = (arr[i]>max)?arr[i]:max;
		}
		
		System.out.println("=======================");
		System.out.println("10개 중 최댓값 : " + max);
		
		
		for (int i = 0; i<arr.length; i++) {
			min = (arr[i]<min)?arr[i]:min;
		}
		
		System.out.println("10개 중 최소값 : " + min);
		
		System.out.println("=======================");
		
		// sort() 메소드 사용해서 출력
		Arrays.sort(arr); // 배열방의 값을 정렬한다 0(최소값), 1, 2, 3, 4...arr.length  -1
		System.out.println("최댓값 : " + arr[arr.length-1]); // 최댓값
		System.out.println("최소값 : " + arr[0]); // 최소값
		
		System.out.println("=======================");
		
		// Stream을 사용하는 경우
		System.out.println("최대값 : " + Arrays.stream(arr).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(arr).min().getAsInt());
		
		System.out.println("=======================");
		
		
			
			sc.close();
					

	}

}
