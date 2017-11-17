import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=-1;
		Stack<plant> stack=new Stack<>();
		stack.push(new plant(0,-1));
		for(int i=1;i<n;i++)
		{
			int daysToDie=1;
			while(!stack.isEmpty() )
			{
				if(arr[stack.peek().id]>=arr[i])
				{
				//wait for plant to the left to die
				daysToDie=Math.max(daysToDie, stack.peek().daysToDie+1);
				stack.pop();
				}
				else
				{
					break; //found the killer
				}
			}
			if(stack.isEmpty())
			{
				daysToDie=-1;
			}
			max=Math.max(max,daysToDie);
			stack.push(new plant(i,daysToDie));
		}
        if(max<0)
		System.out.println(0);
        else
       	System.out.println(max);

    }
}
class plant
{
	int id;
	int daysToDie;
	plant(int id,int daysToLive)
	{
		this.id=id;
		this.daysToDie=daysToLive;
	}
}
