package chapter10.EX02;

class Animals{	// 최상위 부모 클래스
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹는다");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다");
	}
	
	void print() {
		System.out.println(name + ", " + age + ", " + color);
	}
	
}

class Tiger extends Animals {
	int tiger;
	void tigerEat() {
		System.out.println("호랑이는 최상위 포식자이다" + tiger);
	}
}

class Eagle extends Animals {
	int eagle;
	void eagleFly() {
		System.out.println("독수리는 하늘을 난다" + eagle);
	}
}

class Dog extends Animals {
	int dog;
	void dogCute() {
		System.out.println("개들은 귀엽다" + dog);
	}
}

class Dog_sub extends Dog {
	int dogSub;
	void dogsubEat() {
		System.out.println("개들은 뼈다귀를 좋아한다" + dogSub);
	}
}




public class Using_Polymorphism02 {

	public static void main(String[] args) {
		
		// 1. Animal 객체를 Animal 타입으로 생성 
		System.out.println("=== Animals ===");
		Animals a1 = new Animals();
		System.out.println(a1.name);
		
		
		// 2. Tiger 객체를 Tiger 타입으로 생성 
		System.out.println("=== Tiger ===");
		Tiger t1 = new Tiger();
		Animals a2 = new Tiger();
		
		
		System.out.println("=== Eagle ===");
		Eagle e1 = new Eagle();
		Animals a3 = new Eagle();
		
		System.out.println("=== Dog ===");
		Dog d1 = new Dog();
		Animals a4 = new Dog();
		
		System.out.println("=== Dog_Sub ===");
		Dog_sub ds1 = new Dog_sub();
		Dog d2 = new Dog_sub();
		
		Animals a5 = new Dog_sub();
		
		
	}

}
