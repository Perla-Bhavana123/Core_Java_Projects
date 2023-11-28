package ThreadGroup;
class Operations implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
}
class Operation2 implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
}
public class MainApp {

	

	public static void main(String[] args) {
	   ThreadGroup tg=new ThreadGroup("Group1");
	   Thread t1=new Thread(tg,new Operations(),"t1");  
	   Thread t2=new Thread(tg,new Operations(),"t2");
	   Thread t3=new Thread(tg,new Operations(),"t3");
	   
	   t1.start();
       t2.start();
       t3.start();
	   
	   ThreadGroup tg1=new ThreadGroup("Group2");
	   Thread t11=new Thread(tg1,new Operation2(),"t11");
	   Thread t22=new Thread(tg1,new Operation2(),"t22");
	   Thread t33=new Thread(tg1,new Operation2(),"t33");
	     
	   t11.start();
	   t22.start();
	   t33.start();
	   
	  System.out.println(tg.activeCount());
	  System.out.println(tg.activeGroupCount());
	  System.out.println(tg.getName());
	  
	}

}
