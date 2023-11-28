import java.util.Scanner;
public class Copyemelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n value"); 
		int n=sc.nextInt();
		int a[]=new int[n];
		int a2[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<a.length;i++) {
			a2[j]=a[i];
			j++;
		}
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}

	}

}
