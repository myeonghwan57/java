package ch02;

public class VipCustomer extends Customer{


	double salesRatio;
	private String agentName;
	
	public VipCustomer() {
		customerGrade= "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
}
