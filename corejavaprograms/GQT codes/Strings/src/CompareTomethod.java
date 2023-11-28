import java.util.Scanner;
public class CompareTomethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		System.out.println("enter the string");
		String s2=sc.nextLine();
		if(s1.compareTo(s2)==0) {
			System.out.println("the strings are equa");
		}
		else
		{
			System.out.println("the strings are not equal");
		}
		

	}

}
