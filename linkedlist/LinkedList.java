package linkedlist;
public class LinkedList {
	private Node head;//head is by def null
	public void insert(int data) {
		Node newnode= new Node(data);//creating the empty || new node
		
		if(head==null) { //head is null the list is empty..
			head=newnode;//then the head is now first element..
		}
		else {// if not empty
			Node temp=head;
			while(temp.next!=null) {// traversing for the last node
				temp=temp.next;
			}
			temp.next=newnode; // found so add element to it
			
		}
	}
	
	public void insertAt(int index,int data) {
		Node newnode = new Node(data);
		Node temp=head;
		if(index==0) {
			newnode.next=head;
			head=newnode;
		}
		else {
			int count =0;
			while(temp.next!=null && count < index-1) {
				temp=temp.next;
				count++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
	}
	
	public void delete(int key) {
		if (head.data == key) {
            head = head.next;
            return;
        }
		Node temp=head;
		Node prev=null; // empty
		while(temp!=null && temp.data!=key) {
			prev=temp; //copy that  ref 
			temp=temp.next; // replace with the next ref  by unlinking the key
		}
		prev.next=temp.next; // finally having the key before value ref 

		 
	}
	
	public void show() {
		if(head==null){
			System.out.println("The list is empty...");
		}
		else {
			Node temp=head;
		while(temp.next!=null || temp.next==null ) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			if(temp==null) { // for the last element
				break;
			}
		}
		//System.out.println(temp);
		}
	}
	
}
