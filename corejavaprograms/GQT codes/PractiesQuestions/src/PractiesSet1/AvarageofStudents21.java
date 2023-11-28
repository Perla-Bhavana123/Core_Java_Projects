package PractiesSet1;
import java.util.Scanner;
public class AvarageofStudents21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of semesters:");
		int n=sc.nextInt();
		System.out.println("enter the marks for each semester");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		float avag;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avag=sum/n;
        System.out.println(avag);
	}

}
