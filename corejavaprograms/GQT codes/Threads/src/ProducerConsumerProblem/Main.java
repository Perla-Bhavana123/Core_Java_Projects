package ProducerConsumerProblem;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		Producer p= new Producer(q);
		Consumer c= new Consumer(q);
		p.start();
	    c.start();
		}

	}


