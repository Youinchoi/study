package basic05;

/* static 
 * 객체 생성보다 먼저 실행하기 때문에 클래스명 접근 
 * static은 전역적으로 쉽게 재사용하는 멤버나 잘 변하지 않는 변수나, 메소드를 사용할때 주로 사용
 * 만들어 놓고 클래스 호출, 객체 생성을 따로 할 필요없이 바로바로 사용할 수 있기 때문에 사용성이 좋음
 * but 메모리 차지를 많이 함 
 */

public class Book {
	
	private static int count; //static을 붙여 공유해야 메인함수에서 값이 바뀐다 
	
	public Book() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

}
