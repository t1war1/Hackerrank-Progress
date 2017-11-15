/*c
class node
{
    int data;
    node left;
    node right;
};

*/

public static for_left(node root)
{
    if(root.left!=NULL)
        for_left(root.left);
    System.out.println(root.data+" ");
}


public static for_right(node root)
{
    System.out.println(root.data+" ");
    if(root.right!=NULL)
        for_right(root.right);
}

public static topView(node root)
{
    if(root.left!=NULL)
        for_left(root.left);
    System.out.println(root.data+" ");
    if(root.right!=NULL)
        for_right(root.right);
    
}
