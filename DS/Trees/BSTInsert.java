 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    if(root!=null)
    {
    if(value<root.data)
    {
        root.left=Insert(root.left,value);
    }
    else if(value>root.data)
    {
        root.right=Insert(root.right,value);
    }
    }
    else
    {
        Node node=new Node();
        node.data=value;
        node.left=null;
        node.right=null;
        return node;
    }
    return root;   
    }



