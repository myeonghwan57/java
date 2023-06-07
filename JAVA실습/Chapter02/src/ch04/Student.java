package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	//������ ���� ����Ʈ ������ ���� student();
	
	public void showStudentInfo() {
		System.out.println( studentID + " 학번의 학생 이름은 "+ studentName + "이고, 주소는 "+ address+" 입니다.");
	}
	
	public String getStudentName() { //��ȯ
		return studentName;
	} 
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
