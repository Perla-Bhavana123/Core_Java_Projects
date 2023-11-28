import java.util.Scanner;
public class frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=new String(sc.next());
		char str[]=s1.toCharArray();
		int len[]=new int[s1.length()];
		for(int i=0;i<s1.length();i++) {
			len[i]=1;
			for(int j=i+1;j<s1.length();j++) {
				if(str[i]==str[j]) {
					len[i]++;
					str[j]=0;

				}
			}
		}
		for(int i=0;i<len.length;i++) {
			if(str[i]==' '||str[i]==0) {

			}
			else 
			{
				System.out.println(str[i]+"---"+len[i]);
			}
        }
	}
}


