import java.util.Scanner;
public class Avarageelementsofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++) {
			temp=temp+a[i];
		}
		double Avarage=0;
		Avarage=temp/n;
		System.out.println(Avarage);
	}

}
