import java.util.Scanner;
public class sumofASCIIvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string value:");
		String s1=sc.nextLine();
		int temp=0;
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			 temp=s1.charAt(i);
			 sum=sum+temp;
			 System.out.println("the ASCII value of the :"+temp);
		}
		System.out.println(sum);

	}
	 


}
