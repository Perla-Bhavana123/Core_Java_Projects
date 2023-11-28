package PractiesSet2;
import java.util.Scanner;
public class Sorting0sand1s18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array:");
		int n=sc.nextInt();
		System.out.println("enter the array");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
