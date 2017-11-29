import java.util.*;

public class Solution {
    
    public static int getNumberOfWays(int n, int d, int m, int[] sum) {
        for (int i = 1; i < n; i++) {
            sum[i] += sum[i - 1];
        }
        

        int numberOfWays = (m <= n && sum[m - 1] == d) ? 1 : 0;
        

        for (int i = m; i < n; i++) {
            if (sum[i] - sum[i - m] == d) {
                numberOfWays++;
            }
        }
        
        return numberOfWays;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] squares = new int[n];
        for(int squares_i=0; squares_i < n; squares_i++){
            squares[squares_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        in.close();

        System.out.println(getNumberOfWays(n, d, m, squares));
    }
}
