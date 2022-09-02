package chapter04.EX04;

public class Using_for01 {

	public static void main(String[] args) {
		/* for (초기값; 조건; 증가값){
		   	실행문 1;    <== 조건이 참일 동안 계속 반복, 거짓이면 for를 빠져나옴
		 }
		 
		 */
		
		int a ;
		for (a=0; a<5; a++) { 	//(초기값; 조건; 증가값)
			System.out.println(a);
		}

		System.out.println("===================");
		
		// 초기값과 증가값엔 (,)로 구분해서 여러개의  변수가 올 수 있다.
		
		int b, c, d;
		for ( b=0,c=10,d=20;  b<5; b++,c+=2,d+=5 ) { // b는 1씩 증가, c는 2씩 증가, d는 5씩 증가
			System.out.println("b : "  + b + "c : " + c + "d : " + d);
			
		}
		
		System.out.println("===================");
		
		// for문에서 무한루프
		int e;
		for (e=0; e<10; e+=3) {		// 조건이나 증가값을 잘못 처리할 경우, 무한루프... 예를들어 e-=3
			System.out.println(e);	// 조건이 True일 때만 반복
		}
		
		System.out.println("===================");
		
		// 1~10까지 for문 없이 덧셈
		
		int sum1;
		sum1 = 0;	// 초기값 0
		
		sum1 += 1; 	// sum1 = sum1 + 1
		sum1 += 2; 	// sum1 = sum1 + 2
		sum1 += 3; 	// sum1 = sum1 + 3  ...
		sum1 += 4; 
		sum1 += 5; 
		sum1 += 6; 
		sum1 += 7; 
		System.out.println(sum1);   // 28
		sum1 += 8; 
		sum1 += 9; 
		sum1 += 10; 
		
		System.out.println("1~10까지의 합 : " + sum1);
		
		System.out.println("===================");
		
		int sum2;
		int i;
		
		for (i=1, sum2=0; i<=10; i++) {
			sum2+=i;
		}
		
		System.out.println("1~10까지의 합 : "  + sum2);
		System.out.println("===================");
		
		
		//0~1000까지 7의 배수의 합계
		
		int y;
		int sum3;
		
		// 1부터 1000 사이의 정수 중 7의 배수의 합
		for (y=0, sum3=0; y<=1000; y+=7) {
			sum3 += y;
			}
		
		
		System.out.println("7의 배수의 합계 : "  + sum3);
		System.out.println("===================");
		
		
		// for문과 if문을 사용해서1~10까지 더한 값을 출력하되, 아래와 같이 출력하시오.
		// 결과 : 1+2+3+4+5+6+7+8+9+10 = 55
		
		
		int x;
		int sum4;
		
		for (x=1, sum4=0; x<=10; x++) {
			sum4+=x;
			if (x==10) {
				System.out.print(x+"=");
			}else{
				System.out.print(x+"+");
			}
		}
		
		System.out.println(sum4);
		
		
		
		
		
	}

}
