import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("emter the n value");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("enter the element position:"+i+1);
			a[i][j]=sc.nextInt();
		}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("enter the element position:"+j+1);
			b[i][j]=sc.nextInt();
		}
		}
		int c[][]=new int[n][n];
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("the addition of matrix are:");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.println(c[i][j]+" ");
			}
		}
		System.out.println();
	}
}