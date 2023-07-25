package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
	ArrayList<Customer> customerList = new ArrayList<>();

	Customer T = new Customer(10001,"TTT");
	Customer J = new Customer(10002,"JJJ");
	Customer K = new GoldCustomer(10003,"KKK");
	Customer L = new GoldCustomer(10004,"LLL");
	Customer P = new VipCustomer(10005,"PPP");
	
	customerList.add(T);
	customerList.add(J);
	customerList.add(K);
	customerList.add(L);
	customerList.add(P);
//	
//	for(Customer c : customerList){
//		System.out.println(c.showInfo());
//		
//	}
	int price = 10000;
	for(Customer c : customerList) {
		System.out.println("=======================");
		System.out.println(c.getCustomerName()+" 님이 "+c.calcPrice(price)+" 원 지불하셨습니다.");
		System.out.println(c.getCustomerName()+ " 님의 현재 보너스 포인트는 " + c.bonusPoint + " 입니다.");
		
	}
	}

}
