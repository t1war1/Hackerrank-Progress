/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newone=new Node();
    newone.data=data;
    int count=0;
    Node prev=null;
    Node curr=head;
    while(curr!=null && count<position)
    {
        count++;
        prev=curr;
        curr=curr.next;
    }
    if(prev==null)
    {
        newone.next=head;
        return newone;
    }
    else
    {
        prev.next=newone;
        newone.next=curr;
        return head;
    }
}
