import java.util.Scanner;
public class Fibonancii {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array1 size:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the array2 size");
		int m=sc.nextInt();
		int a2[]=new int[m];
		for(int i=0;i<m;i++) {
			a2[i]=sc.nextInt();
		}
		int a3[]=new int[n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]!=a2[j]) {
					a3[i]=a[i];
				}
			}
		}		
	System.out.println("enter the k value");
	int k=sc.nextInt();
	for(int i=0;i<a3.length;i++) {
		System.out.println(a3[i]);
		if(k==i) {
			System.out.println(i+"---->"+a3[i]);
		}
	}

	}

}
