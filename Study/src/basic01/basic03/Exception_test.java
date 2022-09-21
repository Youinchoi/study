package basic03;

public class Exception_test {

	// 일부러 예외를 발생시킬때 throws를 씀 
	void method() throws MyException{	// 그냥 throws Exception도 가능함
		throw new MyException();
		
		
	}

	class MyException extends Exception{
		
	}
	
	
}
