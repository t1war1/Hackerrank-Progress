/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
 if (head == null){
        return false;
    }
    Node tortoise = head;
    Node hare = head;

    while(tortoise != null && tortoise.next != null) {        
        tortoise = tortoise.next;
        hare = hare.next.next;
        
        if(hare == null || tortoise == null) {
            return false;
        }
        if(hare == tortoise){
            return true;
        }
    }
return false; 
}

