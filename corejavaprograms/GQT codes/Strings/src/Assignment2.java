import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();

		
	   for(int i=0;i<s1.length();i++) {
		   if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
			System.out.print("#");
			
		   }
		   else
		   {
			   System.out.print(s1.charAt(i));
		   }
	   }
	

	}

}
