package Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    HashSet<Integer> h=new HashSet<Integer>();
	    h.add(56);
	    h.add(57);
	    h.add(58);
	    h.add(59);
	    h.add(60);
	    System.out.println(h);
	    
	    int g=h.hashCode();
	    System.out.println(g);
	    Object[] a=h.toArray();
	    System.out.println(a);
	  
	    
	   
	    
	    
	}
}
