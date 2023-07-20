package ch24;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stdLee = new Student(1001,"Lee");
		
		stdLee.addSubject("국어",100);
		stdLee.addSubject("수학",50);
		
		Student stdKim = new Student(1002,"Kim");
	
		stdKim.addSubject("국어",50);
		stdKim.addSubject("수학",100);
		stdKim.addSubject("영어",70);
	
		stdLee.showInfo();
		System.out.println("====================================");
		stdKim.showInfo();
		
	}

}
