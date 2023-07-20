package ch21;

public class ObjectCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] library = new Book[5];
		Book[] copy = new Book[5];
		
		System.out.println("==library==");
		for (int i = 0; i<library.length; i++) {
			library[i] = new Book("태백산맥"+(i+1),"조정래");
			library[i].showInfo();
		}
		for (int i = 0; i<copy.length; i++) {
			copy[i] = new Book();
		}
		System.out.println("==copy==");
		for (int i = 0; i<copy.length; i++) {
			copy[i].setTitle(library[i].getTitle());
			copy[i].setAuthor(library[i].getAuthor());
			copy[i].showInfo();
		}
		
		copy[4].setAuthor("김명환");
		System.out.println("==library02==");
		for (int i = 0; i<library.length; i++) {
			library[i].showInfo();
		}
		System.out.println("==copy02==");
		for (int i = 0; i<copy.length; i++) {
			copy[i].showInfo();
		}
	}

}
