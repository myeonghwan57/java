package ch06;

public class Student {
	
	public int grade;
	public String stdName;
	public int stdNumber;
	
	public Student() {}
	public Student(int grade, String stdName, int stdNumber ) {
		this.stdNumber = stdNumber;
		this.grade = grade;
		this.stdName = stdName;
		
	}
	public String showStdInfo() {
		return stdName + "학생의 학번은 " + stdNumber + " 이고, 학년은 " + grade +" 입니다." ;
	}
}
