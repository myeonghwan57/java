package ch07;

public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo(){
		System.out.println("기본생성자");
	}
		
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	public String showUserInfo() {
		return " 사용자의 아이디는 " + userId + " 이고, 사용자의 이름은 "  + userName + " 입니다." ;
	}
	
}
