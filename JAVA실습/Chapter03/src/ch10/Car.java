package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wipe();
	
	public void startCar() {
		System.out.println("시동을 겁니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {}
	 final public void run() { //하위 클래스에서 재정의 못하도록 -> 상태를 유지하려고
		startCar();
		wipe();
		drive();
		stop();
		turnOff();
		washCar();

	} 
}
