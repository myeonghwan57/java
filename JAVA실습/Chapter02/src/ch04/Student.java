package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	//������ ���� ����Ʈ ������ ���� student();
	
	public void showStudentInfo() {
		System.out.println( studentID + " �й��� �̸��� "+ studentName + "�̰�, �ּҴ� "+ address+"�Դϴ�.");
	}
	
	public String getStudentName() { //��ȯ
		return studentName;
	} 
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
