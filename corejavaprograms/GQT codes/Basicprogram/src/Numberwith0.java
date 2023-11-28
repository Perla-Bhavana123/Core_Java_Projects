import java.util.Scanner;

public class Numberwith0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=25;
		for(int i=1;i<=n;i++) {
			int k=count;
			for(int j=1;j<=n;j++) {
				if(count<10) {
					System.out.print("0"+k + " ");
				}else {
				System.out.print(k+ " ");				}
				k=k-1;
				count--;
			}
			System.out.println();
			
			}
			
	}

}
