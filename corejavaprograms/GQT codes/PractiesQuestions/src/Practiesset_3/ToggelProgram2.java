package Practiesset_3;
import java.util.Scanner;
public class ToggelProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");

		String s=sc.nextLine();
		String s1="";

		for(int i=0;i<s.length();i++) { 
			if(Character.isUpperCase(s.charAt(i))) {
				s1=s1+Character.toLowerCase(s.charAt(i));
			}
			if(Character.isLowerCase(s.charAt(i))) {
				s1=s1+Character.toUpperCase(s.charAt(i));
			}

		}
		System.out.println(s1);
	}
}

