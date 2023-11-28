package PractiesSet2;
import java.util.Scanner;
public class DuplicateCharacters1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nstring:");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char[] str=s.toCharArray();

		for(int i=0;i<=str.length;i++) {
			int count=0;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=' ') {
					count++;
					str[j]='0';
				}

			}
			if(count>1 && str[i]!='0') {
				System.out.println(str[i]);
			}


		}

	}
}
