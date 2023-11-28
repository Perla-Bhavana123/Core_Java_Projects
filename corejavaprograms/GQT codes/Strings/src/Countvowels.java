import java.util.Scanner;
public class Countvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String:");
	String s1=sc.nextLine();
	int count=0;
	for(int i=0;i<=s1.length()-1;i++) {
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
			count++;
		}
	}
	System.out.println(count);

	}

}
