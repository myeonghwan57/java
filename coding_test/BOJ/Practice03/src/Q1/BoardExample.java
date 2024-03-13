package Q1;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = new String[100][4];
		Scanner input = new Scanner(System.in);
		board[0][0] = "1";
		board[0][1] = "ù��° �����Դϴ�.";
		board[0][3] = "ȫ�浿";
		board[1][0] = "2";
		board[1][1] = "���� �����ϴ� ���";
		board[1][3] = "��浿";
		while (true) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("��ȣ            ����                     �۾���");
			System.out.println("--------------------------------------------");
			System.out.println();
			for (int i = 99; i >= 0; i--) {
				if (board[i][0] != null) {
					System.out.printf("%s%20s%18s\n", board[i][0], board[i][1], board[i][3]);
				}
			}
			System.out.println();
			System.out.println("�޴�: 1.���� | 2.���� | 3.���� | 4.���� | 5.����");
			System.out.println("���� > ");
			String strNum = input.nextLine();
			if (strNum.equals("1")) {
				System.out.print("���� > ");
				String title = input.nextLine();
				System.out.print("���� > ");
				String content = input.nextLine();
				System.out.print("�۾��� > ");
				String author = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] == null) {
						board[i][0] = i + 1 + "";
						board[i][1] = title;
						board[i][2] = content;
						board[i][3] = author;
						break;
					}

				}
			} else if (strNum.equals("2")) {
				System.out.println("�Խù� ��ȣ �Է� > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						System.out.println();
						System.out.println("��ȣ: " + board[i][0]);
						System.out.println("����: " + board[i][1]);
						System.out.println("�۾���: " + board[i][3]);
						System.out.println("����: " + board[i][2]);
						break;
					}
				}
			} else if (strNum.equals("3")) {
				System.out.println("�Խù� ��ȣ �Է� > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						System.out.print("���� > ");
						String title = input.nextLine();
						System.out.print("���� > ");
						String content = input.nextLine();
						System.out.print("�۾��� > ");
						String author = input.nextLine();

						board[i][1] = title;
						board[i][2] = content;
						board[i][3] = author;

						break;
					}
				}

			} else if (strNum.equals("4")) {
				System.out.println("�Խù� ��ȣ �Է� > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						board[i][0] = null;
						board[i][1] = null;
						board[i][2] = null;
						board[i][3] = null;
						System.out.println("�Խù��� �����Ǿ����ϴ�.");
						for (int j = i; j < 100 - 1; j++) {
							if (board[j + 1][0] != null) {
								board[j][0] = Integer.parseInt(board[j + 1][0]) - 1 + "";
								board[j][1] = board[j + 1][1];
								board[j][2] = board[j + 1][2];
								board[j][3] = board[j + 1][3];

								board[j + 1][0] = null;
								board[j + 1][1] = null;
								board[j + 1][2] = null;
								board[j + 1][3] = null;
							}
						}
						break;
					}
				}

			} else if (strNum.equals("5")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}

		}
	}
}
