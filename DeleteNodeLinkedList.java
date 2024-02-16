public class DeleteNodeLinkedList {
    public static void deleteNode(ListNode node)
    {
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        // Skip the next node by updating the next pointer
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode nodeToDelete = head.next.next; // Node with value 3

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Delete the specified node
        deleteNode(nodeToDelete);

        // Print the linked list after deletion
        System.out.println("\nLinked List after Deletion:");
        printLinkedList(head);
    }

    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
