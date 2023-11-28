import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        
        int c;
        System.out.println(a);
        System.out.println(b);
        
        for(int i=0;i<num;i++) {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.println(c);
        }
        
       
	}

}

