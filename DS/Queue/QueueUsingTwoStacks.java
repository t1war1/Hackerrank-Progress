import java.util.Scanner;
import java.util.Stack;

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Stack<Integer> Front=new Stack<>(),Rear=new Stack<>();
    int Q;
    Q=s.nextInt();
    while(Q--)
    {
        int type, x;
        type=s.nextInt();;
        if(type == 1)
        {
            x=s.nextInt();;
            Rear.push(x);
        }    
        else 
        {
           if(Front.isEmpty())
           { // move all the elements from "Rear" stack to "Front" stack
               while(!Rear.isEmpty())
               {
                   Front.push(Rear.top());
                   Rear.pop();
               }   
            }    
           if(!Front.isEmpty())
           {
               if(type == 2) 
			Front.pop();
               if(type == 3)
			System.out.println(Front.peek());
           }  
        }   
    }    
}
