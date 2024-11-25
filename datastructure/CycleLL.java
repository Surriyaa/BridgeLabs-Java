package com.practiceprograms;

import java.util.List;

class ListNode{
		ListNode next;
		int data;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public class CycleLL {
		
		public static ListNode checkCycle(ListNode head) {
			
			if(head==null || head.next==null) {
				return null;
			}
			ListNode fast=head;
			ListNode slow =head;
			
			// Step 1 find the cycle
			
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				if( slow==fast ) {
					// Step 2 find the starting node
					
					ListNode start=head;
					while(start!=slow) {
						start=start.next;
						slow=slow.next;
					}
					return start;
				}
			}
			return null;
		}
		
		public static void removeNthElement(ListNode head,int n) {
			ListNode first=head;
			ListNode second=head;
			//public 
			
			for(int i=0;i<n+1;i++) {
				first=first.next;
			}
			
			while(first!=null) {
				first=first.next;
				second=second.next;
			}
			
			second.next=second.next.next;
		}
		
		public static void print(ListNode head) {
			ListNode temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		private static ListNode intersection(ListNode headA, ListNode headB) {
			if(headA==null || headB==null) {
				return null;
			}
			
			ListNode pA=headA;
			ListNode pB=headB;
			
			while(pA!=pB) {
				pA=((pA==null)? headB : pA.next);
				pB=((pB==null)? headA : pB.next);
			}
			return pA;
		}
	
	public static void main(String[] args) {
		ListNode common = new ListNode(2);
        common.next = new ListNode(4);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        headA.next.next.next = common;

        ListNode headB = new ListNode(3);
        headB.next = common;
        
        ListNode inter=intersection(headA,headB);
        if(inter!= null)
        	System.out.println("The list intersect at :"+inter.data);
        else
        	System.out.println("No intersection");
        
//		ListNode head=new ListNode(3);
//		ListNode sec=new ListNode(4);
//		ListNode thi=new ListNode(6);
//		ListNode four=new ListNode(31);
//		
//		head.next=sec;
//		sec.next=thi;
//		thi.next=four;
//		 ListNode head = new ListNode(1);
//	        head.next = new ListNode(2);
//	        head.next.next = new ListNode(3);
//	        head.next.next.next = new ListNode(4);
//	        head.next.next.next.next = new ListNode(5);
		//four.next=sec; // fourth again pointing to the 2 it is a cycle..
		
//		ListNode check=checkCycle(head);
//		removeNthElement(head,2);
//		print(head);
//		
//		if(check==null)
//			System.out.println("No cycle detected");
//		else
//			System.out.println("Cycle node detected with value :"+check.data);
		
	}

	

}

	
