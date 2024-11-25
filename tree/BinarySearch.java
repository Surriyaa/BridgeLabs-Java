package com.tree;

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
	}
}

public class BinarySearch {
	
	Node root;
	public void insert(int data) {
		root=insertRec(root,data);
	}
	private Node insertRec(Node root, int data) {
		if(root==null) {
			root =new Node(data);
		}
		else if(root.data>data) {
			root.left=insertRec(root.left, data);
		}
		else if(root.data< data) {
			root.right=insertRec(root.right, data);
		}
		return root;
	}
	public void inOrder() {
		inOrderRec(root);
		System.out.println();
	}
	private void inOrderRec(Node root) {
			
		if(root!=null) {
			inOrderRec(root.left);
			System.out.print(root.data+" ");
			inOrderRec(root.right);
		}
	}
	
	public void search(int data) {
		
		Node res=searchRec(root,data);
		
		if(res!=null) {
			System.out.println(data+" was Found");
		}
		else {
			System.out.println(data+" was not Found");
		}
	}
	
	public Node searchRec(Node root,int data) {
		
		if(root==null ||  root.data==data) {
			return root;
		}
		else if(root.data < data) {
			return searchRec(root.right, data);
		}
		else {
		return searchRec(root.left, data);
		}
		
	}
	public void delete(int data) {
		root=deleteRec(root,data);
	}
	private Node deleteRec(Node root, int data) {
		
		if(root==null)
			return root;
		
		if(data < root.data) {
			root.left= deleteRec(root.left, data);
		}
		else if(data > root.data) {
			root.right= deleteRec(root.right, data);
		}
		else {
			if(root.left==null && root.right==null) {
				return null;
			}
		
		if(root.left==null) {
			return root.right;
		}
		else if(root.right==null) {
			return root.left;
		}
		root.data=min(root.right);
		
		root.right= deleteRec(root.right, root.data);
		}
		return root;
		
		
	}
	private int min(Node root) {
		int minVal=root.data;
		while(root.left!= null) {
			root=root.left;
			minVal=root.data;
		}
		return minVal;
	}
	
	
	
	
}
