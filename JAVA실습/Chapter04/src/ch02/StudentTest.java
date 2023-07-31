package ch02;

public class StudentTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student std1 = new Student(11111, "LEE");
		Student std2 = new Student(11111, "LEE");
		Student std3 = std1; //같은 주소값을 가진다.
		 
		System.out.println(std1 == std2); //주소는 다르지만 
		System.out.println(std1.equals(std2)); //논리적으로는 같음.
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1)); //실제 해시코드값
		System.out.println(System.identityHashCode(std2)); //실제 해시코드값
		
		
		std1.setStudentName("KIM");
		//인스턴스의 상태를 그대로 복제
		Student copystudent =(Student)std1.clone();
		System.out.println(copystudent);
//		
//		System.out.println();
//		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//	
	}

}
