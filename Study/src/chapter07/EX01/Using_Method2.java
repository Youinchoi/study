package chapter07.EX01;

class Circle{
	int radius;
	String name;
	
	Circle (int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	
	void call() {
		double area = 3.14 * radius * radius;
		System.out.println(name + "의 넓이는 " + area + "입니다.");
	}
}


public class Using_Method2 {
	public static void main(String[] args) {

		Circle pizza = new Circle(10, "피자");
		pizza.call();
		
		Circle donut = new Circle(5, "도넛");
		donut.call(); 
		
		
	}

}
