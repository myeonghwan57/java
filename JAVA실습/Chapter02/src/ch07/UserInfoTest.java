package ch07;

public class UserInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo UserKim = new UserInfo("TNVK","11111","kIM");
		System.out.println(UserKim.showUserInfo());
		
		UserInfo UserLee = new UserInfo("picolo","12345","LEE");
		System.out.println(UserLee.showUserInfo());
	}

}
