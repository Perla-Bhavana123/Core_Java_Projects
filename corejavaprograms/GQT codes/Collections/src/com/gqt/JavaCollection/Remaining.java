package com.gqt.JavaCollection;

import java.util.ArrayList;

public class Remaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
		a.add(100);
		a.add(300);
		a.add(400);
		a.add(100);
		System.out.println(a);
		int s=a.size();
		System.out.println(s);
		a.ensureCapacity(10);
		s=a.size();
		System.out.println(s);
		
	Object b=a.get(2);
		System.out.println(b);
		System.out.println(a.getClass());
		
		int f=a.hashCode();
		System.out.println(f);
		
		int index=a.indexOf(100);
		System.out.println(index);
		
		boolean b1=a.isEmpty();
		System.out.println(b1);
		
		int i=a.lastIndexOf(100);
		System.out.println(i);
		
		Object rem=a.remove(5);
		System.out.println(rem);
	    System.out.println(a);
	    
	    ArrayList k=new ArrayList();
	    
		
	}
	

}
