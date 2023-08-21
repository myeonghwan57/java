package ch02;
class Outter{
	int outNum = 100; // 인스턴스 변수
	static int sNum = 200;
	
	Runnable getRunnable(final int i) {
		
		final int num = 0;
		
		class MyRunnable implements Runnable{ //내부클래스
			
			int localNum = 1000;
			
			public void run() { 
				System.out.println("i = " + i);
				System.out.println("num = "+ num);
				System.out.println("localNum = " +localNum);
				
				System.out.println("outNum = "+outNum+"(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = "+ Outter.sNum+ "(외부 클래스 정적 변수)");
				
			}
		}
		return new MyRunnable();// 클래스 생성후 반환
	}
}
public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable runnable =	out.getRunnable(1000000);
		runnable.run();

	}

}
