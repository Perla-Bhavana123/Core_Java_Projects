import java.util.Scanner;
public class Repeatedcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String s1=sc.nextLine();
    
    s1.toCharArray();
   
     int s[]=new int[s1.length()];
     for(int i=0;i<s1.length()-1;i++) {
    	 for(int j=i+1;j<=s1.length()-1;j++) {
    		 if(s1.charAt(i)==s1.charAt(j) ) {
    			 System.out.println(s1.charAt(i));
           }
        }
    	
    	 }
    }

}
