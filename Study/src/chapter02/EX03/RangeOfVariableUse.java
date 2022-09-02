package chapter02.EX03;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		// 변수의 생존 기간 : {} 블락 내에서만  생존 가능
		
		int value1 = 3;
		
		{	//if, for, while, do while도 쓰인다.
			int value2 = 5;			// {} : 내에서 선언, 생존
			System.out.println(value1);
			System.out.println(value2);
			
		}

		System.out.println(value1);
		// System.out.println(value2);  ==> 블락 밖으로 나와서 오류발생
		
		
	}

}
