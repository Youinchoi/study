package chapter04.EX07;

public class Using_break {

	public static void main(String[] args) {
		/* break; <== 해당 구문{}을 탈출할 때 사용,
		 	- 한 단계만 탈출
			for, while, do while (반복문을 탈출할 때 사용)
		*/
		
		// 1. 단일 loop에서 탈출
		for(int i=0; i<10; i++) {
			System.out.println(i);
			break;		
		}
		
		System.out.println("================");
		
		// break는 for, while, do while 내에서 if 조건문과 같이 사용	
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if (i==5) {break;}	// i가 5일때 탈출
			
		System.out.println("================");
		
		
		// 2. 다중 loop문에서 break 사용
		// case 1 - 하나의  loop문만 탈출
		
		for(int r = 0; r<5; r++) { //  0~4를 5 번 LOOP
			for(int t=0; t<5; t++) {
				if(t==2) {break;} // 하나의 for문만 빠져나감
				System.out.println(r+","+t);
			}
		}
		
		System.out.println("================");
		
		//case2 - 한꺼번에 탈출 (바깥쪽 for문의 변수의 값을 조건이 false가 나도록 증가시켜서
		
		for(int r = 0; r<5; r++) { //  0~4를 5 번 LOOP
			for(int t=0; t<5; t++) {
				if(t==2) {
					r = 100; 	// 바깥쪽 for문의 변수값을 증가시켜서 한꺼번에 탈출
					break;
					} 
				System.out.println(r+","+t);
			}
		}
		
		System.out.println("========'========");
		// case3 - 레이블을 사용하여 탈출 / 이중 for문 탈출 
		
		jump : for(int r = 0; r<5; r++) { //  0~4를 5 번 LOOP
			for(int t=0; t<5; t++) {
				if(t==2) {
					
					break jump;
					} 
				System.out.println(r+","+t);
			}
		}
		
		System.out.println("================");
		
		
		
	}

}
	
}
