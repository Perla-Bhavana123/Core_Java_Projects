
public class Program1 {
	public static void main(String[] args) {
	  Thread t1=Thread.currentThread();
	  System.out.println(t1);
	  Thread t2=new Thread();
	  System.out.println(t2);
	  t2.setName("Bhavana");
	  t2.setPriority(7);
	  System.out.println(t2);
	}

}
