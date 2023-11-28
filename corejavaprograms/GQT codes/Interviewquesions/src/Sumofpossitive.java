import java.util.Scanner;
public class Sumofpossitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				temp=arr[i];
				sum=sum+temp;
				
			}
		}
		System.out.println(sum);
	   
		if(sum/2==0||sum%2==1) {
			System.out.println("the number perfect square root");
		}
		else 
		{
			
			
			System.out.println("the number is not perfect square root");
			
		}
		
	}

}
