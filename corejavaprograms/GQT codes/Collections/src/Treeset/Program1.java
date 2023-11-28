package Treeset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Program1 {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		System.out.println(t);

		int d = t.ceiling(32);
		System.out.println(d);

		NavigableSet<Integer> p = t.descendingSet();
		System.out.println(p);

		int t1 = t.floor(25);
		System.out.println(t1);

		int i = t.higher(30);
		System.out.println(i);

		t.pollFirst();
		System.out.println(t);

		t.pollLast();
		System.out.println(t);

		SortedSet<Integer> r = t.tailSet(30);
		System.out.println(r);

		NavigableSet<Integer> b = t.tailSet(33, false);
		System.out.println(b);

		Stream<Integer> s = t.stream();
		System.out.println(s);

		Spliterator<Integer> h = t.spliterator();
		System.out.println(h);
		
		

	}

}
