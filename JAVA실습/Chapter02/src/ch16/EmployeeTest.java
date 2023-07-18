package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Lee = new Employee();
		Lee.setEmployeeName("LEE");
		
		System.out.println(Lee.getEmployeeId());
		
		Employee Kim = new Employee();
		Kim.setEmployeeName("KIM");
		System.out.println(Kim.getEmployeeId());

		
		Employee Park = new Employee();
		Park.setEmployeeName("PARK");
		System.out.println(Park.getEmployeeId());
	
		System.out.println(Employee.getSerialNum()); //현재 증가된 시리얼 넘버가 출력된다.
	}

}
