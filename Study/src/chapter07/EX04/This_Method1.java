package chapter07.EX04;

class Abc {
	
	// 생성자 (기본) : 인풋 매개변수가 없는 생성자 
	
	Abc(){
		System.out.println("첫번쨰 생성자 - 기본 생성자");
	}
	Abc(int a){
		this(); // 기본 생성자를 호출, this() : 메소드 
		System.out.println("두번쨰 생성자 호출");
	}
	Abc(int a, String b){
		this(30); 	// 매개변수가 정수 1개인 생성자 호출
		System.out.println("세번째 생성자 호출");
	}
	
	Abc(int a, String b, String c){
		this(40, "today");
		System.out.println("네번째 생성자 호출");
	}
	
	
}





public class This_Method1 {

	public static void main(String[] args) {
		// this method : 자신 클래스의 다른 생성자를 호출
		// 반드시 생성자 내부에서 사용됨, 메소드 내부에서는 사용할 수 없음
		// 반드시 생성자 첫번쨰 라인에 위치해야함
		
		System.out.println("=======================");
		
		Abc abc1 = new Abc();	// 기본 생성자 호출
		
		System.out.println("=====매개변수가 1개인 생성자 호출=====");
		Abc abc2 = new Abc(); 
		// abc2는 기본생성자를 호출한다
		
		System.out.println("=====매개변수가 2개인 생성자 호출=====");
		Abc abc3 = new Abc(40, "오늘");
		// abc1 - 2 - 3 순으로 호출
		// 2는 기본생성자 포함, 3은 매개변수가 1개인 생성자를 호출하므로 2출력, 마지막으로 3출력 
		
		System.out.println("=====매개변수가 3개인 생성자 호출=====");
		Abc abc4 = new Abc(40,"오늘"," 날씨는!");
		// abc1 - 2 - 3 - 4 순으로 호출
		
	}

}
