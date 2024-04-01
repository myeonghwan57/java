package Homework02;

import java.util.*;

public class Q4 {
	// ������ �������� ���� ���
	public static void notEmpty(List strList, String str) {
		int totalLength = 0; // ��� ���̸� ���ϱ� ���� �ܾ���� �ѱ����� ��
		for (int i = 0; i < strList.size(); i++) {
			totalLength += ((String) strList.get(i)).length(); // �ܾ���� �� ����
		}
		int avg = totalLength / strList.size(); // ��� ����
		for (int i = 0; i < strList.size(); i++) {
			if(((String) strList.get(i)).length()<=avg) { //��ձ��̺��� ũ�� �ʴٸ� 
				strList.remove(i); // �ش� �ε����� �ܾ� ����
				strList.add(str); // �ܿ� �ܾ� �߰� 
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �ϱ� ������ �ܾ�
		int W = sc.nextInt(); // �ܾ��� ��
		sc.nextLine(); // ���� ���� ����
		String[] words = sc.nextLine().split(" ");

		List<String> memory = new ArrayList<>();
		int time = 0;
		for (int i = 0; i < W; i++) {
			if (memory.contains(words[i])) { // �ܾ��忡 �ִ� �ܾ �ϱ��� �ܾ ������
				memory.remove(words[i]); // �ش� �ܾ ����Ʈ���� �����ϰ�
				memory.add(words[i]);
				time += 1;
			} else { // ���ԵǾ� ���� ������
				if (memory.size() < N) { // �ϱ��� �� �ִ� ������ ������ ��
					memory.add(words[i]); // ���ο� �ܾ �߰���
					time += 3; // �������� ã�� ����ϴ� �ð� �߰�
				} else { // ������ �������� ���� ��
					notEmpty(memory, words[i]); 
					time += 3;
				}
			}
		}
		System.out.println(time);
	}

	
}
