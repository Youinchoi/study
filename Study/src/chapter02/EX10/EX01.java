package chapter02.EX10;

public class EX01 {

	public static void main(String[] args) {
		
		// 각 변수의 평균값을 계산하시오.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;
		
		int value1 = aa+bb+cc;
		double value2 = dd+ee;
		
		double data1 = 405.8/5;
		
		double avg = (aa+bb+cc+dd+ee) / 5.0;
		
		
		System.out.println(value1+value2);
		System.out.println(data1);
		
		System.out.println("==========");
		
		System.out.println("각 과목의 평균 값은 : " + avg + "입니다");		
		System.out.printf("각 과목의 평균 값은 : %4.2f입니다", avg);		
		
	}

}

