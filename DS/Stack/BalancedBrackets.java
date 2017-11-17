import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++)
        {
        	int f=1;
            String s = in.next();
            Stack<Character> stack=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    stack.push(ch);
                }
               if(stack.isEmpty())
               {
                   f=0;
                   break;
               }
               if(ch==')')
               {
                   if(stack.peek()=='(')
                   {
                       stack.pop();
                   }
                   else
                    {
                        f=0;
                    }
               }
               else if(ch=='}')
               {
                   if(stack.peek()=='{')
                   {
                       stack.pop();
                   }
                   else
                    {
                        f=0;
                    }
               }
                else if(ch==']')
                {
                    if(stack.peek()=='[')
                    {
                        stack.pop();
                    }
                    else
                    {
                        f=0;
                        break;
                    }
                }
            }
            if(f==1 && stack.isEmpty())
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            
            }
        
    }
}

