package com.practice.algo.twopointers;

import com.practice.algo.helpers.LinkedList;
import com.practice.algo.helpers.LinkedListNode;

public class RemoveNthElementFromList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 5;
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(arr);

        LinkedListNode head = removeElementAtPosition(linkedList.head, n);

        while (head.next != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

    private static LinkedListNode removeElementAtPosition(LinkedListNode head, int n) {
        if(head == null) return null;
        LinkedListNode leftNode = head;
        LinkedListNode rightNode = head;

        for(int i=0; i<n && rightNode.next!= null; i++) {
            rightNode = rightNode.next;
        }

        if(rightNode == null)
            return head.next;

        while(rightNode.next != null) {
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        leftNode.next = leftNode.next.next;

        return head;
    }

}
