package basic02;

public class Ex03_Google2 {

	public static void main(String[] args) {
		
		// 1부터 10000까지의 숫자를 하나의 긴 문자열로 만들고,
		// 그 문자열을 for문으로 순회하면서 8의 개수를 찾는다
		
		for(int i = 0; i<10000; i++) {
			searchEight(i);
		}
		
		System.out.println("1에서 10,000사이에 존재하는 8의 개수 : " + count+"개");
		
	}
	
	private static int count = 0;
	private static void searchEight(int num) {
		
		// 주어진 숫자를 10으로 나눈 나머지가 곧 각 자리의 숫자가 되므로, 
		// 이 숫자가 8일 경우 count 변수를 1씩 증가시켜주면 된다.
		
		if(num%10==8) count++; //  10으로 나누기로 한 다음 나머짓값이 8인 경우 카운팅
		if(num>10)searchEight(num/10); // 10보다 큰 숫자의 경우엔 10으로 나눈 몫으로 카운팅
		
	}

}
