package ch02;

public class Customer { //일반고객

	protected int customerID;
	protected String customerName;
	protected String customerGrade; // 하위클래스에서는 접근가능
	
	int bonusPoint;
	double bonusRatio;
	
	public Customer() 
	{
		bonusRatio = 0.01;
		customerGrade = "SILVER";
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + " 입니다. 소유한 포인트는 " +bonusPoint + " 입니다.";
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
