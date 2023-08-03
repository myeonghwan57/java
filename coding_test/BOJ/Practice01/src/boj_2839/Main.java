package boj_2839;

import java.util.Scanner;

//정확하게 N 킬로 배달해야한다.
//3킬로 5킬로 최대한 적은 봉지 가져가려고 한다.
//18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
//만들수 없다면 -1출력 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		while(N>=0) {
			if (N%5 == 0) {
				cnt += (N/5);
				System.out.println(cnt);
				break;
			} 
			N -= 3;
			cnt++;
		}
		if (N<0) {
			System.out.println(-1);
		}
		
	}

}
