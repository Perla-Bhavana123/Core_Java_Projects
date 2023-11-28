import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="Bhavana";
	String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
			
		}
		System.out.println(r);
       
	}


}
