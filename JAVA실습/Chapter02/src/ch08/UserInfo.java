package ch08;

public class UserInfo {

	
	public int height;
	public int weight;
	public String name;
	public int age;
	
	public UserInfo(int height, int weight, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	public String showUserInfo() {
		return "키가 " + height+ "이고 몸무게는 " + weight + " 인 남성이 있습니다. 남성의 이름은 " + name + " 이고, 나이는 " + age + " 입니다." ;
	}
}
