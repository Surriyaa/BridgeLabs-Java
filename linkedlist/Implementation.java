package linkedlist;

public class Implementation {

	public static void main(String[] args) {
		StackLinkedList <Integer> s=new StackLinkedList <Integer>();
		
		s.push(1);
		s.peek();
		System.out.println(s.isEmpty());
		s.push(2);
		s.push(55);
		
		s.peek();
		s.show();
		
	}

}
