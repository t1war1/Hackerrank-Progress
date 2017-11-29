import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    private static TrieNode root = new TrieNode();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            String contact   = scan.next();
            if (operation.equals("add")) {
                add(contact);
            } else if (operation.equals("find")) {
                System.out.println(find(contact));
            }
        }
        scan.close();
    }

    private static void add(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.addChildIfAbsent(ch);
            curr = curr.children.get(ch);
            curr.size++;
        }
    }

    private static int find(String prefix) {
        TrieNode curr = root;
        
        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.children.get(ch);
            }
        }
        return curr.size;
    }
    
    public static class TrieNode {
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public int size = 0;
        
        public void addChildIfAbsent(Character ch) {
            children.putIfAbsent(ch, new TrieNode());
        }
    }
}
