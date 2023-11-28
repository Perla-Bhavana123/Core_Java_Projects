import java.util.Scanner;
public class largestofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//int n=sc.nextInt();
//int a[]=new int[n];
//int large=0;
//for(int i=0;i<a.length;i++) {
//	a[i]=sc.nextInt();
//}
//large=a[0];
//for(int i=0;i<a.length;i++) {
//	if(a[i]>large) {
//		large=a[i];
//	}
//}
//
//	System.out.println(large);
//
//
//	}

String s=sc.next();
String s1=" ";
s=s.toLowerCase();
for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
	s1=s1+"@";
	}
	else
	{
		s1=s1+s.charAt(i);
	}
}
System.out.println(s1);
	}
	

}
