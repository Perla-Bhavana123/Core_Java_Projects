import java.util.Scanner;
public class ConvertFirstLetterCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
		
		s=s.substring(0,1).toUpperCase();

	}

}
}
