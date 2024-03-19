package boj_14425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();//N�� �ش��ϴ� ���ڿ� ���� map
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String[] arr = new String[M];//M�� �ش��ϴ� ���ڿ� ���� �迭
		
		for(int i=0; i<N; i++) {//�Է�
			map.put(br.readLine(), 0);
		}
		for(int i=0; i<M; i++) {//�Է�
			arr[i]=br.readLine();
		}
		
		int answer = checkStr(map,arr);//���� S�� �ش��ϴ� ���� count
		System.out.println(answer);
	}
	
	//���� S�� �ش��ϴ� ���� count
	public static int checkStr(HashMap<String, Integer> map, String[] arr) {
		int cnt = 0;
		
		//arr�迭 ��, M�� �ش��ϴ� ���ڰ� �κ����� S(map)�� �ִٸ� cnt ����.
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) cnt++;
		}
		
		return cnt;
	}
}