package ch15;

public class Student {

	String stdName;
	int money;
	
	public Student(String stdName,int money) {
		this.stdName = stdName;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	public void showStdInfo(){
		System.out.println(stdName+ "님의 남은 돈은 "+money+" 원 입니다.");
	}
}
