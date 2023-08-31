package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,4,3};

		Arrays.stream(arr).sorted().forEach(System.out::println);
		
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n-> System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
	
		
	}

}
