package ch16;

public class Employee {

	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	
	public static int getSerialNum() {  //static 메서드 안에서는 인스턴스 변수 사용 금지.
		int i = 0;//지역 변수는 static 함수에서 사용가능.
		
		
		return serialNum;
	}


	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int empliyeeId) {
		this.employeeId = empliyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
