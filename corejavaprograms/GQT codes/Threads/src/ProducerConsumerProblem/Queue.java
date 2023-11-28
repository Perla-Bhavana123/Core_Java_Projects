package ProducerConsumerProblem;

public class Queue {
	int x;
	public void Produce(int i) {
		x=i;
		System.out.println("Producer has produced "+x);
	}
	public void Consume() {
		// TODO Auto-generated method stub

		System.out.println("consumer has consumed the data"+x);
	}
}

