import java.util.Scanner;
public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		int temp=0;
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='e') {
				temp=s.charAt(i);
				System.out.println(s.charAt(i)+"   vowel is present  "+temp);
			}
		}
	}
}
