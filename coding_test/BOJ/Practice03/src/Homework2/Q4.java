package Homework2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("��й�ȣ�� �Է��ϼ���: ");
        String password = scanner.nextLine();
        
        for(int i = 0;i<password.length(); i++) {
        	char ch = password.charAt(i);
        	
        	if (ch >= 'a' && ch <= 'z') {
        		char convertCh = (char) (ch + 4);
            	if (convertCh > 'z') {
            		convertCh -= 26;
                }
            	System.out.print(convertCh); 
        	}
        	
        	else if (ch >= 'A' && ch <= 'Z') {
                // �� ��° ���� ���ĺ����� ��ȯ
                char convertCh = (char) (ch + 4);
                // ���� �� ��° ���� ���ĺ��� 'Z'�� �Ѿ�� ���ĺ� ��ȯ ó��
                if (convertCh > 'Z') {
                	convertCh -= 26;
                }
                System.out.print(convertCh); 
        	}
        	 
        }
        	
	}

}
