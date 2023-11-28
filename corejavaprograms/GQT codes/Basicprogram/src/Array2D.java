import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the class:");
		int c=sc.nextInt();
		String a[][]=new String[c][];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the student"+(i+1));
			a[i]=new String[sc.nextInt()];
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the class no:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the name of students no:"+ (j+1));
				a[i][j]=sc.next();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("the array is:"+(i+1)+"are " +a[i][j]);
			}
		}

	}

}
