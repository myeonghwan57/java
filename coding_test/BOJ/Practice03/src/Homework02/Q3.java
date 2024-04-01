package Homework02;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int[] scores = new int[N];
		String[][] ob = new String[2][N];
		for(int i = 0; i<N; i++ ) {
			scores[i] = sc.nextInt();
		}
		for(int i =0 ;i<2; i++ ) {
			ob[i] = sc.next().split("");
		}
		for(int i = 0 ;i<N;i++) {
			if(ob[0][i].equals("O") && ob[0][i].equals("O")) {
				sum += scores[i];
			}
		}
		System.out.println(sum);
		
	}

}
