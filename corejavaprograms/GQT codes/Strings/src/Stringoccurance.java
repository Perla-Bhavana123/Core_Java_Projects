import java.util.*;
public class Stringoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		int len;
		String s1=sc.nextLine();
		char[] c1 = s1.toCharArray();
		
		for(int i=0;i<=s1.length()-1;i++) {
			  n[i]=1;
			for(int j=1+1;j<s1.length();i++) {
				if(c1[i]==c1[j]) {
			     n[i]++;
				  c1[j]=0;
					
				}
			}
		}
		for(int i=0;i<n.length();i++) {
			if(c1[i]==' '||c1[i]==0) {
				
			}
			else {
				System.out.println(c1[i]+"----"+len[i]);
			}
		}

	}

}
