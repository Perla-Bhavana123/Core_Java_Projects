import java.util.Scanner;
public class ArrayComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the n value:");
		    
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    for(int i=0;i<a.length;i++) {
		    
		    	a[i]=sc.nextInt();
		    }
		    for(int i=0;i<a.length;i++) {
		    	b[i]=sc.nextInt();
		    }
		    for(int i=0;i<a.length;i++) {
		    	
		    
		    	
		    		if(a[i]==b[i]) {
		    		 System.out.println("the given two arrays are equal");
		    			}
		    		else
		    		{
		    			System.out.println("not equal");
		    		}
		    		}
		    	}
		    }

		    	
		   

	


