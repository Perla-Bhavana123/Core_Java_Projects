import java.util.*;
public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the array:");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the key value");
		int k=sc.nextInt();
		
	
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

		
	


