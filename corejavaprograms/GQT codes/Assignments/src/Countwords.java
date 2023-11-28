import java.util.Scanner;
public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int space_count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==  ' ') {
				space_count=space_count+1;
			}                                                                                                                                   
		}
		int word_count=space_count+1;
		System.out.println(word_count);

	}

}
