import java.util.Arrays;
import java.util.Scanner;
public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="Bhavana";
		s=s.toLowerCase();
		System.out.println(s);
        char[] s2=s.toCharArray();
        
        Arrays.sort(s2);
        for(int i=0;i<s2.length;i++) {
        System.out.print(s2[i]);
	}
	
}
}

