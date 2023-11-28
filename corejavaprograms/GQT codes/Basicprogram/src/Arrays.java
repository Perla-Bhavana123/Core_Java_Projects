import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the student no:"+(i+1));
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("The marks of student no:"+(i+1)+"is:"+(a[i]));
		}
		

	}

}
