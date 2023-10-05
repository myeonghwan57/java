package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파벳을 쓰고 Enter를 누르세요.");
		int i;
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read())!= '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
