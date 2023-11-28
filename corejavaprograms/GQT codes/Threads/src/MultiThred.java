

import java.util.Scanner;
class Addition extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("currently executing thead is :"+Thread.currentThread().getName());
		System.out.println("Addition opertion is initiated");
		System.out.println("enter the num1:");
		int num1=sc.nextInt();
		System.out.println("enter the num2:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("resultof addition:"+res);
		System.out.println("Addition operation is completed");
	}
}
class printing extends Thread{
	@Override
	public void run() {
		
		System.out.println(" Printing operation intiated ");
	   for(int i=0;i<5;i++) {
		   try {
			   System.out.println("Global quest technologies");
			   Thread.sleep(500);
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
	   }
	   System.out.println("printing operation completed");
	}
}

class login extends Thread{
	public void run() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("-----------------------------");
		   System.out.println("login operation iunitiation");
		   String user_name="123gqt";
		   String Password="123gqt";
		   System.out.println("enter the user name");
		   String uname=sc.next();
		   System.out.println("enter the password:");
		   String password=sc.next();
		   if(user_name.equals(password)) {
			   if(Password.equals(password)) {
				   System.out.println("login success");
				   
			   }
			   else
			   {
				   System.out.println("check you password");
				   
			   }
		   }
		   else
		   {
			   System.out.println("check the user name");
			   System.out.println("current executing thread is1"+Thread.currentThread().getName());
		   }
		   
		}
	}

public class MultiThred {
	public static void main(String[] args) {
		System.out.println("main started");
		Addition ad=new Addition();
		printing pt=new printing();
		login lg=new login();
		ad.setName("addition");
		pt.setName("printing");
		lg.setName("loging");
		System.out.println(ad);
		System.out.println(pt);
		System.out.println(lg);
		ad.start();
		pt.start();
		lg.start();
		System.out.println("main terminated");
		
	}

}
