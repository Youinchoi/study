package chapter04.EX07;

public class Using_continue {

	public static void main(String[] args) {
			// continue : 아래의 코드를 실행하지 않고, 
			// if문과 같이 사용됨
		
		//1.  단일 Loop에서 continue
		for(int i=0; i<10; i++) {
			System.out.println("A");
			{continue;}	// 구문을 빠져나가지 않고
			//System.out.println("B");  // 도달할 수 없는 코드
		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println("A");
			if(i%2==0) {continue;} // i가 0,2,4,6,8 (짝수)일 때 실행됨
			System.out.println("B");
		}
		
		
		System.out.println("=============================");
		
		for(int i=0; i<10; i++) {
			if (i==5 || i==7) {continue;}
			System.out.print(i+" ");
		}
		
		
		/* - 1. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3의 배수만 출력
		 * - 2. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 5의 배수만 출력
		 * - 3. for문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서 3,5,7 배수만 출력 */
		
		
		// [1]번 문제
		
		for (int s = 0; s<=1000; s++) {
			if (s % 3 != 0) {continue;}
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("=============================");
		
		
		// [2]번 문제
		
				for (int s = 0; s<=1000; s++) {
					if (s % 5 != 0) {continue;}
					System.out.print(s+" ");
				}
		
		System.out.println();
		System.out.println("=============================");		
				
		
		// [3]번 문제
				
				for (int s = 0; s<=1000; s++) {
					if ((s%3==0) || (s%5==0) || (s%7==0)) 
					System.out.print(s+" ");
				}
						
		System.out.println();
		System.out.println("=============================");
		
		// 2. 다중 Loop에서 continue
		
		for(int i=0; i<5;  i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {continue;} // 3일때 밑에를 실행하지 않고 다시 위로 올라간다.
				System.out.println(i+", "+j);
			}
		}
		
		System.out.println("=========레이블을 사용해서 점프========");
		
		out:for(int i=0; i<5;  i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {continue out;} // 3일때 밑에를 실행하지 않고 다시 위로 올라간다.
				System.out.println(i+", "+j);
			}
		}
		
		
		System.out.println("=============================");
		
		out:for(int i=0; i<5;  i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					i= 100;
					continue out;}  	// 바깥쪽 for문의 변수값을 증대시켜서 false로 빠져나옴
				System.out.println(i+", "+j);
			}
		}
		
		
		
	}

}
