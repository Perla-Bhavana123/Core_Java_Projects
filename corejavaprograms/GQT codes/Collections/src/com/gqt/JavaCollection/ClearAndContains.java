package com.gqt.JavaCollection;

import java.util.ArrayList;

public class ClearAndContains {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
	    a.add(300);
	    a.add(400);
        a.add(500);
        System.out.println(a);
        
        //clear the data in the arrayList
        
//        a.clear();
//        System.out.println(a);
//        
        
        //get the duplicate copy for the arrayList
        
        a.clone();
        System.out.println(a);
        
        //check the given element is present or not in an arrayList
        
        boolean res=a.contains(100);
        System.out.println(res);
        
        res=a.contains(75);
        System.out.println(res);
        
        ArrayList al=new ArrayList();
    	al.add(10);
    	al.add(20);
    	al.add(30);
    	al.add(40);
    	al.add(50);
    	System.out.println(al);
    	
    	
    	al.addAll(a);
    	System.out.println(al);
    	res=al.containsAll(a);
    	System.out.println(res);
    	
    	
        
       
        
		
		
		
		

	}

}
