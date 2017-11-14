/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node a=head,b=head;
    int count=0;
    while(a!=null && count<n)
    {
        a=a.next;
        count++;
    }
    while(a.next!=null)
    {
        a=a.next;
        b=b.next;
    }
    return b.data;
}
