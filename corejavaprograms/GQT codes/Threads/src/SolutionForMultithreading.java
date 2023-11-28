class Human extends Thread{
 @Override
public void run() {
	
try {
	System.out.println(Thread.currentThread().getName()+"Enter the bathroom");
	Thread.sleep(3000);
	System.out.println(Thread.currentThread().getName()+"using the bathroom");
	Thread.sleep(3000);
	System.out.println(Thread.currentThread().getName()+"left the bathroom");
	Thread.sleep(3000);
} catch (InterruptedException e) {
	
	e.printStackTrace();
}
}
}
public class SolutionForMultithreading {

	public static void main(String[] args) throws InterruptedException {
	Human h1=new Human();
	h1.setName("Boy");
	Human h2=new Human();
	h2.setName("Girl");
	Human h3=new Human();
	h3.setName("others");
	
    h1.start();
    h1.join();
    h2.start();
    h2.join();
    h3.start();
    h3.join();
    
	}

}
