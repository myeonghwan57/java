package boj_28278;

import java.util.Scanner;
import java.util.Stack;

//정수를 저장하는 스택을 구현한 다음 입력으로 주어진응 명령을 처리하는 프로그램을 작성하시오.
//1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
//2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
//3: 스택에 들어있는 정수의 개수를 출력한다.
//4: 스택이 비어있으면 1, 아니면 0을 출력한다.
//5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //명령어 개수 
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
