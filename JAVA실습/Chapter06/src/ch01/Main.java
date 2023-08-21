package ch01;

public class Main {

	public void print(String txt) {
		System.out.println(txt);
	}
	class Sub {
		public void print() {
			Main.this.print("외부 클래스 print 메소드 호출");
			System.out.println("내부 클래스 pritn 메소드 호출");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.print("이렇게 하면?");
		Main.Sub s = new Main().new Sub();
		s.print();
	}

}
