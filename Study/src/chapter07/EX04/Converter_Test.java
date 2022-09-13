package chapter07.EX04;

import java.util.Scanner;

	class Converter{
		
		//1. 필드 
		double rate;  // 환율을 저장하는 변수 / 1$ = 1377.30
		
		// 2. 메소드 생성 (달러를 인풋받아서 원화를 반환하는 메소드), 메소드 이름 : toKRW
		
		double toKRW(double usd) {
			return usd * rate;
		}
		
		// 3. 메소드 생성 (원화를 인풋받아서 달러를 반환하는 메소드), 메소드 이름 : toDollar()
		double usd(double toKRW) {
			return toKRW / rate;
		}

		// 4. setRate() 메소드 생성 : setter를 사용해서 rate 필드의 값을 할당 
		
		public void setRate(double rate) {
			this.rate = rate;
		}
		
		
	}


	public class Converter_Test {	// 환율을 계산하는 클래스
	
	public static void main(String[] args) {
		// 네이버에 환율검색
		// 객체 생성 후, 스캐너로 환율을 인풋받아서 setRate() 메소드에 저장 후
		// 원화 100만원 ==> 몇 $인지 출력
		// 달러 $100 ==> 몇 만원인지 출력 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1달러에 대한 오늘의 환율을 입력하시오 >>> ");
		double rate = sc.nextDouble();
		
		// 객체 생성 
		Converter cv = new Converter(); // 기본생성자 호출 (생략되어 있음)
		
		// 스캐너로 받은 rate변수의 값을 setter로 주입 
		cv.setRate(rate);
		
		// 100만원 ==> 몇 $
		System.out.println("원화 100만원은 " + cv.usd(1000000) + "$입니다.");
		
		// 달러 -> 원화
		System.out.println("100 달러는 "+ cv.toKRW(100) + "만원입니다.");
		
		System.out.println("=============================");
		
		// 소수점 둘째 자리까지 잘라서 출력
		
		// 1. printf()를 사용하여 출력
		System.out.printf("원화 100만원은 %.2f $ 입니다.", cv.usd(1000000));
		System.out.println();
		System.out.printf("$100는 %.2f원 입니다.", cv.toKRW(100));
		
		
		// 2. 변수에 더블값을 할당 후 변환해서 소수점 두 자리까지 변환해서 출력
		
		System.out.println("===========");
		double per2 = 3.141592;
		
		// String으로 변환후, per2의 변수의 값을 소숫점 2자리 까지 출력후 다시 더블형으로 전한
//		double per1 = Double.parseDouble(String.format(%.2f, per2));
//		System.out.println(per1);
//		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	
		
	

	}

}
