import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
		int q=s.nextInt();
		while(q>0)
		{
			int n=s.nextInt();
            Queue<abc> queue=new LinkedList<>();
			queue.add(new abc(n,0));
			while(!queue.isEmpty())
			{
				abc curr=queue.poll();
				if(curr.value<=4)
				{
                    if(curr.value==4)
                        System.out.println(curr.depth+3);
                    else
                    {
                        System.out.println(curr.depth+curr.value);
                    }
                    break;
				}
				queue.add(new abc(curr.value-1,curr.depth+1));
				int start = (int)Math.sqrt(curr.value);
                for(int j = start; j >= 2; j--)
                {
                    if(curr.value % j == 0)
                        queue.add(new abc(curr.value / j, curr.depth + 1));
                }
			}
			q--;
		}
    }
}
class abc{
	int value;
	int depth;
	abc(int value,int depth)
	{
		this.value=value;
		this.depth=depth;
	}
}
