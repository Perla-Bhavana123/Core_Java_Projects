import java.util.Scanner;
public class ThreeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    System.out.println("enter the matrix");
      int a[][]=new int[n][n];
      int a1[][]=new int[n][n];
      int a2[][]=new int[n][n];
      
      
      for(int i=0;i<=a.length-1;i++) {
    	  for(int j=0;j<=a[i].length-1;j++) {
    		  a[i][j]=sc.nextInt();
    	  }
    	  
      }
      for(int i=0;i<=a1.length-1;i++) {
    	  for(int j=0;j<=a1[i].length-1;j++) {
    		  a1[i][j]=sc.nextInt();
    	  }
    	  
      }

      for(int i=0;i<=a2.length-1;i++) {
    	  for(int j=0;j<=a2[i].length-1;j++) {
    		  a2[i][j]=sc.nextInt();
    	  }
    	  
      }
      int a3[][]=new int[n][n];
      for(int i=0;i<a3.length-1;i++) {
    	  for(int j=0;j<=a3[i].length-1;j++) {
    		  a3[i][j]=a[i][j]+a1[i][j]+a2[i][j];
    	  }
      }
     
      for(int i=0;i<a3.length-1;i++) {
    	  for(int j=0;j<=a3[i].length-1;j++) {
    		  System.out.println(a3[i][j]);
    	  }
    		  
    	  }
      
      
      
      
	}

}
