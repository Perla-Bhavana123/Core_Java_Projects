package Practiesset_3;
import java.util.Scanner;
public class SumofPrime20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int sum=0;
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
		int count=0;
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			sum=sum+i;
		}
	}
	System.out.println(sum);

}
}
