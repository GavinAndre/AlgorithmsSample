package com.gavinandre.algorithmssample;

public class LinkedListCycle {

    public static boolean linkedListCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // 创建普通链表
        Node listNode = Node.createSinglyLinkedList();
        Node.output(listNode);
        boolean isCycle = linkedListCycle(listNode);
        System.out.println(isCycle);
        // 创建有环链表
        Node thirdNode = listNode.next.next;
        Node lastNode = thirdNode.next.next;
        lastNode.next = thirdNode;
        isCycle = linkedListCycle(listNode);
        System.out.println(isCycle);
    }
}
