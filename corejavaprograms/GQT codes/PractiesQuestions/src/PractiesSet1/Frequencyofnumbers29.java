package PractiesSet1;
import java.util.Scanner;
public class Frequencyofnumbers29 {

	public static void main(String[] args) {
		int count=0;
		int n,d,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();

		System.out.println("digit\t frequency");
		for(int i=0;i<=9;i++) {
			count=0;
			t=n;
			while(t>0) {
				d=t%10;
				if(d==i) {
					count++;
				}
				t=t/10;
			}
			if(count>0) {
				System.out.println(i+"\t"+count);
			}
		}



	}
}





