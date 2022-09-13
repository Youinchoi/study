package chapter07.EX04;

class Car{
	
	// 1. 필드
	String company;
	String model;
	String color;
	double maxSpeed;
	
	// 2. 생성자
	
	Car(){}
	
	Car(String company, String model, String color, double maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 메소드 (show) : 필드의 값을 출력 
	
	
	void show() {
		System.out.println(company + ", " + model + ", " + color + ", " + maxSpeed);
	}
	
	// 4. 메소드 (getter&setter) 

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}


public class Car_Test {

	public static void main(String[] args) {
		
		// 객체 생성
		
		// 1. 현대자동차 그랜저(필드의 값을 직접 입출력) 
		Car Hyundai = new Car();
		Hyundai.company = "현대자동차";
		Hyundai.model = "그랜저";
		Hyundai.color = "검정";
		Hyundai.maxSpeed = 450;
		
		System.out.println(Hyundai.company);
		System.out.println(Hyundai.model);
		System.out.println(Hyundai.color);
		System.out.println(Hyundai.maxSpeed);
		
		System.out.println("=====================");
		
		
		// 2. 쌍용자동차 체어맨(생성자를 통해서 값 입력)
		
		Car Ssangyong = new Car("쌍용자동차","체어맨","흰색", 450);
		Ssangyong.show();
		
		System.out.println("=======================");
		
		// 3. 기아자동차 k9 (setter를 통해서 값 입력)
		
		Car Kia = new Car();
		Kia.setCompany("기아자동차");
		Kia.setModel("K9");
		Kia.setColor("검정");
		Kia.setMaxSpeed(400);
		
		System.out.println(Kia.getCompany());
		System.out.println(Kia.getModel());
		System.out.println(Kia.getColor());
		System.out.println(Kia.getMaxSpeed());
		
		
	}

}
