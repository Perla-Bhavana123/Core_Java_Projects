import java.util.Scanner;
public class StringAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s1=sc.nextLine();
        s1=s1.toLowerCase();
        int temp=0;
        for(int i=0;i<s1.length();i++) {
        	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
        		temp=s1.charAt(i);
        		System.out.println("the vowels are:"+s1.charAt(i)+"  ASCII value is:"+temp);
        	}
        }
        System.out.println();

	}

}
