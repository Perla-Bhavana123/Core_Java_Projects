package PractiesSet1;
import java.util.Scanner;
public class OddPrime24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int flag=0;
		int sum=0;
		System.out.println("enter the min range");
		int n=sc.nextInt();
		System.out.println("enter the maximum range");
		int m=sc.nextInt();
		for(int i=n;i<m;i++) {
			for(int j=2;j<=i;j++) {

				if(i%j==0) {
					flag=0;
					break;
				}
				else
				{
					flag=1;
					break;
				}
			}

			if(flag==1) {
				System.out.println(i);
			}
		}
	}
}


