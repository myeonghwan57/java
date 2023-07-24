package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer Lee = new Customer();
		Lee.setCustomerName("LEE");
		Lee.setCustomerID(12345);
		// Lee.setCustomerGrade(null); 등급은 실버로 지정해 둠
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showInfo());
		
		VipCustomer Kim = new VipCustomer();
		Kim.setCustomerName("KIM");
		Kim.setCustomerID(98765);
		Kim.setAgentName("Park");
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showInfo());
	}

}
