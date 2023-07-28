package ch15;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("Customer Sell");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("Customer Buy");
	}

	public void order() {
		System.out.println("Customer order");
	}
	public void hello() {
		System.out.println("hello");
	}

}
