import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int sum=0;
        int N=s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
