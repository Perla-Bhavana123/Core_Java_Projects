import java.util.Scanner;
public class Bigint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
			int n=sc.nextInt();
			System.out.println("enter the key value");
			int key=sc.nextInt();
			
			n=n+key;
			System.out.println("the sum of the number:"+n);
			n=n*key;
			System.out.println("the mul of the number os:"+n);
		}

	}


