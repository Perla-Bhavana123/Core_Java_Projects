import java.util.Arrays;
import java.util.Scanner;
public class NegativefollowedPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
     
      int a[]=new int[n];
     
      for(int i=0;i<n;i++) {
    	  a[i]=sc.nextInt();
      }
     Arrays.sort(a);
     for(int i=0;i<a.length;i++) {
    	 System.out.print(a[i]+" ");
     }
	}
	
}
     
    		  
    
      
	

