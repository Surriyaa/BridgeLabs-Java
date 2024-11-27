package  tree;

public class Main {

	public static void main(String[] args) {
		BinarySearch tree=new BinarySearch();
		
		tree.insert(50);
		tree.insert(20);
		tree.insert(10);
		tree.insert(25);
		tree.insert(70);
		tree.insert(60);
		tree.insert(55);
		tree.insert(90);
		tree.insert(80);
		tree.insert(75);
		tree.inOrder();
		tree.delete(70);
	
		tree.inOrder();
	}

}
