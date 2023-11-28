import java.util.*;
public class Equalsignorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string 1:");
		String s1=sc.next();
		System.out.println("enter the string 2:");
		String s2=sc.next();
		if(s1.equalsIgnoreCase(s2)==true) {
			System.out.println("strings are equal:");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

}
