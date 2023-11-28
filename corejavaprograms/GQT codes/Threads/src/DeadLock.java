class Fighter1 extends Thread{
	String res1="AK47";
	String res2="m24";
	String res3="Sniper";
	@Override
	public void run() {
		try {
			if(Thread.currentThread().getName().equals("Arjun")) {
				ArjunSnatched();
			}
			else
			{
				sunilSnatched();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void ArjunSnatched() throws InterruptedException {
		synchronized(res1){
			System.out.println(Thread.currentThread().getName()+"has snatched"+res1);
			Thread.sleep(3000);
			synchronized(res2){
				System.out.println(Thread.currentThread().getName()+"has snatched"+res2);
				Thread.sleep(3000);
				synchronized(res3){
					System.out.println(Thread.currentThread().getName()+"has snatched"+res3);
					Thread.sleep(3000);
				}
			}
		}
	}
	public void sunilSnatched()  throws InterruptedException {
		synchronized(res3){
			System.out.println(Thread.currentThread().getName()+"has snatched"+res3);
			Thread.sleep(3000);
			synchronized(res2){
				System.out.println(Thread.currentThread().getName()+"has snatched"+res2);
				Thread.sleep(3000);
				synchronized(res1){
					System.out.println(Thread.currentThread().getName()+"has snatched"+res1);
					Thread.sleep(3000);
				}
			}
		}
	}	
}


public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter1 f1=new Fighter1();
		f1.setName("Arjun");
		Fighter1 f2=new Fighter1();
		f2.setName("Sunil");
		f1.start();
		f2.start();

	}

}
