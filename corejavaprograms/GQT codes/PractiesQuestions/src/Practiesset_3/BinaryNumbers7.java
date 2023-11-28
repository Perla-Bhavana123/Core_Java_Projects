package Practiesset_3;
import java.util.Scanner;
public class BinaryNumbers7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the a number:");
		int n=sc.nextInt();
		int a[]=new int[100];
		int i=0;
		while(n>0) {
			a[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}

	}

}
