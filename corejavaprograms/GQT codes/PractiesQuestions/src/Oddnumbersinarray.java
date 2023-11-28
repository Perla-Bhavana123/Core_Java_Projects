import java.util.Scanner;
public class Oddnumbersinarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<=a.length-1;i++) {
			a[i]=sc.nextInt();
			
		}
		int flag=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.println("array not contain odd integers");
				flag=1;
				break;
			}
			if(flag==0){
				System.out.println("the array contain odd integes");
				break;
			}
			
			
			
		}
	}

}
