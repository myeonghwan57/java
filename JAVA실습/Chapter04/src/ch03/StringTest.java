package ch03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); //힙 메모리는 생성될때마다 다른 주소를 가짐
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); //상수풀의 문자열은 모두 같은 주소를 가짐
		
	}

}
