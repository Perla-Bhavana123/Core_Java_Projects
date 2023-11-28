import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=sc.nextLine();
      System.out.println("enter the string2");
      String s2=sc.nextLine();
      if(s1.contains(s2)==true) {
    	  System.out.println("the strings contais sub string:");
      }
      else
      {
    	  System.out.println("string not contain the sub string");
      }
	}

}
