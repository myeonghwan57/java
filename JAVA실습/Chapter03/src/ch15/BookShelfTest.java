package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new BookShelf();
		
		q.enQueue("해리포터1");
		q.enQueue("해리포터2");
		q.enQueue("해리포터3");
		q.enQueue("해리포터4");
		q.enQueue("해리포터5");
		
		System.out.println(q.getSize());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
	
	}

}
