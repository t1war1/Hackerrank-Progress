/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  Node temp=head;
  while(temp.next!=null)
  {
      temp=temp.next;
  }
  Node newone=new Node();
    newone.data=data;
   newone.next=null;
    temp.next=newone;
    return head;
}

