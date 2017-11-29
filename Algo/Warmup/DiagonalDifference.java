import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
    long sump=0;
    long sums=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            long x=s.nextInt();
            if(i==j)
                sump+=x;
            if((n-i-1)==j)
                sums+=x;
                
        }
    }
    long ans=sump-sums;
    if(ans<0)
    System.out.println(ans*-1);
    else
    System.out.println(ans);
    }
}
