package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("====데스크탑====");
	}
	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("====데스크탑 타이핑====");
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	
		System.out.println("데스크탑의 전원을 켭니다.");
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
		System.out.println("데스크탑의 전원을 끕니다.");
	}
	public void delete() {
		System.out.println("데스크탑 삭제");
	}
	
	

}
