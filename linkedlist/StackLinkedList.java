package com.linkedlist;

public class StackLinkedList<T> {
	class Node{
		T data;
		Node next;
	
	Node(T val){
		data=val;
		next=null;
	}
	}
	Node top;
	StackLinkedList(){
		top=null;
	}

	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(T val) {
		Node newnode= new Node(val);
		newnode.next=top;
		top=newnode;
		
	}
	
	public void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack underflow");
		}
		else {
		top=top.next;
	}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack has no elements");
		}
		else {
		System.out.println(top.data);
	}
	}

	public void show() {
		if(top==null){
			System.out.println("The list is empty...");
		}
		else {
			Node temp=top;
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
