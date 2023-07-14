package ch14;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	public void take(int money) { //학생이 지불한 돈
		this.money += money;
		passengerCount++;
	}
	public void showInfoBus() {
		System.out.println(busNum+ " 번의 버스의 승객수는 " +passengerCount+ " 명 이고, 총 금액은 " +money+" 원 입니다.");
	}
}
