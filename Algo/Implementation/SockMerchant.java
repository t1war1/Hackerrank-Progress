import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();
        
        while(n-- > 0) {
            int c = scan.nextInt();
            Integer frequency = colors.get(c);
            
            if(frequency == null) {
                colors.put(c, 1);
            }
            else { 
                colors.put(c, frequency + 1);
            }
        }
        scan.close();
        
        int pairs = 0;
        for(Integer frequency : colors.values()) {
            pairs += frequency >> 1;
        }
        System.out.println(pairs);
    }
}
