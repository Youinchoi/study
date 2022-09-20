package basic02;


public class Ex03_369 {

	public static void main(String[] args) {
		
		/* 문제 (1)
		 * 1부터 50까지의 숫자 중에서 3,6,9 숫자가 포함되면 그 갯수만큼 짝<글자를 출력, 그렇지 않으면 그 숫자를 출력
		 */
		
		
		for(int i = 1; i<=50; i++) {
			int su = i;
			
			boolean su369 = false;
			
			while(su!=0) {
				int na = su % 10; // 나머지 연산자
				if(na == 3 || na == 6 || na == 9) {
				System.out.print("짝!");
				su369 = true;}
				
				su = su /10;}
			
			
			if(su369)System.out.println();
			else System.out.println(i);
		}
		

	}

}
