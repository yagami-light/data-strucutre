/*
 * Copyright (c)  coyright
 */

package com.practice.linkedlist;

public class LinkedListIntroSelf {
    NodeSelf head;

    static void printList(NodeSelf node) {
        NodeSelf temp = node;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        LinkedListIntroSelf list = new LinkedListIntroSelf();
        list.head = new NodeSelf(1);
        NodeSelf SECOND = new NodeSelf(2);
        NodeSelf THIRD = new NodeSelf(3);
        NodeSelf FOURTH = new NodeSelf(4);
        list.head.next = SECOND;
        SECOND.next = THIRD;
        THIRD.next = FOURTH;


        printList(list.head);
    }

    public static class NodeSelf {
        public NodeSelf(int data) {
            this.data = data;
        }

        int data;
        NodeSelf next;

    }
}
