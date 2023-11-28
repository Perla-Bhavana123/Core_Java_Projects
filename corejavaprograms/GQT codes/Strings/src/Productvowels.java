import java.util.Scanner;
public class Productvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		int temp=0;
		int product=1;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				temp=s1.charAt(i);
				System.out.println("the ascii value of "+s1.charAt(i)+temp);
				product=product*temp;
				
			}
		}
		System.out.println(product);

	}

}
