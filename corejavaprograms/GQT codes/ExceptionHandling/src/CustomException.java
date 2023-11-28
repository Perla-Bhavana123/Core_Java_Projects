import java.util.Scanner;


class UnderAgeException extends Exception{
	public String getMessage() {
		return "your age is less than 18";

	}
}


class OverAgeException extends Exception{
	public String getMessage() {
		return "your age is greater than 65";

	}
}
class candidate
{
	int age;
	void collectData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
	}


	void verify() throws UnderAgeException,OverAgeException
	{
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			throw uae;
		}
		else if(age>65) {
			OverAgeException uae=new OverAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		candidate c1=new candidate();
		try {
			c1.collectData();
			c1.verify();

		}
		catch(UnderAgeException e1) {
			System.out.println("UndeAgeException handled in main");
		}
		catch(OverAgeException uae) {
			System.out.println("OverException handled in main");
		}
	}

}
