package BankApplication;
import java.util.Scanner;


//-------------------------------Bank Details---------------------------------------

class Display{
	long Balance;
	int Accountno;
	int pin;
	public void details() {
		this.Balance=500000;
		this.Accountno=111;
		this.pin=9896;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the Account Number:");
		int Acc=sc.nextInt();
		System.out.println("Enetr the Pin");
		int pi=sc.nextInt();
		if(Accountno==Acc && pin==pi) {

			System.out.println("Login Successful");
			System.out.println("Account Number   :"+Accountno+"\nName             :Bhavana\n"+"Account Type     :Savings\n"+"Balance          :"+Balance);
		}

		else
		{
			System.out.println("Invalid details");
		}
	}
}



//-------------------------------------------Deposit Function-------------------------------------
class Deposit{
	public void deposit() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int v=sc.nextInt();
		int Accountno=111;
		int pin=9896;
		int Balance=500000;
		if(pin==v) {
			System.out.println("enter the Amount");
			int a=sc.nextInt();
			Thread.sleep(3000);
			System.out.println("Processing.....");
			Thread.sleep(5000);
		
			int d=Balance+a;
			System.out.println(d+" debited sucessfully");
			Thread.sleep(1000);
			System.out.println("Do you want Receipt\n1.YES\n2.NO");
			int k=sc.nextInt();

			if(k==1) {
				System.out.println("Account Number   :"+Accountno+"\nName             :Bhavana\n"+"Account Type     :Savings\n"+"Total Balance    :"+d);
			}
			else if(k==2)
			{
				System.out.println("Remove the card");
				System.out.println("Thank you");
			}
			else
			{
				System.out.println("you Entered wrong input check once");
			}
	
		}
		else
		{
			System.out.println("Wrong pin");
		}
		
	}

}
//-------------------------------------------Withdraw Function------------------------------------ 
class Withdraw{

	void draw() throws InterruptedException {
		long Balance=500000;
		int Accountno=111;
		int pin=9896;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pin");
		int p=sc.nextInt();
		if(pin==p) {
			System.out.println("enter the Amount");
			long amount;
			amount=sc.nextLong();
			if(Balance>amount) {
				long t=Balance-amount;
				Thread.sleep(3000);
				System.out.println("Transaction is processing...... please wait");
				Thread.sleep(5000);
				System.out.println("Take amount");
				Thread.sleep(3000);
				
				System.out.println("Do you want Receipt\n1.YES\n2.NO");
				int k=sc.nextInt();

				if(k==1) {
					System.out.println("Account Number   :"+Accountno+"\nName             :Bhavana\n"+"Account Type     :Savings\n"+"Balance          :"+t);
				}
				else if(k==2)
				{
					System.out.println("Remove the card");
					System.out.println("Thank you");
				}
				else
				{
					System.out.println("you Entered wrong input check once");
				}

			}
			else 
			{
				System.out.println("sorry Amount not available");
			}


		}
		else
		{
			System.out.println("Wrong pin");
		}
	}
}


//------------------------------------------Balance enquiry---------------------------------------
class Balance{

}
public class BankApplication {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Display d=new Display();
		Deposit dp=new Deposit();
		Withdraw wd=new Withdraw();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("\t\t*******Welcom to Bank Application*******\n\n");
		System.out.println("Please select the option:\n"
				+"1.Bank Details\n"
				+"2.Deposit\n"
				+"3.Withdraw\n"	
				+"4.Exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			d.details();
			break;
		}
		case 2:{
            dp.deposit();
			break;
		}
		case 3:{
			wd.draw();
			break;
		}
		
		case 4:{
            System.out.println("Thank you");
			break;
		}
		}
	}

}
