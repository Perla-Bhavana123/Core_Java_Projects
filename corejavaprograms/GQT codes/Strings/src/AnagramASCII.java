import java.util.*;

public class AnagramASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int sum=0;
	
		int temp=0;
		for(int i=0;i<=s1.length()-1;i++) {
			temp=s1.charAt(i);
			sum=sum+temp;
			}
		System.out.println(sum);
		int sum2=0;
		for(int i=0;i<=s2.length()-1;i++) {
			temp=s2.charAt(i);
			sum2=sum2+temp;
		}
		System.out.println(sum2);
		if(sum==sum2) {
			System.out.println("the string is anagram");
		}
		else
		{
			System.out.println("the string is not anagram");
		}
}
}
