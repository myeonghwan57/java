package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,5,4,3}; // 배열 생성 
		
		for (int num: arr) {
			System.out.println(num);
		}
		System.out.println();
		
		Arrays.stream(arr).sorted().forEach(System.out::println);
						//중간연산		//최종연산 으로 구분 됨 -> 최종연산은 마지막에 하나만 적용됨. -> 중간연산에 대한 결과를 알수 없음. 
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n-> System.out.println(n)); //한번 사용한 is는 재사용 불가 새로운 스트림 생성해야함.
		
		int sum = Arrays.stream(arr).sum();
		long cnt = Arrays.stream(arr).count();
		System.out.println(sum);
		System.out.println(cnt);
		

	}

}
