package boj_2839;

import java.util.Scanner;

//��Ȯ�ϰ� N ų�� ����ؾ��Ѵ�.
//3ų�� 5ų�� �ִ��� ���� ���� ���������� �Ѵ�.
//18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
//����� ���ٸ� -1��� 
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
