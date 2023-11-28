class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	void LinkedList() {
		Node curent=head;
		while(curent!=null) {
			System.out.println(curent.data);
			curent=curent.next;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList lt=new LinkedList();
		Node p1=new Node(10);
		Node p2=new Node(20);
		Node p3=new Node(30);
		Node p4=new Node(40);

		p1.next=p2;
		p2.next=p3;
		p3.next=p4;
		p4.next=null;
		lt.head=p1;
		lt.LinkedList();

	}

}
