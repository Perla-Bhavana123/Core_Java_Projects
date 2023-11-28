import java.util.Scanner;
public class Stringreverspolindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string1:");
		String s1=sc.next();
		
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.equals(s2)==true) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}

	}

}
