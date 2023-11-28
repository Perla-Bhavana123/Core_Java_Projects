package PractiesSet1;
import java.util.Scanner;
import PractiesSet2.LongestWordFunction6;
public class LargestWordFunction7 {
	public class LongestWordFinder {
		String findLongestWord(String s) {
			 int leng=1;
	      for(int i=0;i<s.length();i++) {
	     	 if(s.charAt(i)==' ') {
	     		leng++; 
	     	 }
	      }
	      System.out.println(leng);
	      int count=0;
	      String a[]=new String[leng];int j=0;
	      String s3="";
	      for(int i=0;i<s.length();i++) {
	     	 
	     	 if(s.charAt(i)!=' ') {
	     		 s3+=s.charAt(i);
	     	 }
	     	 else {
	     		 j++;
	     		 s3="";
	     	 }
	     	a[j]=s3;
	      }
	      int max=0;
	      String n="";
	     for(int i=0;i<a.length;i++) {
	     	if(a[i].length()>max) {
	     		max=a[i].length();
	     	    n=a[i];
	     	};
	     }
	     return n;
		}
        public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner sc=new Scanner(System.in);
	       String s=sc.nextLine();
	       LongestWordFunction6 l=new LongestWordFunction6();
	       System.out.println(l.findLongestWord(s));
	}
	}
}
