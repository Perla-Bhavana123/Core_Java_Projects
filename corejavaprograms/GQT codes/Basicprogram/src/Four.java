import java.util.Scanner;
public class Four {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	for(int i=0;i<=n-1;i++) {
        		for(int j=0;j<=n-1;j++) {
        			if(i+j==n/2||i==n/2 && j<=(3*n/4)||j==n/2 && i<=(3*n/4)) {
        				System.out.print("* ");
        			}
        			else
        			{
        				System.out.print("  ");
        			}
        		}
        		System.out.println();
        	}
        	
        	
        }
}