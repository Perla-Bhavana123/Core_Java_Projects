import java.util.Scanner;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		    System.out.println("enter the n value:");
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<a.length;i++) {
		    	a[i]=sc.nextInt();
		    }
		    for(int i=0;i<a.length;i++) {
		    	for(int j=i+1;j<a.length;j++) {
		    		int temp=0;
		    		if(a[i]>a[j]) {
		    			
		    			if(a[i]>a[j]) {
		    				temp=a[i];
		    				a[i]=a[j];
		    				a[j]=temp;
		    			}
		    		}
		    	}
		    }
		    	
		    for(int i=0;i<a.length;i++) {
		    	System.out.println(a[i]);
		    }
		    System.out.println("the maximum number of the array is:"+a[n-1]);
		    System.out.println("the second largest number in the array is:"+a[n-2]);
		    System.out.println("The third largest number in the given array:"+a[n-3]);
		    System.out.println("the elment with minimu value:"+a[n-5]);
		    System.out.println("the element with second min value:"+a[0]);
		    }

	}


