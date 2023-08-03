package boj_2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String [] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = sc.next();
		
		
		for (int i = 0; i<cro.length; i++) {
			word = word.replace(cro[i], "*");
		}
		System.out.println(word.length());
	}

}
