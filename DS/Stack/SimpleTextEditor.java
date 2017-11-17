import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
		Stack<String> stack=new Stack<>();
		String str="";
		int n=s.nextInt();
		int i=0;
		while(i<n)
		{
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				stack.push(str);
				String temp=s.next();
				str+=temp;
				break;
			case 2:
				stack.push(str);
				int k=s.nextInt();
				str=str.substring(0,str.length()-k);
				break;
			case 3:
				int a=s.nextInt();
				System.out.println(str.charAt(a-1));
				break;
			case 4:
				str=stack.pop();
				break;
			}
			i++;
		}
    }
}
