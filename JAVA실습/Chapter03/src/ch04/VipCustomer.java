package ch04;

public class VipCustomer extends Customer{


	double salesRatio;
	private String agentName;
	
//	public VipCustomer() {
//		super(0,"noname");
//		customerGrade= "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		System.out.println("VipCustomer() 호출");
//	} //기본생성자로 사용하고 싶을떄

	public VipCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade= "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	} // 인스턴스를 생성할때 이름도 넣고 아이디값도 넣고 싶을떄 
	
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + " 입니다. 소유한 포인트는 " +bonusPoint + " 입니다. 담당 에이전트는 " + agentName+ "입니다." ;
	}
	@Override 
	public int calcPrice(int price) { //오버라이딩
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
}
