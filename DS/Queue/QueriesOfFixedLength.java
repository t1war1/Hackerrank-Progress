import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		while(q>0)
		{
			int k=s.nextInt();
			Deque<Integer> deque=new LinkedList<>();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<k;i++)
			{
				while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()])
				{
					deque.pollLast();
				}
				deque.addLast(i);
			}
			for(int i=k;i<n;i++)
			{
				if(arr[deque.peekFirst()]<min)
				{
					min=arr[deque.peekFirst()];
				}
				while(!deque.isEmpty() && deque.peekFirst()<=i-k)
				{
					deque.pollFirst();
				}
				while(!deque.isEmpty() && arr[i]>=arr[deque.peekLast()])
				{
					deque.pollLast();
				}
				deque.addLast(i);
			}
            if(arr[deque.peekFirst()]<min)
			{
				min=arr[deque.peekFirst()]; 
			}
			System.out.println(min);
			q--;
		}
    }
}
