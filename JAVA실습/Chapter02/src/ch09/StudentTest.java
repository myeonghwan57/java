package ch09;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stdLee = new Student(100, "LEE");
		stdLee.setKoreaSubject("korea", 100);
		stdLee.setMathSubject("math", 90);
		
		Student stdKim = new Student(200, "KIM");
		stdKim.setKoreaSubject("korea", 50);
		stdKim.setMathSubject("math", 30);
		
		stdLee.showScoreInfo();
		stdKim.showScoreInfo();
	}

}
