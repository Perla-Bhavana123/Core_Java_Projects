package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	LinkedList ll=new LinkedList();
         ll.add(100);
         ll.add(200);
         ll.add(300);
         ll.add(400);
         ll.add(500);
         System.out.println(ll);
         
         ll.addFirst(20);
         System.out.println(ll);
        ll.addLast(50);
        System.out.println(ll);
        ll.add(2, 45);
        System.out.println(ll);
       
        
   Object remove=ll.remove(2);
   System.out.println(remove);
   System.out.println(ll);
   
  Iterator e= ll.descendingIterator();
   System.out.println(e);
   System.out.println(ll);
   
   LinkedList l=new LinkedList();
   l.add(10);
   l.add(2);
   l.add(30);
   l.add(40);
   l.add("Bhavana");

 System.out.println(l);
 
 LinkedList<Integer> l1=new LinkedList<Integer>();
 l1.add(200);
 l1.add(100);
 l1.add(300);
 l1.add(400);
 l1.add(500);
 System.out.println(l1);

 l1.offer(200);
 System.out.println(l1);
 
 l1.offerFirst(20);
 System.out.println(l1);
 
 
 l1.offerLast(30);
 System.out.println(l1);
 
 l1.add(3, 35);
 System.out.println(l1);
 
 ll.offer(-1);
System.out.println(ll);
ll.offerFirst(-2);
System.out.println(ll);


ll.addAll(l);
System.out.println(ll);

ll.addFirst(l);
System.out.println(ll);

ll.clear();
System.out.println(ll);

ll.clone();
System.out.println(ll);


boolean b= ll.contains(l);
System.out.println(b);

boolean p=ll.containsAll(l);
System.out.println(p);


LinkedList<Integer> k=new LinkedList<Integer>();
k.add(2000);
k.add(1000);
k.add(3000);
k.add(4000);
k.add(500);
System.out.println(l1);



 Object d= descendingIterator(k);
 System.out.println(d);
}

	private static Object descendingIterator(LinkedList<Integer> k) {
		// TODO Auto-generated method stub
		return null;
	}

	
}