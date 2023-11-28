import java.util.Scanner;
public class patterns01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n;
		n=sc.nextInt();
		
		
		for(int i=1;i<n;i++){
			for(int j=0;j<i;j++){
				
			System.out.print((i+j)%2);
			}
		    System.out.println();
			
			
		}

	}

}
