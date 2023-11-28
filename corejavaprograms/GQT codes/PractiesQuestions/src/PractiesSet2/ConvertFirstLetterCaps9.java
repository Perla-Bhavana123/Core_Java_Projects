package PractiesSet2;
import java.util.Scanner;
public class ConvertFirstLetterCaps9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		System.out.println("enter the string:");
		//		String s=sc.nextLine();
		//		for(int i=0;i<s.length();i++) {
		//		
		//		s=s.substring(0,1).toUpperCase();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c+=1;
			}
		}
		String ar[]=new String[c+1];
		String ar1[]=new String[c+1];
		String dummy="";
		int j=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				ar[j]=dummy;
				j++;
				dummy="";
			}
			else {
				dummy=dummy+s.charAt(i);
			}
			ar[j]=dummy;
		}
		for(int i=0;i<ar.length;i++) {
			ar1[i]= ar[i].substring(0,1).toUpperCase()+ar[i].substring(1, ar[i].length()); 
		}
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
	}



}



