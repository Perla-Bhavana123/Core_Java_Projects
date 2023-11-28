package PractiesSet2;
import java.util.Arrays;
import java.util.Scanner;

public class secondlargestnumber17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		       Arrays.sort(array);
		      int res = array[n-2];
		      System.out.println("2nd smallest element is ::"+res);
		   }

	}


