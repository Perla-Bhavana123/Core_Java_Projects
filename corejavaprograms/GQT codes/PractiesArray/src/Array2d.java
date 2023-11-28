import java.util.*;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the col:");
		int n=sc.nextInt();
		System.out.println("enetr the row");
		int m=sc.nextInt();
		int a1[][]=new int[n][m];
		int a2[][]=new int[n][m];
		int c[][]=new int[n][m];

		for(int i=0;i<n;i++) {
			System.out.println("col"+i);
			for(int j=0;j<m;j++) {
				System.out.println("row"+j);
				a1[i][j]=sc.nextInt();

			}
		}

		for(int i=0;i<n;i++) {
			System.out.println("col"+i);
			for(int j=0;j<m;j++) {
				System.out.println("row"+j);
				a2[i][j]=sc.nextInt();

			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a1[i][j]+a2[i][j];
			}
		}


		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c[i][j]+" 2");
			}
			System.out.println();

		}


	}

}
