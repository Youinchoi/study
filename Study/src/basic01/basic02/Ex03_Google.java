package basic02;

public class Ex03_Google {

	public static void main(String[] args) {
		
		// 문제 : 1~10000 사이 8의 갯수는?
		
		
		int count = 0; // 8의 갯수 
		int temp = 0;	// 임시변수
		
		for(int i = 1; i<=10000; i++) {
			temp = i; // temp에 i값 임시저장 
			
			while(true) {
				if (temp%10==8) count++;  // temp를 10으로 나눈 나머지의 값이 8일 경우 갯수를 셈 
				if (temp>10) {temp/=10;}  // temp가 10보다 클 경우(2자리수 이상) 10으로 나눈 후 다시 갯수를 셈
				else {break;} // temp가 10보다 작을 경우 while문 종료
			} 
		}
				System.out.println("1~10000까지 8이 포함된 숫자의 개수 : " + count + "개");
	
	} 


}
