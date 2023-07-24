package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Customer Lee = new Customer(12345,"LEE");
		// Lee.setCustomerGrade(null); 등급은 실버로 지정해 둠
		Lee.bonusPoint = 1000;
		int price_l = Lee.calcPrice(1000);
		System.out.println(Lee.showInfo());
		System.out.println(price_l);
//		
		VipCustomer Kim = new VipCustomer(12333,"KIM");
		Kim.setAgentName("Park");
		Kim.bonusPoint = 10000;
		int price_k = Kim.calcPrice(1000); //재정의된 clacPrice
		System.out.println(Kim.showInfo());
		System.out.println(price_k);
		
		
		
		Customer vc = new VipCustomer(12345, "VC");
		// vip 인스턴스 상태여도 customer로 형변환(업캐스팅)되었기 때문에 customer가 가지고 있는것만 사용가능. 
		
		System.out.println(vc.calcPrice(1000)); //

	}

}
