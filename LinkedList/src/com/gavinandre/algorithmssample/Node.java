package com.gavinandre.algorithmssample;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static Node createSinglyLinkedList() {
        Node headNode = new Node(1);
        Node node = headNode;
        for (int i = 2; i <= 5; i++) {
            node.next = new Node(i);
            node = node.next;
        }
        return headNode;
    }

    public static void output(Node listNode) {
        Node node = listNode;
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }
}
