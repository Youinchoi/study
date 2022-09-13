package chapter07.EX04;

class Cars{
	
	String companyName;
	String color;
	double maxSpeed;
	
	Cars(){
		companyName = "차종 미정";
		color = "색 미정";
		maxSpeed = 0.0;
	}

	Cars(String companyName){
		this();
		this.companyName = companyName;
	}
	Cars(String companyName, String color){
		this(companyName);
		this.color = color;
	}
	Cars(String companyName, String color, double maxSpeed){
		this(companyName, color);
		this.maxSpeed = maxSpeed;
	}

	void print() {
		System.out.println("차종 : " + companyName);
		System.out.println("색상 : " + color);
		System.out.println("최대속력 : " + maxSpeed);
	}
	
}


public class This_Method04 {

	public static void main(String[] args) {
		// 1.  기본 필드 값 출력
		System.out.println("==기본 생성자 호출==");
		Cars car1 = new Cars();
		car1.print();
		
		// 2. 매개변수 1개일 때, conpanyName만 출력, 나머지는 기본값
		System.out.println("==매개변수 1개인 생성자 호출==");
		Cars car2 = new Cars("현대자동차");
		car2.print();
		
		// 3. 매개변수 2개일 때
		System.out.println("==매개변수 2개인 생성자 호출==");
		Cars car3 = new Cars("현대자동차","검정색");
		car3.print();
		
		// 4. 매개변수 3개일 때
		System.out.println("==매개변수 3개인 생성자 호출==");
		Cars car4 = new Cars("현대자동차","검정색",370.5);
		car4.print();
	}

}
