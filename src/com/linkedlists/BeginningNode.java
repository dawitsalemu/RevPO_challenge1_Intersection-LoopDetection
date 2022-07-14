package com.linkedlists;

public class BeginningNode {
    static class CircularLinkedListNode{
        int key;
        CircularLinkedListNode next;
    }

    static CircularLinkedListNode newNode(int key){
        CircularLinkedListNode temp = new CircularLinkedListNode();
        temp.key = key; temp.next = null;
        return temp;
    }

    static CircularLinkedListNode beginningNode(CircularLinkedListNode head){
        CircularLinkedListNode temp = new CircularLinkedListNode();
        while(head != null){
            if(head.next == null){
                return null;
            }
            if(head.next == temp){
                break;
            }
            CircularLinkedListNode next = head.next;
            head.next = temp;
            head = next;
        }
        return head;
    }
}
