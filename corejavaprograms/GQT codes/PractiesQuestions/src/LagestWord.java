import java.util.Scanner;
public class LagestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		String w="";
		String lw="";
		String[] s1=new String[100];
		int length=0;
		s=s+" ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				w=w+s.charAt(i);
			}
			else {
				s1[length]=w;
				length++;
				w="";
			}
		}
		lw=s1[0];
		for(int k=0;k<length;k++) {
			if(lw.length()<s1[k].length())
				lw =s1[k];
				
		}
		System.out.println(lw);
		
	}

}
