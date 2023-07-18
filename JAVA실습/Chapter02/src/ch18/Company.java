package ch18;

public class Company {

	private static Company instance = new Company(); //유일한 객체 
	
	private Company() { //private로 생성자 제공 외부에서 접근(new 해서 사용)하지 못하도록 
		
	}
	public static Company getInstance() { //접근하기 위한 메서드 static으로 하는이유 -> 하나의 인스턴스로만 접근해야하니까(클래스 이름으로)
		
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
