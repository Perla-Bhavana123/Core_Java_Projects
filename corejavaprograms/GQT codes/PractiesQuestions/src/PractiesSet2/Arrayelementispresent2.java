package PractiesSet2;
import java.util.Scanner;
public class Arrayelementispresent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int n=sc.nextInt();
		System.out.println("enter the array :");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int flag=0;
		System.out.println("enter the key value:");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				flag=1;
				System.out.println(i);
				break;
			}
		}
		if(flag==0) {
			System.out.println("not contain");
		}
	}
}
