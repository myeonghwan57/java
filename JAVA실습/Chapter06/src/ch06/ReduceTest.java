package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
}
public class ReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] greetings = {"안녕하세요...","hello","Good Moring", "반갑습니다.~~~~~~"};
		
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
			{if(s1.getBytes().length >= s2.getBytes().length ) return s1;
			else return s2;}
			)); //람다식
		
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
