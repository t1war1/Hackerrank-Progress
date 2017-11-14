/*
  Compare two linked lists A and B
  Return 1 if tifhey are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    if(headA==null && headB==null)
        return 1;
    else if(headA==null && headB!=null)
        return 0;
    else if(headB==null && headA!=null)
        return 0;
    else if(headA.data!=headB.data)
        return 0;
    return CompareLists(headA.next,headB.next);
}
