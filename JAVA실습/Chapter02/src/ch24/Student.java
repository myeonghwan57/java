package ch24;
import java.util.*;
public class Student {

	public int stdNum;
	public String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int stdNum, String stdName) {
		this.stdName = stdName;
		this.stdNum = stdNum;
		subjectList = new ArrayList<Subject>();
	}
	public void addSubject(String subName, int score){
		Subject subject = new Subject();
		
		subject.setSubName(subName);
		subject.setScore(score);
		subjectList.add(subject);
		
		
	}
	public void showInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScore();
			System.out.println(stdName+" 학생의 "+ s.getSubName()+ " 과목 성적은 " + s.getScore()+" 점 입니다.");
		}
		System.out.println("총점은 "+ total +"입니다.");
	}
	
}
