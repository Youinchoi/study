package basic03;

public class Ex01_Method03 {

	public static void main(String[] args) {

		int[] result = add(); // 리턴된 값을 받아야 하니 우선 int[]자료형을 넣고, result라는 변수명도 붙이고 기다리자
		// a와 b의 값을 받아서 합산한 결과를 여기서 출력하고 싶은데?
		// 배열로 가져온걸 풀어보자
	
		int sum = result[0] + result[1]; 
		System.out.println("합 : " + sum);
		
		}
	
	static int[] add() { // int만 넣으면 안됨. int[]까지가 자료형이다
		int a = 10, b = 20; // a와 b에 값 지정
		int [] arr = {a,b}; // 배열을 사용해 a,b를 하나로 묶어서 올라갈 준비 
		
		return arr; // 근데 리턴값에는 딱 하나만 가져갈 수 있는데.. 그래서 배열을 쓴거구나
	}

}

