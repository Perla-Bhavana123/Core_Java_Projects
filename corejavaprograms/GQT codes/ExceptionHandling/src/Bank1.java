import java.util.Scanner;

class InvalidCustomException extends Exception{
	
	public String getMessage() {
		return "Invalid credential please again!!!";
	}
 }
 class customer
 {
	 int original_accno=1234;
	 int original_Pin=2479;
	 int accno;
	 int pin;
	 void collectData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter accono");
		 accno=sc.nextInt();
		 System.out.println("enter the pin:");
		 pin=sc.nextInt();
		 }
	 void verify() throws InvalidCustomException{
		 if(original_accno==accno) {
			 if(original_Pin==pin) {
				 System.out.println("Access Granted");
				 
			 }
			 else
			 {
				 InvalidCustomException ice=new InvalidCustomException();
				 throw ice;
			 }
		 }
		 else
		 {
			 InvalidCustomException ice=new InvalidCustomException();
			 throw ice;
		 }
	 }
 }
 class ATM
 {
	 void permit(customer c)
	 {
		 try {
			 c.collectData();
			 c.verify();
		 }
		 catch(InvalidCustomException e1) {
			 try {
				 c.collectData();
				 c.verify();
			 }
			 catch(InvalidCustomException e2) {
				 try {
					 c.collectData();
					 c.verify();
				 }
				 catch(InvalidCustomException c3) {
					 System.out.println("Card Blocked");
					 System.exit(0);
				 }
			 }
		 }
	 }
	 
 }
public class Bank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c1=new customer();
		ATM a1=new ATM();
		a1.permit(c1);

	}

}
