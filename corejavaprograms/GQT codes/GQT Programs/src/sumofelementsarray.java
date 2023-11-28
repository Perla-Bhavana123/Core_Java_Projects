import java.util.Scanner;
public class sumofelementsarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=sc.nextInt();
		System.out.println("enter the array elements:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++) {
			c=c+a[i];
		}
		System.out.println(c);

	}

}
