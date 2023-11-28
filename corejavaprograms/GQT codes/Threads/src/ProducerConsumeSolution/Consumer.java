package ProducerConsumeSolution;

import ProducerConsumerProblem.Queue;

public class Consumer {
	public class Consumer extends Thread{
		Queue b;
		public Consumer(Queue q) {
			b=q;
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run() {
			while(true) {
				b.Consume();
			}
		}
	}

}
