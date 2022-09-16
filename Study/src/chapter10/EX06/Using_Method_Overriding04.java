package chapter10.EX06;

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
	int count;	// 호랑이 수 
	public Tiger(int count) {
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("호랑이는 달립니다");
	}
	void eat() {
		System.out.println("호랑이는 먹습니다");
	}
}

class Eagle extends Animal{
	int count;
	public Eagle(int count) {
		this.count = count;
}
	@Override
	void run() {
		System.out.println("독수리는 날아다닙니다");
	}
	void eat() {
		System.out.println("독수리는 먹습니다");
	}
}

class Fish extends Animal {
	int count;
	public Fish(int count) {
		this.count = count;
}	
	@Override
	void run() {
		System.out.println("물고기가 헤엄칩니다");
	}
	void eat(){
		System.out.println("물고기가 먹습니다");
	}
}

class Dog extends Animal {
	int count;
		public Dog(int count) {
			this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("강아지가 달립니다");
	}
	void eat() {
		System.out.println("강아지가 먹습니다");
	}
}

public class Using_Method_Overriding04 {

	public static void main(String[] args, int sum) {
		
		
		Animal aa = new Animal();
		Animal tt = new Tiger(10);
		Animal ee = new Eagle(5);
		Animal ff = new Fish(50);
		Animal dd = new Dog(70);
		
		aa.run();
		aa.eat();
		
		System.out.println("=== 객체를 배열에 저장 후 출력 ===");
		
		// 객체를 배열에 저장
		Animal [] arr = new Animal[] {aa,tt,ee,ff,dd};
		
		// for문을 사용해서 출력 : eat(), run(), 동물의 총 마리수 : 
		
		// 1. for 문을 사용해서 객체를 animal 객체
		for (int i = 0; i < arr.length; i++) {
			Animal aaAnimal = arr[i];
			aa.eat();
			aa.run();
			
			if(aa instanceof Tiger) {
				Tiger t1 = (Tiger)aa;
				sum += t1.count;
			}
			
			if(aa instanceof Eagle) {
				Eagle t1 = (Eagle)aa;
				sum += t1.count;
			}
			
			if(aa instanceof Fish) {
				Fish t1 = (Fish)aa;
				sum += t1.count;
			}

			if(aa instanceof Dog) {
				Dog t1 = (Dog)aa;
				sum += t1.count;
			}
		}
		// 2. 다운캐스팅 해서 자식 필드에 count값을 읽어서 총 더한 값을 출력 
		System.out.println("총 동물의 수는 : " + sum);
		
	}

}
