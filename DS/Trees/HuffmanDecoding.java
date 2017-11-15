/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
       Node curr=root;
       int i=0;
       while(i<S.length())
       {
           if(curr.left==null && curr.right==null)
           {
               System.out.print(curr.data);
               curr=root;
           }
           if(S.charAt(i)=='0')
           {
               curr=curr.left;
               i++;
           }
           else
           {
               curr=curr.right;
               i++;
           }
       }
    if(curr.left==null && curr.right==null)
		{
			System.out.print(curr.data);
			
		}
    }

