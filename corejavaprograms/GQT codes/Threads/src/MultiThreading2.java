import java.util.Scanner;
class Operations extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();

		}
		else {
			login();
		}
	}
	private void addition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Addition operation is Intiated");
		System.out.println("enter num1: ");
		int num1=sc.nextInt();
		System.out.println("enter num2: ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result of addition is:"+res);
		System.out.println("Addition operation is completed.");
	}
	private void printing() {
		System.out.println("Printing Operation Intiated");
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Glabal Quest Technologies");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation is completed.");
	}
	private void login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Login Operation Intiated.");
		String user_name="123gqt";
		String pwd="123gqt";
		System.out.println("enter the user name: ");
		String uname=sc.next();
		System.out.println("Enter the password: ");
		String password=sc.next();
		if(user_name.equals(uname)) {
			if(pwd.equals(password)) {
				System.out.println("Login Success"); 
			}
			else {
				System.out.println("Check your Password");
			}
		}
		else {
			System.out.println("Check the user name");
		}
		System.out.println("Login operation is completed");
	}
	
public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		Operations op1=new Operations();
		Operations op2=new Operations();
		Operations op3=new Operations();
		op1.setName("Addition");
		op2.setName("printing");
		op3.setName("login");
		op1.start();
		op2.start();
		op3.start();
		System.out.println("Main Thread Terminated.");
		

	}

}
}
