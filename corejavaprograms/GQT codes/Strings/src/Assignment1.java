import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		String s6="";
	
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='0'||s1.charAt(i)=='1'||s1.charAt(i)=='2'||s1.charAt(i)=='3'||s1.charAt(i)=='4'||s1.charAt(i)=='5'||s1.charAt(i)=='6'||s1.charAt(i)=='7'||s1.charAt(i)=='8'||s1.charAt(i)=='9') {
				
			s2=s2+s1.charAt(i);
			
			
				}
		
			
			else if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				s3=s3+s1.charAt(i);
				
			}
			
			else if(s1.charAt(i)=='$'||s1.charAt(i)=='&'||s1.charAt(i)=='@'||s1.charAt(i)=='#'||s1.charAt(i)=='?'||s1.charAt(i)=='!') {
				s4=s4+s1.charAt(i);
				
			}
		
			else if(s1.charAt(i)!='a'||s1.charAt(i)!='e'||s1.charAt(i)!='i'||s1.charAt(i)!='o'||s1.charAt(i)!='u'||s1.charAt(i)!='0'||s1.charAt(i)!='1'||s1.charAt(i)!='2'||s1.charAt(i)!='3'||s1.charAt(i)!='4'||s1.charAt(i)!='5'||s1.charAt(i)!='$'||s1.charAt(i)!='&'||s1.charAt(i)!='@') {
				
				s5=s5+s1.charAt(i);
				
			}
		}
		System.out.print(s2);
		System.out.println();
		System.out.print(s3);
		System.out.println();
		System.out.print(s4);
		System.out.println();
		System.out.print(s5);
		System.out.println();
		s6=s2+s3+s4+s5;
		System.out.println(s6);
		
		

	}
}



