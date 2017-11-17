import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int sum1=0,sum2=0,sum3=0;
        int arr1[] = new int[n1];
        for(int i=0; i< n1; i++){
            arr1[i] = in.nextInt();
            sum1+=arr1[i];
        }
        int arr2[] = new int[n2];
        for(int i=0; i < n2; i++){
            arr2[i] = in.nextInt();
            sum2+=arr2[i];
        }
        int arr3[] = new int[n3];
        for(int i=0; i < n3; i++){
            arr3[i] = in.nextInt();
            sum3+=arr3[i];
        }
        int top1=0,top2=0,top3=0;
        while(sum1!=sum2 || sum2!=sum3 || sum3!=sum1)
        {
             if(sum1>=sum2 && sum1>=sum3)
			{
				while((sum1>=sum2 && sum1>=sum3)&&(sum1!=sum2 || sum1!=sum3)&&top1<arr1.length)
				{
					sum1-=arr1[top1];
					top1++;
				}
			}
			else if(sum2>=sum1 && sum2>=sum3)
			{
				while((sum2>=sum1 && sum2>=sum3)&&(sum2!=sum1 || sum2!=sum3)&&top2<arr2.length)
				{
					sum2-=arr2[top2];
					top2++;
				}
			}
			else if(sum3>=sum1 && sum3>=sum2)
			{
				while((sum3>=sum1 && sum3>=sum2)&&(sum3!=sum1 || sum3!=sum2)&&top3<arr3.length)
				{
					sum3-=arr3[top3];
					top3++;
				}
			}
        }
        System.out.println(sum1);
    }
}

