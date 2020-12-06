package com.gavinandre.algorithmssample;

public class MiddleOfTheLinkedList {

    private static Node middleOfTheLinkedList(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node listNode = Node.createSinglyLinkedList();
        Node.output(listNode);
        Node middleNode = middleOfTheLinkedList(listNode);
        Node.output(middleNode);
    }
}
