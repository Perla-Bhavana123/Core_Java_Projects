package PractiesSet1;
import java.util.Arrays;
import java.util.Scanner;

public class secondlargestnumber19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<=array.length-1;i++) {
			array[i]=sc.nextInt();
		}
		      
		      Arrays.sort(array);
		      
		      int res = array[n-2];
		      System.out.println("2nd smallest element is ::"+res);
		   }

	}


