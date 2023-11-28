import java.util.Scanner;
public class Arraypolindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<a1.length;i++) {
			a1[i]=sc.nextInt();
		}
		for(int i=a1.length-1;i>=0;i--) {
			a2[i]=a1[i];
		  
		}
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		
		

	}

}
