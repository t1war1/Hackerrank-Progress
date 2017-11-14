/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    int count=0;
    Node prev=null,curr=head;
    while(curr!=null && count<position)
    {
        count++;
        prev=curr;
        curr=curr.next;
    }
    if(count!=position)
        return head;
    if(prev==null)
    {
        curr=curr.next;
        head=curr;
    }
    else
    {
    prev.next=prev.next.next;        
    }
    return head;
}
