package ch14;

public class Student {
	String stdName;
	int money; 
	
	
	public Student() {
		
	}
	public Student(String stdName, int money) {
		this.stdName = stdName;
		this.money = money;
		
	}
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	public void showInfo() {
		System.out.println(stdName + " 학생의 남은 잔액은 "+ money+ " 원 입니다." );
	}
}
