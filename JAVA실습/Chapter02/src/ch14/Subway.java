package ch14;

public class Subway {
	int subNum;
	int passengerCount;
	int money;
	
	public Subway(int subNum) {
		this.subNum = subNum;
	}
	public void take(int money) { //학생이 지불한 돈
		this.money += money;
		passengerCount++;
	}
	public void showInfoSubway() {
		System.out.println(subNum+ "호선의 승객수는 " +passengerCount+ " 명 이고, 총 금액은 " +money+" 원 입니다.");
	}
}
