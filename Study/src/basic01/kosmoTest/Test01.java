package kosmoTest;

import java.util.Calendar;

public class Test01 {

	public static void main(String[] args) {
		
		int year = 1998; // 태어난 년도
		
		Calendar c = Calendar.getInstance();
		int thisyear = c.get(Calendar.YEAR);
		
		int age = (thisyear - year) + 1;
		System.out.println("내 나이 : " + age);
		System.out.println("태어난 년도 : " + year);
		
	}

}
