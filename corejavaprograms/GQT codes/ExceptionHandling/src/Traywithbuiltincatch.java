import java.util.Scanner;

public class Traywithbuiltincatch {

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

		}
			
	catch(Exception e){
			e.printStackTrace();
		}


	}

}
