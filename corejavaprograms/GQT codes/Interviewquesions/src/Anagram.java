import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the String1");
   String s1=sc.nextLine();
   System.out.println("enter the string2"); 
   String s2=sc.nextLine();
   int sum=0;
   int temp;
   for(int i=0;i<s1.length();i++) {
	   temp=s1.charAt(i);
	   sum=sum+temp;
	   
   }
   System.out.println(sum);
   
   int sum2=0;
   for(int i=0;i<s2.length();i++)
   {
	   temp=s2.charAt(i);
	   sum2=sum2+temp;
   }
   System.out.println(sum2);
      
   
   
   if(sum==sum2) {
	   System.out.println("the given string is anagram");
   }
   else
   {
	   System.out.println("the given string is not a anagram");
   }
   
	}

}
