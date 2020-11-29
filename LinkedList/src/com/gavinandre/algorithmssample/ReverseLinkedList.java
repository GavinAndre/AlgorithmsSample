package com.gavinandre.algorithmssample;

public class ReverseLinkedList {

    public static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node listNode = Node.createSinglyLinkedList();
        Node.output(listNode);
        Node reversedListNode = reverseLinkedList(listNode);
        Node.output(reversedListNode);
    }
}
