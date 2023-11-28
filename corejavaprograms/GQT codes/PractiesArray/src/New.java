import java.util.Scanner;
public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++) {
    	a[i]=sc.nextInt();
    }
    int temp=0;
    int temp1=0;
    for(int i=0;i<=a.length-1;i++) {
    	if(a[i]%2==0) {
    		temp=temp+a[i];
    		
    	}
    	else
    	{
    		temp1=temp1+a[i];
    		
    	}
    }
    System.out.println("even number"+temp);
    System.out.println("odd number"+temp1);
    	}

}
