package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Customer Lee = new Customer(12345,"LEE");
		// Lee.setCustomerGrade(null); 등급은 실버로 지정해 둠
		Lee.bonusPoint = 1000;
		System.out.println(Lee.showInfo());
//		
		VipCustomer Kim = new VipCustomer(12333,"KIM");
//		Kim.setCustomerName("KIM");
//		Kim.setCustomerID(98765);
		Kim.setAgentName("Park");
		Kim.bonusPoint = 10000;
		System.out.println(Kim.showInfo());
		
		Customer vc = new VipCustomer(12345, "VC");
		// vip 인스턴스 상태여도 customer로 형변환(업캐스팅)되었기 때문에 customer가 가지고 있는것만 사용가능. 

	}

}
