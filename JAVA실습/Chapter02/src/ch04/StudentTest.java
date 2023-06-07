package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student(); //생성자 하나를 생성해라. 한명의 학생을 생성하는것. Lee -> 인스턴스 클래스를 기반으로 여러개의 인스턴스 생성.
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address= "서울시 강남구"; //Lee.멤버변수
		
		studentLee.showStudentInfo();
		
		Student studentKim =new Student();
		studentKim.studentName ="KIM";
		studentKim.studentID=11111;
		studentKim.address="경기도 성남시";
			
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
