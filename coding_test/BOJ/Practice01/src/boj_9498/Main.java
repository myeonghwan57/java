package boj_9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(100 >= score && 90<=score) {
			System.out.println("A");
		}
		else if(89 >= score && 80<=score) {
			System.out.println("B");
		}
		else if(79 >= score && 70<=score) {
			System.out.println("C");
		}
		else if(69 >= score && 60<=score) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
