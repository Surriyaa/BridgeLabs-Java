package linkedlist;

public class QueueLinkedList <T>{

	class Node{
		T data;
		Node next;
		Node(T val){
			data=val;
			next=null;
		}
	}
	Node front,rear;
	QueueLinkedList() {
		front =null;
		rear=null;
	}
	
	public void enQueue(T val) {
		Node newnode=new Node(val);
		
		if(front==null) {
			front=newnode;
			rear=newnode;
		}
		else {
			rear.next=newnode.next;
			rear=newnode;
		}
		System.out.println(rear.data);
	}
	
	public T deQueue() {
		T d=front.data;
		front.next=null;
		return d;
	}

	public Boolean isEmpty() {
		return front==null;
	}

}
