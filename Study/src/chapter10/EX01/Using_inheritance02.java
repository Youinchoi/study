package chapter10.EX01;

class Fruit {
	String name;
	String color;
	int large;
	
	void eat() {
		System.out.println("모든 과일은 맛있다");
	}
	void print() {
		System.out.println(name + " / " + color + " / " + large + "cm");
	}
}

class Apple extends Fruit{
	int appleCount;
	void redFruit() {
		System.out.println("사과의 갯수 : " + appleCount);
	}
	public void show() {}
}

class Orange extends Fruit{
	int orangeCount;	 
	void orangeFruit() {
		System.out.println("오렌지의 갯수 : " + orangeCount);
	}
	public void show() {}
}

class Banana extends Fruit{
	int bananaCount;	 
	void tropicalFruit() {
		System.out.println("바나나의 갯수 : " + bananaCount);
	}
	public void show() {}
}


public class Using_inheritance02 {

	public static void main(String[] args) {
		System.out.println("=== Fruit 객체 출력 ===");
		Fruit f = new Fruit();
		
		f.name = "과일";
		f.color = "색상";
		f.large = 0;
		
		f.print();
		f.eat();
		
		System.out.println();
		
		System.out.println("=== Apple 객체 출력 ===");
		Apple a = new Apple();
		
		a.name = "사과";
		a.color = "빨강";
		a.large = 12;
		a.appleCount = 20;
		
		
		a.print();
		a.eat();
		a.redFruit();
		
		System.out.println();
		
		System.out.println("=== Orange 객체 출력 ===");
		Orange o = new Orange();
		
		o.name = "오렌지";
		o.color = "주황";
		o.large = 10;
		o.orangeCount = 4;
		
		o.print();
		o.eat();
		o.show();
		o.orangeFruit();
		
		System.out.println();
		
		System.out.println("=== Banana 객체 출력 ===");
		Banana b = new Banana();
		
		b.name = "바나나";
		b.color = "노랑";
		b.large = 20;
		b.bananaCount = 6;

		b.print();
		b.eat();
		b.tropicalFruit();		
		
		
	}

}
