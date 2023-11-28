package Practiesset_3;
import java.util.Scanner;
public class Foreachloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		System.out.println("enter the array:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
       for(int num:a) {
    	   System.out.println(num);
       }
	}

}
