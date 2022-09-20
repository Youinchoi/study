package basic02;

/* int a = 5, b=10;
 * int temp;
 * 
 * temp = a; << 중간 매개체
 * a = b;
 * b = temp;
 * 
 */

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		int [] lotto = new int[6];
		
		// # 중복 숫자 해결하기
		
		// 값 지정
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1; // int로 형변환 & 로또에 0은 없으니 +1 붙이기
		}
		
		// 버블 정렬
		for(int i = lotto.length-1;i>0;i--) { // 싸이클을 돌리는 반복문 
			for(int j = 0; j<i; j++) {	// 비교 반복문
				if(lotto[j]>lotto[j+1]) {
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		
		
		
		// 번호 출력
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	}

}
