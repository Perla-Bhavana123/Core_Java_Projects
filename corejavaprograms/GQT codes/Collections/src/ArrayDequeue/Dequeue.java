package ArrayDequeue;

import java.util.ArrayDeque;

public class Dequeue {

	public static void main(String[] args) {
		ArrayDeque a=new ArrayDeque();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add("bhanu");
		System.out.println(a);
		
		a.addFirst(5);
		a.addLast(70);
		System.out.println(a);
		
		a.remove(20);
		System.out.println(a);
        a.toArray();
        System.out.println(a);
        ArrayDeque a1=new ArrayDeque();
        a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(400);
		a1.add(500);
		a1.add(600);
		a1.add(700);
		System.out.println(a1);
        a1.addAll(a);
        System.out.println(a1);
        a.push(a1);
        System.out.println(a);
      
	}

	

}
