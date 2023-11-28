import java.util.Scanner;
public class Merge2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
        System.out.println("enter the array:");
        
        
        int a[]=new int[n];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        
        
        System.out.println("enter the size:");
		int m=sc.nextInt();
        System.out.println("enter the array:");
        
        
        int b[]=new int[m];
        
        for(int i=0;i<m;i++) {
        	b[i]=sc.nextInt();
        }
        int c[]=new int[n+m];
        for(int i=0;i<n;i++) {
        	c[i]=a[i];
        System.out.println(c[i]);
        }
        
       
        }
        
	}


