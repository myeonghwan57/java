package boj_10815;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		List<Integer> Nlist = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			Nlist.add(sc.nextInt());
		}
		int M = sc.nextInt();
		List<Integer> Mlist = new ArrayList<>();
		int [] arr = new int[M];
		for (int i = 0; i < M; i++) {
			Mlist.add(sc.nextInt());
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (Nlist.get(i) == Mlist.get(j)) {
					arr[j]=1 ;
				} 
				
			}
		}
		for(int i = 0; i<M ;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
