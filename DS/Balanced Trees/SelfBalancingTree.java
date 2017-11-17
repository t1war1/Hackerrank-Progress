   /* Class node is defined as :
    class Node 
       int val;   //Value
       int ht;      //Height
       Node left;   //Left child
       Node right;   //Right child

   */
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
 
        // Perform rotation
        x.right = y;
        y.left = T2;
 
        // Update heights
        y.ht = Math.max(height(y.left), height(y.right)) + 1;
        x.ht = Math.max(height(x.left), height(x.right)) + 1;
 
        // Return new root
        return x;
    }
   static int height(Node N) {
        if (N == null)
            return -1;
 
        return N.ht;
    }
    static int getBalance(Node N) {
        if (N == null)
            return 0;
 
        return height(N.left) - height(N.right);
    }
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
 
        // Perform rotation
        y.left = x;
        x.right = T2;
 
        //  Update heights
        x.ht = Math.max(height(x.left), height(x.right)) + 1;
        y.ht = Math.max(height(y.left), height(y.right)) + 1;
 
        // Return new root
        return y;
    }
   static Node insert(Node root,int val)
    {
           if (root == null)
           {
            Node n=new Node();
            n.ht=0;
            n.val=val;
            return n;
           }
 
        if (val < root.val)
            root.left = insert(root.left, val);
        else if (val > root.val)
            root.right = insert(root.right, val);
        else 
            return root;
 
        root.ht = 1 + Math.max(height(root.left),
                              height(root.right));
 
        int balance = getBalance(root);
        if (balance > 1 && val < root.left.val)
            return rightRotate(root);
 
        if (balance < -1 && val > root.right.val)
            return leftRotate(root);
 
        if (balance > 1 && val > root.left.val) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
 
        if (balance < -1 && val < root.right.val) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
         return root;
    }

