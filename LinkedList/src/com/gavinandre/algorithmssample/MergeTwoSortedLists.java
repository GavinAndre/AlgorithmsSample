package com.gavinandre.algorithmssample;

public class MergeTwoSortedLists {

    private static Node mergeTwoSortedLists(Node list1, Node list2) {
        Node prevHead = new Node(-1);
        Node temp = prevHead;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = list1 != null ? list1 : list2;
        return prevHead.next;
    }

    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);
        Node.output(list1);
        Node.output(list2);
        Node mergedNode = mergeTwoSortedLists(list1, list2);
        Node.output(mergedNode);
    }
}
