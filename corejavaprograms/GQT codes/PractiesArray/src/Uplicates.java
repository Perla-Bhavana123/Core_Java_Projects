import java.util.Scanner;
public class Uplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
   String s=sc.next();
   int flag=1;
   for(int i=0;i<s.length();i++) {
	  for(int j=i+1;j<s.length();j++) {
		  if(s.charAt(i)==s.charAt(j)) {
//			  System.out.println(s.charAt(i));
			  flag=1;
		  }
		  else
		  {
//			  System.out.println("no dupilcate elements ");
			  flag=0;
		  }
	  }
	  if(flag==1) {
		  System.out.println(s.charAt(i));
	  }
   }
  
  
	}

}
