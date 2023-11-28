import java.util.InputMismatchException;
import java.util.Scanner;


public class Trywithmulticatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numerator:");
			int numerator=sc.nextInt();
			System.out.println("enter the denominator");
			int denominator=sc.nextInt();
			int result=numerator/denominator;
			System.out.println("results is:"+result);
			System.out.println("enter the array size:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("enter the value to be added");
			int value=sc.nextInt();
			System.out.println("enetr the possition to add the value");
			int position=sc.nextInt();
			arr[position]=value;
			System.out.println("value added");
			}
			catch(ArithmeticException e) {
				System.out.println("Divide by o is not permited");
			}
			catch(InputMismatchException|NullPointerException e2) {
				
			System.out.println("check the data enterd");
			
		    }
			catch(NegativeArraySizeException|ArrayIndexOutOfBoundsException e3){
				System.out.println("Exception generated due to multy coding in thr array");
			}
			

			
	}

}
