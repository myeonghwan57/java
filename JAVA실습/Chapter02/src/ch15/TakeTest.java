package ch15;

public class TakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student E = new Student("Edward",20000);
	Taxi T1 = new Taxi("seongnam",0);
	
	E.takeTaxi(T1);
	E.showStdInfo();
	T1.showTaxiInfo();
	}

}
