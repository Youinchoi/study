package chapter05.EX01;

import java.util.Arrays;

public class Using_Array3 {

	public static void main(String[] args) {
		// 문제 : 한국을 빛낸 5명의 위인을 s String 배열에 저장 후, 네가지로 출력
		 
		String[] p = new String[5];
		
		p [0] = "세종대왕";
		p [1] = "이순신";
		p [2] = "김은진";
		p [3] = "블랙핑크";
		p [4] = "을지문덕";
		
		System.out.println(p[0]);
		
		System.out.println("==================");
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i]);
		}
		
		System.out.println("==================");
		
		for (String k : p) {
			System.out.println(k);
		}
		
		System.out.println("==================");
		
		System.out.println(Arrays.toString(p));
		
		
	}

}
