import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int ans1=0,ans2=0;
        if(a0>b0)
            ans1++;
        else if(a0<b0)
            ans2++;
        if(a1>b1)
            ans1++;
        else if(a1<b1)
            ans2++;
        if(a2>b2)
            ans1++;
        else if(a2<b2)
            ans2++;
        System.out.println(ans1+" "+ans2);
    }
}

