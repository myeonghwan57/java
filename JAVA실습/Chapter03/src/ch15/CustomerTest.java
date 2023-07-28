package ch15;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.buy();
		c.sell();
		c.order();
		c.hello();
		
		
		Buy buyer = c;
		buyer.buy();
		buyer.order();
		
		
	}

}
