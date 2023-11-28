import java.util.Scanner;
public class Array4D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("university count:");
		int u=sc.nextInt();
		System.out.println("enter the college count:");
		int c=sc.nextInt();
		System.out.println("enter the class count:");
		int cls=sc.nextInt();
		System.out.println("enter the student count:");
		int stu=sc.nextInt();
		String a[][][][]=new String[u][c][cls][stu];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the univercity number:"+(i+1));
			for(int j=0;j<a[i].length;j++) {
				System.out.println("inside college no"+(j+1));
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("enter the class number:"+(k+1));
					for(int l=0;l<a[i][j][k].length;l++) {
						System.out.println("enter the student name:"+(k+1));
					
					a[i][j][k][l]=sc.next();
				}
			}
		}
		}
	//display
	for(int i=0;i<a.length;i++) {
		System.out.println("inside language "+(i+1));
		for(int j=0;j<a[i].length;j++) {
			System.out.println("inside jonner "+(j+1));
			for(int k=0;k<a[i][j].length;k++) {
				System.out.println(" enter movie name:"+(k+1));
			for(int l=0;l<a[i][j][k].length;l++) {
				System.out.println(" the name of the movie "+(l+1)+"is"+a[i][j][k][l]);
	

           }
		}
	}
	}
	}


}


