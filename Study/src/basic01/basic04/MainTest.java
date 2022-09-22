package basic04;

public class MainTest {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		// 값지정 1 - setter
//		s.setName ("홍길동");
//		s.setKor (100);
//		s.setEng (40);
//		s.setMath (50);
//		
//		// 값지정 2 - 생성자
		
//		Student s = new Student ("홍길자",90,89,30);
		
		s.calTotal();
		s.calAvg();
		s.output();
	}

}

