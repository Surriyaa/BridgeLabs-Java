package linkedlist;

public class Run {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();

		list.insert(9);
		list.insert(10);
		list.insert(55);
		list.insert(92);
		list.insert(102);
		list.insert(552);
		list.insertAt(3, 50);
		list.insertAt(0, 255);
		list.show();
		list.delete(55);
		System.out.println();
		System.out.println();
		list.show();
	}

}
