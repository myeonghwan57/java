package ch19;

public class Car {

	private int CarNum;
	
	public static int serialNum = 1000;

	public Car() {
		serialNum++;
		CarNum = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
	
	
}
