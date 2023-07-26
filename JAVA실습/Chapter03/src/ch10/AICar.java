package ch10;

public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("AI가 자율주행을 합니다.");
		System.out.println("AI가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("AI가 자율주행을 멈춥니다.");
	}

	@Override
	public void wipe() {
		// TODO Auto-generated method stub
		System.out.println("AI가 와이퍼를 작동시킵니다.");
	}
	public void washCar() {
		System.out.println("자동세차를 합니다.");
	}
}
