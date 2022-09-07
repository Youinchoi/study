package chapter07.EX01;


class bread{
	double pp (int a, int b) {
		return (a*2) + (b*2);
	}
}



public class Using_Method_test {

	public static void main(String[] args) {
		bread pp = new bread();
		
		System.out.println(pp.pp(10, 5));
		System.out.println();
		
		System.out.println("피자의 반지름은 " + pp);
		

	}

}
