package basic02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		int kor[] = new int[3];
		
		System.out.print(kor.length+"명의 국어 점수를 나란히 입력하세요! >> ");
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData,"/");
		
		for(int i = 0; st.hasMoreTokens(); i++) {
			String str = st.nextToken();
			kor[i] = Integer.parseInt(str);
		}
		
		// 출력
		for(int i = 0; i<kor.length; i++) {
			System.out.println(i+"번 학생의 점수 : " + kor[i]);
		}
		
		

	}
	
}
