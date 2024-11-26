package linkedlist;

	class ListNode{
		ListNode next;
		int data;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	
	public class PalindromeLL {
		
		private static boolean isPalindrome(ListNode head) {
			ListNode fast=head;
			ListNode slow=head;
			
			while(fast!=null && fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			
			ListNode second=reverse(slow);
			boolean isPalindrome=true;
			ListNode first=head;
			while(second.next!=null && first.next!=null) {
				if(second.data != first.data)
					isPalindrome= false;
				second=second.next;
				first=first.next;
			}
			return isPalindrome;
		}
		private static ListNode reverse(ListNode slow) {
			
			ListNode prev=null;
			ListNode curr=slow;
			
			while(curr!=null) {
				ListNode next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			return prev;
		}
		
		public static void main(String[] args) {
			ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = new ListNode(5);
			
	       boolean b= isPalindrome(head);
	       System.out.println(isPalindrome(head));
	       
	       if(b)
	    	   System.out.println("The Linked List is a palindrome");
	       else
	    	   System.out.println("The Linked List is not a palindrome");
		}
	
		
	}
	}
