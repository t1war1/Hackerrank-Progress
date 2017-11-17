import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0,area=0;
		int arr[]=new int[n];
		Stack<Integer> stack=new Stack<>();
		int i=0;
		while(i<n)
		{
			arr[i]=s.nextInt();
			i++;
		}
		i=0;
		while(i<n)
		{
			if(stack.isEmpty() || arr[i]>=arr[stack.peek()])
			{
				stack.push(i);
				i++;
			}
			else 
			{
				int top=stack.pop();
				area=arr[top]*(stack.isEmpty()?i:i-stack.peek()-1);
				if(max<area)
				{
					max=area;
				}
			}
		}
		while(!stack.isEmpty())
		{
			int top=stack.pop();
			area=arr[top]*(stack.isEmpty()?i:i-stack.peek()-1);
			if(max<area)
			{
				max=area;
			}
		}
		System.out.println(max);
        
    }
}
