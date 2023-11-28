import java.util.Scanner;
public class CopyElements1Ato2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
	         a2[j]=a[i];
	         j++;
	         }
		for(int i=0;i<=a2.length-1;i++) {
		System.out.println(a2[i]);
		}
		
	
	}
}
