package com.collections;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergedList {
    // Main function to reorder the linked list
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return; // Edge case: if list is empty or has only one node, no need to reorder
        }

        // Step 1: Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverseList(slow.next);
        slow.next = null;  // Break the list into two halves
        
        // Step 3: Merge the two halves
        ListNode firstHalf = head;
        mergeLists(firstHalf, secondHalf);
    }
    
    // Helper function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;  // New head of the reversed list
    }

    // Helper function to merge two lists alternately
    private void mergeLists(ListNode first, ListNode second) {
        while (second != null) {
            // Store next nodes
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            // Reorder nodes
            first.next = second;  // Link the first node to the second node
            second.next = temp1;  // Link the second node to the next node in the first half

            // Move the pointers
            first = temp1;
            second = temp2;
        }
    }

    // Helper method to print the list (for testing purposes)
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.print("Original List: ");
        printList(head);

        // Reorder the list
        MergedList solution = new MergedList();
        solution.reorderList(head);

        // Print reordered list
        System.out.print("Reordered List: ");
        printList(head);
    }
}
