package ch15;

public class Taxi {

	String taxiName;
	int money;
	
	public Taxi (String taxiName, int money) {
		this.money = money;
		this.taxiName = taxiName;
	}
	public void take(int money) {
		this.money += 10000;
	}
	public void showTaxiInfo() {
		System.out.println(taxiName+ "의 수입은 " +money+" 원 입니다.");
	}
}
