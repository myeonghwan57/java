package ch12;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("noname",1);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showPerson() {
		System.out.println(name + ", "+age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p0 = new Person();
		Person p1 = new Person();
		Person p2 = new Person("Kim",29);
		p1.name = "Lee";
		p1.age = 12;
		p0.showPerson();
		p1.showPerson();
		p2.showPerson();
		
		System.out.println(p0);
		Person p3 = p0.getPerson();
		System.out.println(p3);
	}
}
