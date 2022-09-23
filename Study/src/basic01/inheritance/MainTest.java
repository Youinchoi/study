package inheritance;

public class MainTest {

	public static void main(String[] args) {
		
//		Mom m = new Mom();
//		m.job();
//		m.gene();
		
		System.out.println("==================");
		
//		Daughter d = new Daughter();
//		d.study();
//		d.job();
//		d.gene();

		// 부모 변수에 자식객체 생성가능 
		// 오버라이딩 되어있다면 자식게 불려짐 
//		 Mom m = new Daughter();
//		m.gene();
//		m.job();
//		m.study(); << 이건 불가능 
		
		/* 형변환 : casting
		 * 1. 기본형끼리만
		 * 2. 참조형에서 상속관계있는 경우만 가능
		 * 
		 * String s = new String("~~"); 
		 * StringBuffer sb = (StringBuffer)s; >> 참조형끼리는 이런 캐스팅이 안먹힘
		 */
		
//		Mom m = new Mom();
//		Daughter d = (Daughter)m;
		
		Daughter d = new Daughter(); // 에러는 나지 않지만 문제 유발
		Mom m = (Mom)d; // up casting
		Daughter d2 = (Daughter)m; // down casting
		
		
		
		
		
	}

}
