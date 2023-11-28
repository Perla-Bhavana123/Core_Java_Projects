package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);
		al.add(200);
		
		System.out.println(al);
		// --------------print the elements in normal method-----------
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		
		
		

		//-----------Print the array elements in reverse order-------------
		
		System.out.println("-------------------------------");
	    ListIterator listIterator = al.listIterator(al.size());
	    while(listIterator.hasPrevious()==true) {
	    	System.out.println(listIterator.previous());
	    	
	    	
	    }
	    System.out.println("-------------------------------");
		
	}

	
	    

	}


