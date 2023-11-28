import java.util.Scanner;
public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				System.out.println("enter language count:");
				int lan=sc.nextInt();
				String a[][][]=new String[lan][][];
	          for(int i=0;i<a.length;i++) {
	        	  System.out.println("enter the jonner count:");
	        	  a[i]=new String[sc.nextInt()][];
	        	 }
	               
	             for(int i=0;i<a.length;i++) {
	        	  for(int j=0;j<a[i].length;j++) {
	        	System.out.println("enter the moview count:");
	        		  a[i][j]=new String[sc.nextInt()];
	        		  
	        	  
	          }
	             }   
				
				for(int i=0;i<a.length;i++) {
				System.out.println("inside language count"+(i+1));
				for(int j=0;j<a[i].length;j++) {
					System.out.println("inside jonner count:"+(j+1));
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println(" enter movie name:"+(k+1));
						a[i][j][k]=sc.next();
						
					}
				}
				}
			
			for(int i=0;i<a.length;i++) {
				System.out.println("inside language "+(i+1));
				for(int j=0;j<a[i].length;j++) {
					System.out.println("inside jonner "+(j+1));
					for(int k=0;k<a[i][j].length;k++) {
						System.out.println(" the name of the movie "+(i+1)+"and type"+(j+1)+"is:"+a[i][j][k]);
			

		           }
				}
			}
			}

		

	}


