import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int mygrid[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			String input=s.next();
			for(int j=0;j<n;j++)
			{
				char c=input.charAt(j);
				if(c=='X')
				{
					mygrid[i][j]=Integer.MIN_VALUE;
				}
				else
				{
					mygrid[i][j]=Integer.MAX_VALUE;
				}
			}
		}
		int beginx=s.nextInt(),beginy=s.nextInt(),endx=s.nextInt(),endy=s.nextInt();
		mygrid[beginx][beginy]=0;
		Queue<element> queue=new LinkedList<>();
		queue.add(new element(beginx,beginy,0));
		int min=Integer.MAX_VALUE;
		while(!queue.isEmpty())
		{
			element curr=queue.poll();
			if(curr.x==endx && curr.y==endy)
			{
				if(curr.stepNumber<min)
				{
					min=curr.stepNumber;
				}
				continue;
			}
			int i=curr.x+1;
			while(i<mygrid.length)
			{
				if(mygrid[i][curr.y]>=curr.stepNumber+1)
				{
					mygrid[i][curr.y]=curr.stepNumber+1;
					queue.add(new element(i,curr.y,mygrid[i][curr.y]));
				}
				else
				{
					break;
				}
				i++;
			}
			i=curr.x-1;
			while(i>=0)
			{
				if(mygrid[i][curr.y]>=curr.stepNumber+1)
				{
					mygrid[i][curr.y]=curr.stepNumber+1;
					queue.add(new element(i,curr.y,mygrid[i][curr.y]));
				}
				else
				{
					break;
				}
				i--;
			}
			i=curr.y-1;
			while(i>=0)
			{
				if(mygrid[curr.x][i]>=curr.stepNumber+1)
				{
					mygrid[curr.x][i]=curr.stepNumber+1;
					queue.add(new element(curr.x, i,mygrid[curr.x][i]));
				}
				else
				{
					break;
				}
				i--;
			}
			i=curr.y+1;
			while(i<mygrid.length)
			{
				if(mygrid[curr.x][i]>=curr.stepNumber+1)
				{
					mygrid[curr.x][i]=curr.stepNumber+1;
					queue.add(new element(curr.x,i,mygrid[curr.x][i]));
				}
				else
				{
					break;
				}
				i++;
			}
			
		}
		System.out.println(min);
	}
}
class element{
	int x,y;
	int stepNumber;
	element(int x,int y,int stepNumber)
	{
		this.x=x;
		this.y=y;
		this.stepNumber=stepNumber;
	}
}
