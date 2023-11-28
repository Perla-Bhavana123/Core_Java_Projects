package PractiesSet1;
import java.util.Scanner;
public class CountUcaseLcase8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		int Uppercount=0; 
		int Lowercount=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<=90) {
				Uppercount++;
			}
			if(s.charAt(i)>90) {
				Lowercount++;
			}
		}
		System.out.println("Uppercase letter count:"+Uppercount);
		System.out.println("Lowercase letter count:"+Lowercount);
	}
	
}

