package chapter07.EX01;

import java.util.Arrays;

public class Using_Method6 {

	// 들어온 배열의 모든 값을 더해서 더한 값을 리턴
	static int add(int[]a) {
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
		}
	
	// 들어온 배열의 모든 값을 빼서 뺀 값을 리턴
	static int div(int[]a) {
		int div = 0;
		for(int i = 0; i<a.length;i++) {
			div -= a[i];	
		}
		return div;
		}
	
//	int div = 7;
//	for (int i = 0; i<a.length; i++) {
//		if (i==0) {continue;}
//		div -= a[i];     // div = div - a[i]
//	}
	
	// 들어온 배열의 모든 값을 곱해서 곱한값을 리턴
	static long mul(int[]a) {
		long mul = 1;
		for(int i = 0; i<a.length; i++) {
			mul*=a[i];
		}
		return mul;
		}
	
	// 들어온 배열의 평균값을 리턴
	static double avg(int[]a) {
		int sum = 0; 
		for(int i = 0; i<a.length; i++) {
			sum+= a[i];
		}
		double avg = sum / (double)a.length;
		
		return avg;
		} 
	
	public static void main(String[] args) {
		
		// 1~100까지 7의 배수만 저장 후, 각 메소드 호출
		
		int[] arr = new int [14];
//		int count = 0;
//		
//		for (int i = 1; i < 101; i++) {
//			if(i%7==0) {
//				arr [count] = i;
//				count++;
//			}
//		}
		
		for(int i = 0, j = 7; i<arr.length; i++, j+=7) {
			arr[i] = j; // arr[0]
		}
		
		// 배열의 각 방의 내용을 출력
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		
		// 메소드 호출 
		
//		int sum = add(arr);	  변수명과 메소드 명은 같아도 사용법이 다르기에 괜찮음 
//		System.out.println("더한 값 : " + sum);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("더한 값 : " + add(arr));
		System.out.println("뺀 값 : " + div(arr));
		System.out.println("곱한 값 : " + mul(arr)); // int 범위를 넘어 long을 써야한다. 
		System.out.println("평균 값 : " + avg(arr));
		
		
		
	}

}
