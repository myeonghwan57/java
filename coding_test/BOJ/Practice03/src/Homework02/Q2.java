package Homework02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int N = sc.nextInt();
		int sum =0;
		for(int i = start; i<= end; i++) {
			if(i % N == 0 ) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
