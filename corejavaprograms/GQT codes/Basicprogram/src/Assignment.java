import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]!=a[j]) {
					System.out.println(a[j]);
				}
				else
				{
					System.out.println(a[i]);
					
				}
			}
		}
		

	}
}

