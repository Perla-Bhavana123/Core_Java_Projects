import java.util.*;
public class Wordspacecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the string:");
	    String s1=sc.nextLine();
	    String s2="";
	    int spc_cnt=0;
	    for(int i=0;i<s1.length();i++) {
	    	if(s1.charAt(i)==' ')
	    	{
	    		spc_cnt++;
	    		}
	    	}
	    int word_cnt=spc_cnt+1;
	    String str[]=new String[word_cnt];
	    int count=0;
	    for(int i=s1.length()-1;i>=0;i--) {
	    	if(s1.charAt(i)==' ') {
	    		str[count]=s2;
	    		s2="";
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
