package singleton;

public class Singleton_Car {
	
	private static Singleton_Car c = new Singleton_Car(); // 최초 한번 객체 생성 
	private Singleton_Car(){ }
	
	public static Singleton_Car getInstance() {
		return c;
	}
	
	private static boolean isUse = false;
	
	// 차 사용 시작
	public static void drive() {
		isUse = true;
		System.out.println("start driving");
	}
	
	// 차 사용 종료
	public static void parking() {
		isUse = false;
		System.out.println("parking");
	}
	
	public static boolean isEnableUsec() {
		return !isUse;
	}
	
	

}
