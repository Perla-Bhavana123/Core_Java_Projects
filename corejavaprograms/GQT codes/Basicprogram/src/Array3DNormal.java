import java.util.Scanner;
public class Array3DNormal {

	public static void main(String[] args) {
	
				Scanner sc=new Scanner(System.in);
				System.out.println("enter language count:");
				int lan=sc.nextInt();
				System.out.println("enter the jonner count:");
				int jon=sc.nextInt();
				System.out.println("enter the movies count:");
				int mov=sc.nextInt();
				String a[][][]=new String[lan][jon][mov];
				
				for(int i=0;i<a.length;i++) {
					System.out.println("inside language no"+(i+1));
					for(int j=0;j<a[i].length;j++) {
						System.out.println("inside jonner no"+(j+1));
						for(int k=0;k<a[i][j].length;k++) {
							System.out.println("enter the name of movie:"+(k+1));
							a[i][j][k]=sc.next();
						}
					}
				}
				
			
			for(int i=0;i<a.length;i++) {
				System.out.println("inside language count"+(i+1));
				for(int j=0;j<a[i].length;j++) {
					System.out.println("inside jonner count:"+(j+1));
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println(" enter movie name:"+(k+1));
						
					}
				}
			}
			for(int i=0;i<a.length;i++) {
				System.out.println("inside language "+(i+1));
				for(int j=0;j<a[i].length;j++) {
					System.out.println("inside jonner "+(j+1));
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println(" the name of the movie "+(k+1)+"is"+a[i][j][k]);
			

		           }
				}
			}
			}

		

	}


