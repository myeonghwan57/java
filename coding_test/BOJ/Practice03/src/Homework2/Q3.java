package Homework2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // �� ���� A, B, C�� �Է¹���
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
    
        // A * B * C�� ������� ���
        int result = A * B * C;

        // 0���� 9������ ���� ������ ������ �迭
        int[] counts = new int[10];
        //counts = [0, 1, 1, 1, 1, 0, 0, 0, 0, 0]
        //          0  1  2  3  4  5  6  7  8  9
        // ��������� �� ���ں� ������ ����
        while (result > 0) {           // 
            int digit = result % 10;   // ���� �ڸ��� ����
            counts[digit]++;           // �ش� ������ ���� ����
            result /= 10;              // ���� �ڸ��� �̵�
        }

        // ��� ���
        for (int i = 0; i < 10; i++) {
            System.out.println(counts[i]);
        }
    }
}