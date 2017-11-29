import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
         int x=s.nextInt();
         if(x>=38)
         {
             int a=x/5;
             a++;
            int temp=a*5;
             if((temp-x)<3)
             {
                 if(temp<=100)
                     System.out.println(temp);
                 else
                     System.out.println(100);
             }
             else
             {
                 System.out.println(x);
             }
         }
            else
            {
                System.out.println(x);
            }
        }
        

    }
}

