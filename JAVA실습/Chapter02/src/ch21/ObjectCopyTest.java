package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("==library=="); //원본
		for(int i =0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showInfo();
		}
		
		
		
		System.out.println("==copy library=="); // 복사
		for(int i =0; i<copyLibrary.length; i++) {
			System.out.println(copyLibrary[i]);
			copyLibrary[i].showInfo();
		}
		
		copyLibrary[0].setAuthor("김명환"); //주소를 공유하기 때문에 변경도 같이 된다.
		
		System.out.println("==library=="); //원본
		for(int i =0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showInfo();
		}
		
		
		System.out.println("==copy library=="); // 복사
		for(int i =0; i<copyLibrary.length; i++) {
			System.out.println(copyLibrary[i]);
			copyLibrary[i].showInfo();
		}
	}

}
