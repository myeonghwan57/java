package ch15;

public interface Buy {

	void buy();
	
	default void order() { //구현내용 포함 가능
		System.out.println("buy order");
	}
}
