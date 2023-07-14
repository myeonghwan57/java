package ch14;



public class TakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student James = new Student("James",5000);
		Student Tomas = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		
		James.takeBus(bus100);
		James.showInfo();
		bus100.showInfoBus();
		
		Subway line2 = new Subway(2);
		
		Tomas.takeSubway(line2);
		Tomas.showInfo();
		line2.showInfoSubway();
	}

}
