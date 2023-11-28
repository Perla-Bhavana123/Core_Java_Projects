import java.util.Scanner;

public class equaloperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String s1=sc.nextLine();
		System.out.println("enter the string");
		String s2=sc.nextLine();
		if(s1==s2) {
			System.out.println("the strings address are equa");
		}
		else
		{
			System.out.println("the strings address are not equal");
		}
		if(s1.equals(s2)==true) {
			System.out.println("is equal");
			
		}
		else
		{
			System.out.println("not equal");
		}
	}

}
