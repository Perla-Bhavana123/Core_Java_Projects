import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string");
		String s1=sc.next();
		int temp=0;
		int sum=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||(s1.charAt(i)=='e')||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				temp=s1.charAt(i);
				sum=sum+temp;
			}
			
		}
		System.out.println(sum);
		int n=sum;
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0){
					count++;
				}
			}
			if(count==0  ) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
				break;
			}
			
		}

	}
}

