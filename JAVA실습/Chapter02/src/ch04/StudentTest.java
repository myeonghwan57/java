package ch04;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student(); //������ �ϳ��� �����ض�. �Ѹ��� �л��� �����ϴ°�. Lee -> �ν��Ͻ� Ŭ������ ������� �������� �ν��Ͻ� ����.
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address= "����� ������"; //Lee.�������
		
		studentLee.showStudentInfo();
		
		Student studentKim =new Student();
		studentKim.studentName ="KIM";
		studentKim.studentID=11111;
		studentKim.address="��⵵ ������";
			
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
