package ch10;

public class ManualCar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("사람이 자동차를 멈춥니다.");
	}

	@Override
	public void wipe() {
		// TODO Auto-generated method stub
		System.out.println("사람이 와이퍼를 작동시킵니다.");
	}
	public void washCar() {
		System.out.println("사람이 세차를 합니다.");
	}
}
