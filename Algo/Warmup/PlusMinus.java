import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cp=0,cn=0,c0=0;
        for(int i=0;i<n;i++)
        {
        	int x=s.nextInt();
        	if(x>0)
        		cp++;
        	else if(x<0)
        		cn++;
        	else
        		c0++;
        }
        double pos=cp/(n*1.0);
        double neg=cn/(n*1.0);
        double zer=c0/(n*1.0);
        DecimalFormat fd=new DecimalFormat("#.000000");
        System.out.println(fd.format(pos));System.out.println(fd.format(neg));System.out.println(fd.format(zer));
    }
}
