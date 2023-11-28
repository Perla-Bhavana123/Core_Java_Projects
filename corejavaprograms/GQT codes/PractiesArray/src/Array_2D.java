import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the class count");
 int n=sc.nextInt();

 int a[][][]=new int[n][n][n];

 for(int i=0;i<a.length;i++) {
	 System.out.println("enter the class :"+i);
	 for(int j=0;j<a[i].length;j++) {
		 System.out.println("enter the student :"+j);
			for(int k=0;k<a[i][j].length;k++) {
				
				System.out.println("enter the stent marks"+k);
				 a[i][j][k]=sc.nextInt();
			}
	 }
 }
 for(int i=0;i<a.length;i++) {
	 System.out.println("class"+i);
	 for(int j=0;j<a[i].length;j++) {
		 System.out.println("class"+j);
		 for(int k=0;k<a[i][j].length;k++) {
			 System.out.println(" stent marks"+k);
			 System.out.println(a[i][j][k]);
		 }
		
	 }
 }
 
 
	}

}
