package chapter10.EX03;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람은 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	public void hunt() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 날아다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

class Bear extends Animal {
	public void move() {
		System.out.println("곰이 이동합니다.");
	}
	public void biting() {
		System.out.println("곰이 베어뭅니다.");
	}
}




public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		test.moveAnimal(new Bear());
		
		Animal [] animalList = new Animal [4];
		animalList [0] = new Human();
		
		ArrayList <Animal> animals = new ArrayList<Animal>();
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
//		if문을 통해 다운캐스팅된 animal의 메서드가 Human일 경우,
//		human의 readBook() 메서드를 수행하도록 지정.
// 		instanceof 를 통해 다운캐스팅을 해준다.
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}else if (animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunt();
		}else if (animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}else if (animal instanceof Bear) {
			Bear bear = (Bear)animal;
			bear.biting();
		}else {System.out.println("지원되지 않는 기능입니다.");} // 예외 지정
		
		// https://lefton.tistory.com/15 <= 참고한 예제
		// https://reakwon.tistory.com/48
		// https://psychoria.tistory.com/765
	}

}
