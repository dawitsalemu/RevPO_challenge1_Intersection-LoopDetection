package com.linkedlists;

public class IntersectionNode {
    static class LinkedListNode{
        int data;
        LinkedListNode next;
        LinkedListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedListNode getIntersectionNode(LinkedListNode node1, LinkedListNode node2){
        while(node1 != null){
            LinkedListNode current = node2;
            while(current != null){
                if(node1 == current){
                    return node1;
                }
                current = current.next;
            }
            node1 = node1.next;
        }
        return null;
    }
}
