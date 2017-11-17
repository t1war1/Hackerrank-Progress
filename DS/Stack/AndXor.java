import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE,temp=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		Stack<Integer> stack=new Stack<>();
		int i=0;
		while(i<n)
		{
			if(stack.isEmpty() )
			{
				stack.push(i++);
			}
			else
			{
				
				int a=stack.peek();
				temp=arr[a]^arr[i];
				if(temp>max)
				{
					max=temp;
				}                                                  
				if(arr[stack.peek()]>arr[i])
				{
					stack.pop();
				}
				else
				{
					stack.push(i++);
				}
			}
		}
		System.out.println(max);
    }
}
