package basic03;

public class Ex01_Method01 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		add(a, b); // 인자로 보낼준비
		
		}
		
		static void add(int a, int b) {	// 웬만하면 헷갈리지 않도롣 이름 통일 , 파라미터로 받을 준비
		// 여기서 a, b의 값을 받아와 더해서 출력
		int sum = a+b;
		System.out.println("합 : "+ sum);
			
		}
		
}
