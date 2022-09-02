package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 국어(aa), 영어(bb), 수학(cc), 과학(dd), 음악 점수(ee)를 인풋받습니다.
		//  + 5과목의 평균값을 내고... (double로 계산)
		
		// if문을 사용해서 평균이 90점 이상이면 "A학점", 80점 이상은 "B학점", 
		// 70점 이상 "C학점", 60점 이상 "D학점", 나머지는 "F"
		
		// Scanner sc를 사용 후에는 sc.close를 사용해 메모리에서 객체를 삭제해야함
		
		Scanner sc = new Scanner(System.in);
		
		int aa=0;
		int bb=0;
		int cc=0;
		int dd=0;
		int ee=0;
	
		System.out.print("국어 점수 : ");
		aa = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		bb = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		cc = sc.nextInt();
		
		System.out.print("과학 점수 : ");
		dd = sc.nextInt();
		
		System.out.print("음악 점수 : ");
		ee = sc.nextInt();
		
	
		System.out.println("=============");
		
		
		int avg = (aa+bb+cc+dd+ee)/5;
		
		System.out.printf("귀하의 평균은 %d점 입니다.",avg);
		System.out.println(" 평균 점수를 입력하고 학점을 확인하시길 바랍니다.");
		System.out.println("=============");
		System.out.print("Avg Score : ");
		
		String 점수 = sc.next();
		
		if(avg>=90) {	
			System.out.println("A학점"); 	// false
		}else if(avg>=80) {
			System.out.println("B학점"); 	// True (실행문 실행후, if문 빠져나옴)
		}else if(avg>=70) {
			System.out.println("C학점"); 	// false
		}else if(avg>=60) {
			System.out.println("D학점"); 	// false
		}else{
			System.out.println("F"); // 그 외의 모든 값 출력

		
		}

	}
}


