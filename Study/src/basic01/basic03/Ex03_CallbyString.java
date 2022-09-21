package basic03;

public class Ex03_CallbyString {

	public static void main(String[] args) {
		
			String a = new String("안녕");
			String b = new String("hi");
			
			add(a,b);
			System.out.println("A=" + a + ",B=" + b); 
		}
		
		static void add(String a, String b) { 
			a+=b;
			System.out.println("A=" + a + ",B=" + b); 
		}
		
	}


