import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		for(int i=0;i<=s1.length();i++) {
	   char[] c1 = s1.toCharArray();
	   char[] c2 = s2.toCharArray();
		
	     Arrays.sort(c1);
         Arrays.sort(c2);
         Arrays.equals(c1,c2);
		}
       if(s1.equals(s2)==true) {
        	 System.out.println("angram");
       }
        	 else
        	 {
        		 
        	 System.out.println("not anagram");
	      
	}
		}
}
	

		
	
	   
		
		
		

	
