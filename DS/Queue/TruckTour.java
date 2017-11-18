import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		pump arr[]=new pump[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new pump(s.nextInt(),s.nextInt());
		}
		int start=0,end=1;
		while(true)
		{
			int currentpetrol=arr[start].petrol-arr[start].distanceToNext;
			while(start!=end)
			{
				if(currentpetrol<0)
				{
					break;
				}
				else
				{
					currentpetrol+=arr[end].petrol-arr[end].distanceToNext;
					end=(end+1)%n;
				}
			}
			if(start==end)
			{
				System.out.println(start);
				break;
			}
			else
			{
				start++;
				end=start+1;
			}
		}
    }
}
class pump
{
	int petrol;
	int distanceToNext;
	pump(int petrol,int distanceToNext)
	{
		this.petrol=petrol;
		this.distanceToNext=distanceToNext;
	}
}
