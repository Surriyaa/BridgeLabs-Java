package graph;

class ListNode {
    int val;       // Value stored in the node
    ListNode next; // Pointer to the next node

    ListNode(int val) {
        this.val = val;
        this.next = null; // Constructor initializes the node with value and no next node
    }
}

public class MergedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Dummy node to simplify edge cases
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists and merge
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;  // Add l1's node to the merged list
                l1 = l1.next;       // Move to the next node in l1
            } else {
                current.next = l2;  // Add l2's node to the merged list
                l2 = l2.next;       // Move to the next node in l2
            }
            current = current.next; // Move the pointer in the merged list
        }

        // If any list is still non-empty, append it to the result
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        // The merged list starts from the node after the dummy node
        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Merge the lists
        ListNode mergedList = mergeTwoLists(l1, l2);

        // Print the merged list
        System.out.print("Merged List: ");
        printList(mergedList);  // Output: 1 2 3 4 5 6
    }
}

