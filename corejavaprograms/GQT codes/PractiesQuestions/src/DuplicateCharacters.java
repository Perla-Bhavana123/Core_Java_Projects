import java.util.Scanner;
public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nstring:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char[] str=s.toCharArray();
		int len[]=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			len[i]=1;
			for(int j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					len[i]++;
					str[j]=0;
				}

			}
		}
		for(int i=0;i<len.length;i++) {
			if(len[i]>1) {
				System.out.println(str[i]);
			}


	}

}
}
