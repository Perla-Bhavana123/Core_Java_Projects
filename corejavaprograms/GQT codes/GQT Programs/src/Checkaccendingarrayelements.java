import java.util.Scanner;
public class Checkaccendingarrayelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
          int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<a.length;i++) {
        	 a[i]=sc.nextInt();
         }
         int flag=0;
         for(int i=1;i<a.length;i++) {
        	 if(a[i]<a[i-1]) {
        		 flag=1;
        		 break;
        	 }
         }
         if(flag==1) {
        	 System.out.println("Array is not sorted");
         }
         else
         {
        	 System.out.println("Array is sorted order");
         }
	}

}
