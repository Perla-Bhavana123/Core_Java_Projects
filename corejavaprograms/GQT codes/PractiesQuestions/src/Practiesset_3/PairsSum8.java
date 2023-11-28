package Practiesset_3;
import java.util.Scanner;
public class PairsSum8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the sum value:");
		int s=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==s) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
