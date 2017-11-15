/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
        if(root==null)
        {
            return true;
        }
        boolean left=checkBST(root.left);
        boolean right=checkBST(root.right);
        if(!left || !right)
        {
            return false;
        }
        int maxleft=getMaxInBST(root.left);
        int minRight=getMinInBST(root.right);
        if(root.data>maxleft && root.data<minRight)
        {
            return true;
        }
        return false;
    }
	private static int getMinInBST(Node root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		if (root.left == null) {
			return root.data;
		}
		return getMinInBST(root.left);
	}

	private static int getMaxInBST(Node root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		if (root.right == null) {
			return root.data;
		}
		return getMaxInBST(root.right);
	}

