package ch03;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber mynumber = (x, y) -> x > y ? x : y;
		
		System.out.println(mynumber.getMax(3, 5));
	}

}
