package ch03;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		System.out.println(java); //concat을 하게되면 다른 메모리 주소를 가르킨다.
		System.out.println(System.identityHashCode(java));
	}

}
