package PractiesSet1;
import java.util.Scanner;
public class Swap2nowithout3rd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Before swaping :"+x+"  "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swaping :"+x+"  "+y);
	}

}
