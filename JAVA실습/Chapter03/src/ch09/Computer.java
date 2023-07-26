package ch09;

public abstract class Computer {

	//추상메서드 -> 하위 클래스에게 책임을 위임.
	abstract void display();
	abstract void typing();
	
	//공통으로 사용하는 메서드는 구현
	public void turnOn(){
		System.out.println("전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println("전원을 끕니다.");
	}

}
