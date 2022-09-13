package chapter07.EX04;

class Fruit{
	// 1. 필드 
	
	String name;	// 과일 이름
	String color;	// 색깔
	int count;		// 갯수
	int sugarContent;	// 당도
	
	
	// 2. 생성자
	
	Fruit(){
		
	}
	
	Fruit(String n){
		name = n;
	}
	
	Fruit(String name, String color, int count, int sugarContent){
		this.name = name;
		this.color = color;
		this.count = count;
		this.sugarContent = sugarContent;
	}
	
	// 3. show() : 필드의 값을 모두 출력하는 메소드
	
	void show() {
		System.out.println(name + ", " + color + ", " + count + ", " + sugarContent);
	}
	
	// 4. getter & setter 메소드

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	
	
	
	
	
}




public class Fruit_Test {

	public static void main(String[] args) {
		// 1. 바나나 : 객체 생성 후, 필드에 기본 값을 직접 입력 후, 출력
		// 2. 사과 : 생성자를 사용해서 4개의 필드에 초기 값 할당, show()로 출력
		// 3. 딸기 : get.set 사용
		
		System.out.println("=====바나나=====");
		
		Fruit Banana = new Fruit ();
		Banana.name = "바나나";
		Banana.color = "Yellow";
		Banana.count = 5;
		Banana.sugarContent = 45;
		
		System.out.println(Banana.name);
		System.out.println(Banana.color);
		System.out.println(Banana.count);
		System.out.println(Banana.sugarContent);
		
		
		System.out.println("=====사과=====");
		
		Fruit Apple = new Fruit ("사과", "Red", 8, 40);
		Apple.show();
		
		System.out.println("=====딸기=====");
		
		Fruit Strawberry =  new Fruit();
		Strawberry.setName("딸기");
		Strawberry.setColor("Red");
		Strawberry.setCount(15);
		Strawberry.setSugarContent(70);
		
		System.out.println(Strawberry.getName());
		System.out.println(Strawberry.getColor());
		System.out.println(Strawberry.getCount());
		System.out.println(Strawberry.getSugarContent());
		
		
	}

}
