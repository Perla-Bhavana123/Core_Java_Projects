import java.util.ArrayList;
import java.util.Collections;

public class Collectionclasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(100);
		al.add(300);
		al.add(400);
		al.add(150);
		al.add(20);
		al.add(80);
		al.add(100);
		al.add(500);
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		System.out.println(Collections.frequency(al, 300));
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 100));
		Collections.reverse(al);
		System.out.println(al);
		Collections.replaceAll(al, 20, 25);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
		Collections.nCopies(20, al);
		System.out.println(al);


	}

}
