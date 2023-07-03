package ch06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(3,"LEE",12345);
		System.out.println(studentLee.showStdInfo());
	
		Student studentKim = new Student();
		studentKim.stdName="Kim";
		System.out.println(studentKim.showStdInfo());
	}
	

}
