package ProducerConsumeSolution;
public class Producer {
	public class Producer extends Thread{
		Queue a;
		public Producer(Queue q) {
			a=q;
			// TODO Auto-generated constructor stub
		}
		@Override
		public void run() {
			int i=0;
			while(true) {
				a.Produce(i++);
			}
		}
	   }
}
