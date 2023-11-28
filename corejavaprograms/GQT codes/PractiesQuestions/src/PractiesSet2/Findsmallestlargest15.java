package PractiesSet2;
import java.util.Scanner;
public class Findsmallestlargest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		 int large,small,i;
			
			large=small=a[0];
			for(i=1;i<a.length;i++)
			{
			if(a[i]>large)
			large=a[i];

			if(a[i]<small)
			small=a[i];
			}
	        System.out.println("the largest element in an array:"+large);
	        System.out.println();
			System.out.println("the smallest element in an array:"+small);
			}
		

	}


