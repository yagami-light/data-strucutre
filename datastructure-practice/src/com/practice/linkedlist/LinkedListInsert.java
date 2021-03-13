/*
 * Copyright (c)  coyright
 */

package com.practice.linkedlist;

public class LinkedListInsert {
    Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    void addFront(int data) {
        Node insert = new Node(data);
        insert.next = head;
        head = insert;

    }

    void addLast(int data) {
        Node insert = new Node(data);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = insert;

    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }


    }

    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();
        list.head = new Node(1);
        list.addFront(2);
        list.addFront(3);
        list.addLast(5);
        list.addLast(6);
        list.addFront(-1);
        printList(list.head);
    }

}
