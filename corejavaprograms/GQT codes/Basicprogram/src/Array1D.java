import java.util.Scanner;
public class Array1D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the class count:");
		int c=sc.nextInt();
		System.out.println("enter the student number");
		int s=sc.nextInt();
		String a[][]=new String[c][s];
		for(int i=0;i<a.length;i++) {
			System.out.println("class number"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("enter the student name:"+(j+1));
				a[i][j]=sc.next();
			}
		}
		//Displaying the student names
		
		for(int i=0;i<a.length;i++) {
			System.out.println("inside the class"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("the name of the studentno:"+(j+1) +a[i][j]);
			}
		}
	}
		

}


