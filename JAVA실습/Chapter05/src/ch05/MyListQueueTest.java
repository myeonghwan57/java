package ch05;

public class MyListQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyListQueue listqueue = new MyListQueue();
		listqueue.enQueue("A");
		listqueue.enQueue("B");
		listqueue.enQueue("C");
		
		listqueue.printAll();
		
		System.out.println(listqueue.deQueue());
		System.out.println(listqueue.deQueue());
		
	}

}
