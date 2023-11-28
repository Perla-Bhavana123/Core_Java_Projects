
import java.util.Scanner;

class person{
	String Accno;
	String name;
	long phno;
	String Address;
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}



}

class Login{
	
}


public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long Balance=0;
		int Accno=111;
		int pin=6932;
		Scanner sc=new Scanner(System.in);
		System.out.println("***** Welcome to Bank Application *****");
		System.out.println("1.Login");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Bank Details");
		System.out.println("5.Exit");

		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			long Phno=9347931393l;
			String psd="Bhanu@123";
			System.out.println("Enter the Phone number:");
			long Ph=sc.nextLong();
			System.out.println("Enter the Password");
			String pi=sc.next();
			if(Phno==Ph && psd.equals(pi)) {
				System.out.println("Login successfully");
			}
			else
			{
				System.out.println("Wrong creadentials");
			}
			break;

		case 2:
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter the Account Number");
			int acc=sc.nextInt();
			System.out.println("Enter the pin");
			int p=sc.nextInt();
			if(Accno==acc && pin==p) {
				System.out.println("Enter the Amount to be deposit");
				long amount=sc.nextLong();
				if(amount>0) {
					Balance=Balance+amount;
				}
				else
				{
					System.out.println("enter valid amount");
					amount=sc.nextLong();
				}

			}
			else
			{
				System.out.println("Wrong creadentials");
			}
			//			System.out.println(Balance);
			break;

		case 3:
			long amount1=0;
			System.out.println("Enter the Account Number");
			int ac=sc.nextInt();
			System.out.println("Enter the pin");
			int ip=sc.nextInt();
			if(Accno==ac && pin==ip) {
				System.out.println("Enter the amount to be withdraw");
				amount1=sc.nextLong();
				if(Balance>=amount1) {
					Balance=Balance-amount1;
				}
				else
				{
					System.out.println("Insufficient Balance");	
				}
			}
			else
			{
				System.out.println("Wrong creadentials");
			}
			break;

		case 4:
			
			System.out.println("\t\t--------------------------------------------");
			System.out.println("\t\t\t\tATM TRANSACTION");	
			System.out.println("\t\t--------------------------------------------");
			
			
			

			break;
		}
	}

}
