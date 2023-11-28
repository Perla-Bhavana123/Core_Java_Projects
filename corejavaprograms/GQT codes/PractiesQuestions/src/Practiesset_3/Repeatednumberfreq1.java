package Practiesset_3;
import java.util.Scanner;
public class Repeatednumberfreq1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		System.out.println("enter the digit:");
		int D=sc.nextInt();
		int count=0;
		while(n>0) {
			count=(n%10==D)?count+1:count;
			n=n/10;
		}
        System.out.println(count);
	}

}
