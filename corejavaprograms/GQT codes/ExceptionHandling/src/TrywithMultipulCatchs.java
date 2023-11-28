import java.util.InputMismatchException;
import java.util.Scanner;
public class TrywithMultipulCatchs {

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
		catch(InputMismatchException e2) {
			
		System.out.println("check the data enterd");
		
	}
		catch(NegativeArraySizeException e3){
			System.out.println("Array size can not be negative");
		}
		

		catch(NullPointerException e4){
			System.out.println("can not havw null values");
		}
		catch(ArrayIndexOutOfBoundsException e5){
			System.out.println("exception related arrays");
		}
		catch( Exception e5) {
			System.out.println("exception handled by generic");
		}
		
		

}
}
