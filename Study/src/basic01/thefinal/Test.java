package thefinal;

class Parents { // 클래스 앞에 final이 붙으면 부모클래스가 될 수 없다
	final String field = "부모님꺼";
	final public void house() {
		System.out.println("부모님이 만드신거");
	}
}

class Child extends Parents {
	Child(){
//		field = "내꺼"; <- 부모클래스 내에서 final이 붙어있으므로 변경 불가! 
	}
	
//	public void house() {
//		System.out.println("내가 탕진함");
//	}  
//}     <- 부모클래스 내에서 final이 붙어있으므로 변경 불가! 


public static class Test {

	public static void main(String[] args) {
		
		Parents p = new Child();
		System.out.println(p.field);
		p.house();
		
	}
		
	}

}
