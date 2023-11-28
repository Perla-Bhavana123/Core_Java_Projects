import java.util.Scanner;
public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int start=sc.nextInt();
		int end=sc.nextInt();
		String s1="";
		
		for(int j=start;j<=end;j++){
	      s1=s1+s.charAt(j);	  
		}
		System.out.println(s1);
		
		}
		
	}
	


	



