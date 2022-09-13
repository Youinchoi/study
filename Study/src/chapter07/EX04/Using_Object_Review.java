package chapter07.EX04;


class Person{
	// class : 객체를 생성하기 위한 하나의 템플릿 
	// Object(객체) : 설계도에 따라 만들어진 건축물 
	
	// 1. 필드 : 클래스 군락에서 선언된 변수(Heap), 지역변수 : 메소드 군락에서 선언된 변수 (stack)
	
	String name;	// 기본값은 null
	float height;	// 키와 몸무게는 실수값 사용
	float weight;
	int age;
	
	// 2. 생성자 : 1. 리턴타입이 없다 / 2. 클래스 이름과 반드시 동일해야 함
	//			  + 필드의 기본값을 초기화 
	// 생성자 오버로딩 : 생성자명은 동일, 식별자(인풋 매개변수 타입, 갯수)
	
	Person(){	// 인풋값이 없는 기본 생성자, 생략가능 
		
	}
	
	Person(String s){	// this 키워드 없이 필드에 값 할당, 변수명 다름 
		name = s;
	}
	
	Person(String name, float height){ 	// this : 인풋 매개변수면, 값을 받는 변수, 필드명
		this.name = name; 
		this.height = height;
	}
	Person(String name, float height, float weight, int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age; 
	}
	
	// 3. 메소드 : 기능을 실행하는 코드가 저장 / 호출시 작동 
	
	void show() {	// 필드의 내용을 출력하는 메소드 
		System.out.println(name + ", " + height + ", " + weight + ", " + "age"); 
	}
	
	// 4. getter & setter : 필드의 내용을 출력 / 필드의 내용을 입력 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}




public class Using_Object_Review {

	public static void main(String[] args) {
		
		// 1. 기본 생성자 호출 
		Person person = new Person();
			// 필드 내용 출력 (1. 객체 명으로 출력)
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.age);
		
		System.out.println("=================");
		
			// getter를 사용하여 필드의 내용 출력 (필드의 값을 리턴)
		System.out.println(person.getName());
		System.out.println(person.getHeight());
		System.out.println(person.getWeight());
		System.out.println(person.getAge());
		
		System.out.println("=================");
		
			// show() : 필드의 내용을 출력 
		person.show();
		
		System.out.println("=================");
		
		// 2. 매개변수가 1개인 생성자 호출
		Person Lee = new Person ("이순신");
		System.out.println(Lee.name);
		System.out.println(Lee.height);
		System.out.println(Lee.weight);
		System.out.println(Lee.age);
		
		System.out.println("=================");
		
		Lee.show();
		
		System.out.println("=================");
		
		// 3. 매개변수가 4개인 생성자 호출
		Person hong = new Person("홍길동", 185.3F, 80.3F, 35);
		System.out.println(hong.name);
		System.out.println(hong.height);
		System.out.println(hong.weight);
		System.out.println(hong.age);
		
		System.out.println("=================");
		
		hong.show();
		
		// Setter를 사용해서 필드의 값 할당, Getter를 사용해서 필드의 값 출력
		Person song = new Person();
		song.setName("송도령");
		song.setHeight(189.4F);
		song.setWeight(78.5F);
		song.setAge(28);
		
		System.out.println("=================");
		
		System.out.println(song.getName());
		System.out.println(song.getHeight());
		System.out.println(song.getWeight());
		System.out.println(song.getAge());
		
		System.out.println("=================");
		
		song.show();
		
		
		
	}

}
