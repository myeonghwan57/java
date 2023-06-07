package ch04;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	//생성자 없음 디폴트 생성자 생성 student();
	
	public void showStudentInfo() {
		System.out.println( studentID + " 학번의 이름은 "+ studentName + "이고, 주소는 "+ address+"입니다.");
	}
	
	public String getStudentName() { //반환
		return studentName;
	} 
	public void setStudentName(String name) {
		studentName = name;
	}
	
}
