import java.util.Scanner;
public class SubstringContain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("emnter the string 1:");
		String s=sc.next();
		System.out.println("enter the string2:");
		String s2=sc.next();
		if(s.contains(s2)==true) {
			System.out.println("true");
		}else
			{
			System.out.println("False");
		}

	}

}
