package boj_28278;

import java.util.Scanner;
import java.util.Stack;

//������ �����ϴ� ������ ������ ���� �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//1 X: ���� X�� ���ÿ� �ִ´�. (1 �� X �� 100,000)
//2: ���ÿ� ������ �ִٸ� �� ���� ������ ���� ����Ѵ�. ���ٸ� -1�� ��� ����Ѵ�.
//3: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
//4: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
//5: ���ÿ� ������ �ִٸ� �� ���� ������ ����Ѵ�. ���ٸ� -1�� ��� ����Ѵ�.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //��ɾ� ���� 
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i<9; i++) {
			int cmd = sc.nextInt();
			if (cmd == 1) {
				int num = sc.nextInt();
				stack.push(num);
			}
			else if (cmd == 2) {
				if (stack.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(stack.pop().toString());
				}
			}
			else if (cmd == 3) {
				System.out.println(stack.size());
			}
			else if(cmd == 4) {
				if (stack.isEmpty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else {
				if (stack.isEmpty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(stack.peek().toString());
				}
			}
		}

	}

}
