import java.io.*;
import java.util.*;
import java.util.Stack;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int N=s.nextInt();int i=1;
        while(i<=N)
        {
            int ch=s.nextInt();
            if(ch==1)
            {
                int n=s.nextInt();
                if(st.isEmpty())
                {
                    st.push(n);
                }
                else
                {
                    st.push(Math.max(st.peek(),n));
                }
            }
            else if(ch==2)
            {
                st.pop();
            }
            else
            {
                System.out.println(st.peek());
            }
            i++;
        }
    }
}
