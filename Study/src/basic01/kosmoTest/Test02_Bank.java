package kosmoTest;

public class Test02_Bank {
	
	// 가
	String holder;
	String account;
	int moneyleft;
	int a;
	
	// 나
	public void output(int a) { // 인출
		if(moneyleft-a < 0) {
			System.out.println("잔액이 부족합니다!");
		}else {
			System.out.printf("고객님께서 인출하신 금액은 %d원 입니다.", a);
			System.out.println();
			moneyleft -= a;
		}
	}
	
	public void input(int a) {
		System.out.printf("고객님께서 입금하신 금액은 %d원 입니다.", a);
		System.out.println();
		moneyleft += a; 
	}
	
	// 다
	@Override
	public String toString() {
		return ("예금주 : " + holder + " / 계좌번호 : " + account +  " / 잔액 : " + (moneyleft - a) + "원");
	}
	
	public static void main(String[] args) {
		
		Test02_Bank b = new Test02_Bank();
		b.holder = "자바맨";
		b.account = "123-456";
		b.moneyleft = 10000;
		b.input(200);
		b.output(8000);
		
		System.out.println(b.toString());
		
	}
	
}	

