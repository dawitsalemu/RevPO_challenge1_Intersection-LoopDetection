package com.linkedlists;

public class Driver {
    public static void main(String[] args)
    {
        // Intersection Node
        IntersectionNode list = new IntersectionNode();

        IntersectionNode.LinkedListNode head1 = new IntersectionNode.LinkedListNode(10);
        head1.next = new IntersectionNode.LinkedListNode(20);
        head1.next.next = new IntersectionNode.LinkedListNode(30);
        head1.next.next.next = null;

        IntersectionNode.LinkedListNode head2 = new IntersectionNode.LinkedListNode(5);
        head2.next = new IntersectionNode.LinkedListNode(7);
        head2.next.next = new IntersectionNode.LinkedListNode(9);
        head2.next.next.next = new IntersectionNode.LinkedListNode(11);

        IntersectionNode.LinkedListNode intersectionPoint = list.getIntersectionNode(head1, head2);

        if (intersectionPoint != null) System.out.print("Intersection Node: " + intersectionPoint.data);

        // Beginning Node
        BeginningNode.CircularLinkedListNode head = BeginningNode.newNode(20);
        head.next = BeginningNode.newNode(15);
        head.next.next = BeginningNode.newNode(10);
        head.next.next.next = BeginningNode.newNode(5);
        head.next.next.next.next = BeginningNode.newNode(10);
        head.next.next.next.next.next = head.next.next;
        BeginningNode.CircularLinkedListNode res = BeginningNode.beginningNode(head);

        if (res != null) System.out.print("Beginning Node: " + res.key);
    }
}
