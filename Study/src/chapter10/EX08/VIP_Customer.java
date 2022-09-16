package chapter10.EX08;

public class VIP_Customer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	VIP_Customer(){
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	VIP_Customer(int customerID, String customerName, int agentID){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		bonusPoint = 10;
	}
	
	

}
