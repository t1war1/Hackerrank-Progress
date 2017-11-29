import java.io.*;
import java.util.*;

public class Solution {
static TrieNode root;
	Solution(){
		root=new TrieNode('/');
	}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt(),f=0;
		Solution trie=new Solution();
		while(n>0)
		{
			String a=s.next();
			boolean x=trie.addWord(a);
			if(!x)
			{
				f=1;
				System.out.println("BAD SET");
				System.out.println(a);
				break;
			}
			n--;
		}
		if(f==0)
			System.out.println("GOOD SET");
		s.close();
    }
    public  boolean addWord(String word){
return addWord(root,word);	
}
private  boolean addWord(TrieNode root,String word)
{
	if(word.length()==0){
		if(root.isWord)
		{
			return false;
		}
		root.isWord=true;
		return true;
	}
	char currentChar=word.charAt(0);
    	if(word.length()==1)
	{
		if(root.children.containsKey(currentChar))
		{
			return false;
		}
	}
	if(!root.children.containsKey(currentChar))
	{
		TrieNode newNode=new TrieNode(currentChar);
		root.children.put(currentChar, newNode);
	}
	if(root.children.get(currentChar).isWord)
		return false;
	return addWord(root.children.get(currentChar), word.substring(1));

}
}
 class TrieNode {
Map<Character,TrieNode> children;
boolean isWord;
char ch;
TrieNode(char ch)
{
	isWord=false;
	children=new HashMap<>();
	this.ch=ch;
}
}

