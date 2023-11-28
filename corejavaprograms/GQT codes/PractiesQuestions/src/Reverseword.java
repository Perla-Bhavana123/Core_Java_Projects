import java.util.Scanner;
public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string:");
            String s1=sc.nextLine();
            
            int sp_count=0;
            String s2="";
            for(int i=0;i<s1.length();i++) {
            	if(s1.charAt(i)==' ') {
            		sp_count=sp_count+1;
            	}
            }
            int word_count=sp_count+1;
            String str[]=new String[word_count];
            int count=0;
            for(int i=s1.length()-1;i>=0;i--) {
            	if(s1.charAt(i)==' ') {
            		str[count]=s2;
            		s2=" ";
            		count++;
            	}
            	else {
            		s2=s2+s1.charAt(i);
            	}
            }
            str[count]=s2;
            for(int i=str.length-1;i>=0;i--) {
            	System.out.print(str[i]+" ");
            }
	}

}
