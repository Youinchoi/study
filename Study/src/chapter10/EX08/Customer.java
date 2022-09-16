package chapter10.EX08;

public class Customer {

		int customerID;	// 고객 ID
		String customerName;	// 고객 이름
		String customerGrade;	// 고객 등급
		int bonusPoint;		// 고객의 등급에 따라서 포인트 적립 
		double bonusRatio;	// 물품구매시 할인률 
		
		Customer(){
			// 필드의 기본 값 할당을 메소드 호출로 적용 
			initCustomer();
		}
		
		Customer(int customerID, String customerName){
			this.customerID = customerID;
			this.customerName = customerName;
		}
		
		void initCustomer() {
			this.customerGrade = "Silver";
			this.bonusRatio = 0.01;
			
		}
		

}


