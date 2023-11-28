package PractiesSet1;
import java.util.Scanner;
public class RemovespacesInString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the String:");
        String s1=sc.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)==' ') {
        		
        	}
        	else {
        	    s2=s2+s1.charAt(i);
        	   
        	   }
        }
        System.out.println(s2);
        	
        }
	}


