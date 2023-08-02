package boj_2738;


import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] numArray1 = new int [N][M];
		int[][] numArray2 = new int [N][M];

		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				numArray1[i][j] = sc.nextInt();
			}
		
		}
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				numArray2[i][j] = sc.nextInt();
			}
		
		}
		
		for (int i = 0; i<N; i++) {
			for (int j = 0; j < M; j++) {
			System.out.print(numArray1[i][j] + numArray2[i][j]+" ");
			if(j==M-1) 
				System.out.println();
			}
		}
		
	}

}
