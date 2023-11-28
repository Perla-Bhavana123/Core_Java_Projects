import java.util.Scanner;
public class EvenPrintOddPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		String s3="";
		
		for(int i=0;i<s1.length();i++) {
			if(i%2!=0) {
				s2=s2+s1.charAt(i);
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
			
		}
		System.out.println(s2+s3);
		
	}
}