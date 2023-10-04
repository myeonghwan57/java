package ch05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");

		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		
		sList.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s)); //역순
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s));
		System.out.println();
		
		sList.stream().filter(s->s.length() >= 5).forEach(n->System.out.println(n));
		System.out.println();
		
		Stream.of(sList).forEach(s-> System.out.println(s));
		
	}

}
