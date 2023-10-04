package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TravelCustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravelCustomer customerlee = new TravelCustomer("LEE", 30, 100);
		TravelCustomer customerkim = new TravelCustomer("KIM", 29, 190);
		TravelCustomer customerpark = new TravelCustomer("PARK", 19, 50);
		
		ArrayList<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerpark);
		customerList.add(customerkim);
		customerList.add(customerlee);
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(s->s.getName()).forEach(s->System.out.println(s));
	
		System.out.println("여행 비용");
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
	
		System.out.println("나이가 20세 이상인 사람");
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("나이순 출력");
		customerList.stream().sorted(Comparator.comparing(TravelCustomer::getAge)).forEach(s->System.out.println(s.getAge() +", "+ s.getName()));
	}

}