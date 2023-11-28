package PractiesSet2;
import java.util.Scanner;
public class StartEnd4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string: ");
	     String S = sc.next();
	     System.out.println("Enter a start value:");
	     int start = sc.nextInt();
	     System.out.println("Enter a end value:");
	     int end = sc.nextInt();
	     String s2=" ";
//	     String S1 = S.substring(start,end+1);
//	     System.out.println(S1);
	     char []s1=S.toCharArray();
	     for(int i=start;i<=end;i++) {
	    	 if(i>=start&&i<=end) {
	    		 s2=s2+S.charAt(i);
	    	 }
	    	
	     }
	     System.out.println(s2);
	}

	}


