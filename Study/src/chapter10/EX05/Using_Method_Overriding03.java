package chapter10.EX05;

class Animal {
	
	// 자식 클래스에서 2개의 메소드를 오버라이딩
	// Animal 타입으로 정의, 배열에 저장 후, 오버라이딩 된 메소드 출력 (for, Enhanced For)
	
	void run() {
		System.out.println("모든 동물은 달립니다");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다");
	}
}

class Tiger extends Animal {
	@Override
	void run() {
		System.out.println("호랑이는 달립니다");
	}
	void eat() {
		System.out.println("호랑이는 먹습니다");
	}
}

class Eagle extends Animal {
	@Override
	void run() {
		System.out.println("독수리는 날아다닙니다");
	}
	void eat() {
		System.out.println("독수리는 먹습니다");
	}
}
class Fish extends Animal {
	@Override
	void run() {
		System.out.println("물고기가 헤엄칩니다");
	}
	void eat(){
		System.out.println("물고기가 먹습니다");
	}
}
class Dog extends Animal {
	@Override
	void run() {
		System.out.println("강아지가 달립니다");
	}
	void eat() {
		System.out.println("강아지가 먹습니다");
	}
}


public class Using_Method_Overriding03 {

	public static void main(String[] args) {
		
	Animal aa = new Animal();
	Animal tt = new Tiger();
	Animal ee = new Eagle();
	Animal ff = new Fish();
	Animal dd = new Dog();
	
	aa.run();
	aa.eat();
	
	tt.run();
	tt.eat();
	
	ee.run();
	ee.eat();
	
	ff.run();
	ff.eat();
	
	dd.run();
	dd.eat();
		
	System.out.println("==========");
	
	Animal aaAnimal = new Animal();
	Animal ttAnimal = new Tiger();
	Animal eeAnimal = new Eagle();
	Animal ffAnimal = new Fish();
	Animal ddAnimal = new Dog();
		
	// 배열에 객체를 저장 : Animal 객체를 저장
	Animal [] arr = new Animal[] {aaAnimal,ttAnimal,eeAnimal,ffAnimal,ddAnimal};	
		
	System.out.println("==for문==");
	for (int i = 0; i < arr.length; i++) {
		Animal aa1 = arr[i];
		arr[i].run();
		arr[i].eat();
	}
		
	System.out.println("==향상된 for문==");
	for (Animal k : arr) {
		k.eat();
		k.run();
	}
		
		
		
		
		
	}

}
