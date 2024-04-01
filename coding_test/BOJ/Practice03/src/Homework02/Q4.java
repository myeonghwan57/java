package Homework02;

import java.util.*;

public class Q4 {
	// 공간이 남아있지 않은 경우
	public static void notEmpty(List strList, String str) {
		int totalLength = 0; // 평균 길이를 구하기 위한 단어들의 총길이의 합
		for (int i = 0; i < strList.size(); i++) {
			totalLength += ((String) strList.get(i)).length(); // 단어들의 총 길이
		}
		int avg = totalLength / strList.size(); // 평균 길이
		for (int i = 0; i < strList.size(); i++) {
			if(((String) strList.get(i)).length()<=avg) { //평균길이보다 크지 않다면 
				strList.remove(i); // 해당 인덱스의 단어 제거
				strList.add(str); // 외운 단어 추가 
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 암기 가능한 단어
		int W = sc.nextInt(); // 단어의 수
		sc.nextLine(); // 개행 문자 제거
		String[] words = sc.nextLine().split(" ");

		List<String> memory = new ArrayList<>();
		int time = 0;
		for (int i = 0; i < W; i++) {
			if (memory.contains(words[i])) { // 단어장에 있는 단어가 암기한 단어에 있을때
				memory.remove(words[i]); // 해당 단어를 리스트에서 제거하고
				memory.add(words[i]);
				time += 1;
			} else { // 포함되어 있지 않을때
				if (memory.size() < N) { // 암기할 수 있는 공간이 남았을 때
					memory.add(words[i]); // 새로운 단어를 추가함
					time += 3; // 사전에서 찾아 대답하는 시간 추가
				} else { // 공간이 남아있지 않을 때
					notEmpty(memory, words[i]); 
					time += 3;
				}
			}
		}
		System.out.println(time);
	}

	
}
