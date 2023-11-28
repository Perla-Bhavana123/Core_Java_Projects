package com.gqt.JavaCollection;
import java.util.ArrayList;
public class AddProgram {

	public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
	
	// add specific position
	al.add(2,100);
	System.out.println(al);
//	al.add(100,1000);
//	System.out.println(al);
	
	//Create another ArrayList
	
	ArrayList al1=new ArrayList();
	al1.add(100);
	al1.add(200);
	al1.add(300);
	al1.add(400);
	al1.add(500);
	System.out.println(al1);
	
	// Adding two arrays
	
	al.addAll(al1);
	System.out.println(al);
//	System.out.println(al1);
	
	// add arrays at specific position
	
	al.addAll(2,al1);
	System.out.println(al);
	
	al.add(al1);
	System.out.println(al);
	
	
	//add hetrogeneous and homogeneious data in th arrayList
	
	al1.add("Bhavana");
	al1.add(true);
	al1.add(234.233);
	al1.add(32647.23423f);
	al1.add('r');
	System.out.println(al1);
//crete only homogeneous arrayList
	
//	ArrayList<Integer> al2=new ArrayList<Integer>();
//	al2.add(100);
//	al2.add("Binu");
//	System.out.println(al2);
//	
	
	
	
	
	
	}
	}





