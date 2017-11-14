/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    if(headA==null && headB==null)
        return null;
    else if(headA==null)
        return headB;
    else if(headB==null)
        return headA;
    Node c;
    if(headA.data<headB.data)
    {
        c=headA;
        c.next=mergeLists(headA.next,headB);
    }
    else
    {
        c=headB;
        c.next=mergeLists(headA,headB.next);
    }
    return c;
}

