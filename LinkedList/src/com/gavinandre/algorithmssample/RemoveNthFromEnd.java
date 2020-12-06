package com.gavinandre.algorithmssample;

public class RemoveNthFromEnd {

    private static Node removeNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node listNode = Node.createSinglyLinkedList();
        Node.output(listNode);
        Node newListNode = removeNthFromEnd(listNode, 2);
        Node.output(newListNode);
    }
}
