import java.io.*;
import java.util.*;

class community
{
	int no;
	int size;
	community(int no,int size)
	{
		this.no=no;
		this.size=size;
	}
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		community arr[]=new community[n+1];
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=new community(i,1);
		}
		for(int i=0;i<q;i++)
		{
		char ch=s.next().charAt(0);
		if(ch=='Q')
		{
			int x=s.nextInt();
			while(arr[x].no!=x)
			{
				arr[x].no=arr[arr[x].no].no;
				x=arr[x].no;
			}
			System.out.println(arr[x].size);
		}
		else
		{
			int x=s.nextInt();
			while(arr[x].no!=x)
			{
				arr[x].no=arr[arr[x].no].no;
				x=arr[x].no;
			}
			int y=s.nextInt();
			while(arr[y].no!=y)
			{
				arr[y].no=arr[arr[y].no].no;
				y=arr[y].no;
			}
            if(x!=y)
			if(arr[x].size>arr[y].size)
			{
				arr[x].size+=arr[y].size;
				arr[y].no=arr[x].no;
			}
			else
			{
				arr[y].size+=arr[x].size;
				arr[x].no=arr[y].no;	
			}
		}
		}
    }
}
