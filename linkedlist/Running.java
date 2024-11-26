package linkedlist;

public class Running {

	public static void main(String[] args) {
		QueueLinkedList<Integer> q=new QueueLinkedList<Integer>();
		
		q.enQueue(9);
		q.enQueue(18);
		
		System.out.println(q.deQueue());
		
		System.out.println(q.isEmpty()?"The Queue is empty":"Queue is not empty");
	}

}
