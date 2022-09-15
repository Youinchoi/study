package chapter10.EX01;

// 상속(Inheritance) : 객체지향 언어의 꽃
// - 코드를 간결하게 사용가능
// - 유지보수가 쉬움
// - 중복된 코드를 방지 가능 
// - 다형성 사용 

// 부모 클래스 (super class)의 필드와 메소드, 이너클래스를 자식 클래스에게 물려줄 수 있다.

// 클래스 내부 구성요소 : 1. 필드 2. 생성자 3. 메소드 4. 이너클래스
// 클래스 외부 구성요소 : 1. 패키지 2. import 3. 외부 클래스 

class Human { 
	// 필드
	String name;
	int age;
	
	// 메소드
	void eat() {
		System.out.println("모든 사람은 먹는다");
	}
	void sleep() {
		System.out.println("모든 사람은 잔다");
	}
	void print() {
		System.out.println(name + ", " + age);
	}
	
}



// 자식 클래스 
class Student extends Human {
	
	int studentID;	// 자식 클래스에서 선언된 필드 
	void goToSchool() {
		System.out.println("학생이 학교에 갑니다");
	}
	
}

class Worker extends Human {
	int workerID;
	void goToWork() {
		System.out.println("직장인이 일하러 갑니다");
	}
} 

class Professor extends Human {
	int professorID;
	void goToClass() {
		System.out.println("교수가 수업하러 갑니다");
	}
}




public class Using_inheritance01 {

	public static void main(String[] args) {
		// 1. Human class 객체 생성
		System.out.println("=== Human 객체 출력 ===");
		Human h = new Human();
		
		h.name = "최유인";
		h.age = 25;
		
		h.eat();
		h.sleep();
		h.print();
		
		// 2. Student class 객체 생성
		
		System.out.println("=== Student 객체 출력 ===");
		Student s = new Student();
		
		s.name = "홍길동";
		s.age = 20;
		s.studentID = 1000;
		
		s.eat();
		s.sleep();
		s.print();
		s.goToSchool();
		
		// 3. Worker class 객체 생성
		System.out.println("=== Worker 객체 출력 ===");		
		Worker w = new Worker();
		
		w.name = "이순신";
		w.age = 35;
		w.workerID = 1001;
		
		w.eat();
		w.sleep();
		w.print();
		w.goToWork();
		
		// 4. Professor class 객체 생성
		System.out.println("=== Professor 객체 출력 ===");	
		Professor p = new Professor();
		
		p.name = "김아무개";
		p.age = 45;
		p.professorID = 1002;
		
		p.eat();
		p.sleep();
		p.print();
		p.goToClass();
		
		
	}

}



