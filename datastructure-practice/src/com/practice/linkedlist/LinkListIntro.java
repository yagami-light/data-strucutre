package com.practice.linkedlist;

public class LinkListIntro {
    Node head;

    static void  printList(Node head){
        Node n=head;
        while(n != null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkListIntro list=new LinkListIntro();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        list.head.next=second;
        second.next=third;
        third.next=fourth;

        printList(list.head);
    }

    public static class Node {
        public Node(int data) {
            this.data = data;
        }

        int data;
        Node next;


    }
}
