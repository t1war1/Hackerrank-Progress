import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
		int g = in.nextInt();
		for (int a0 = 0; a0 < g; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int x = in.nextInt();
			int[] arr1 = new int[n];
			for (int a_i = 0; a_i < n; a_i++) {
				arr1[a_i] = in.nextInt();
			}
			int[] arr2 = new int[m];
			for (int b_i = 0; b_i < m; b_i++) {
				arr2[b_i] = in.nextInt();
			}
			// your code goes here
			int sum = 0, i = 0, j = 0, count = 0;
			while(i<arr1.length && sum+arr1[i]<=x)
			{
				sum+=arr1[i];
				i++;
			}
			count=i;
			while(j<arr2.length && i>=0)
			{
				sum+=arr2[j];
				j++;
				while(sum>x && i>0)
				{
					i--;
					sum-=arr1[i];
				}
				if(sum<=x && count<i+j)
				{
					count=i+j;
				}
			}
			System.out.println(count);
		}
    }
}

