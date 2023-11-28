import java.util.Scanner;
public class RevereWords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		//-------------------------------------------------------------------------------		
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='e') {
		//				System.out.println(s.charAt(i));
		//			}
		//		}
		//------------------------------------------------------------------------------
		//	char[] c=s.toCharArray();
		//	for(int i=0;i<c.length;i++) {
		//	  for(int j=i+1;j<c.length;j++) {
		//		  if(c[i]==c[j]) {
		//			  System.out.println(c[i]);
		//		  }
		//	  }
		//	}
		//------------------------------------------------------------------------------
		//		char[] c=s.toCharArray();
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)==' ') {
		//				
		//			}
		//			System.out.print(c[i]);


		//		}
		//----------------------------------------------------------------------
		//		System.out.println("Enter sub string");
		//		String s2=sc.nextLine();
		//		if(s.contains(s2)==true) {
		//			System.out.println("contains");
		//		}
		//		else
		//		{
		//			System.out.println("not contains");
		//		}
		//-----------------------------------------------------------------------------------------
		//int count=0;
		//		for(int i=0;i<s.length();i++) {
		//				if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='e') {
		//			
		//			count++;
		//		}
		//		}
		//		System.out.println(count);
		//		
//-------------------------------------------------------------------------------
		//		int s_count=0;
		//		String s2="";
		//		int word_count=0;
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)==' ') {
		//				s_count=s_count+1;
		//			}
		//		}
		//		word_count=s_count-1;
		//		
		//		String str[]=new String[word_count];
		//		int count=0;
		//		
		//		for(int i=s.length();i>0;i++) {
		//			if(s.charAt(i)==' ') {
		//				str[count]=s2;
		//				s2=" ";
		//				count++;
		//			}
		//			else
		//			{
		//			s2=s2+s.charAt(i);	
		//			}
		//		}
		//		
		//		str[count]=s2;
		//		
		//		for(int i=str.length-1;i>=0;i--) {
		//			System.out.println(str[i]+" ");
		//		}
		//		
		//  
		//		
int c=0;
		int temp=0;
		for(int i=0;i<s.length();i++) {
			temp=temp+s.charAt(i)+10;
			System.out.println((char)temp);

		}
		
		
	}
}





