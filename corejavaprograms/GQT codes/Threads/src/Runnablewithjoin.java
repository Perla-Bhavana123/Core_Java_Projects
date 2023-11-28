import java.util.Scanner;
class Addition11 extends Thread{
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
class printing11 extends Thread{
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

class login11 extends Thread{
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

public class Runnablewithjoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Addition1 ad=new Addition1();
		printing1 pt=new printing1();
		login1 lg=new login1();
		System.out.println(ad);
		System.out.println(pt);
		System.out.println(lg);
		Thread t1=new Thread(ad);
		Thread t2=new Thread(pt);
		Thread t3=new Thread(lg);
		
		
		t1.setName("addition");
		t2.setName("printing");
		t3.setName("loging");
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		System.out.println("main terminated");

	}

}
