import java.util.Scanner;
public class jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Array");
     int n=sc.nextInt();
    int a[][]=new int[n][];
    for(int i=0;i<a.length;i++) {
    	System.out.println("enter the class count");
    		a[i]=new int[sc.nextInt()]; 
    	}
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a[i].length;j++) {
		System.out.println(a[i][j]);
	}
}
}
}
