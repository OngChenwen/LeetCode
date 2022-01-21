package Algorithm.Util;

import java.util.HashMap;
import java.util.Map;

public class TireTree {
    class TreeNode{
        boolean isEnd;
        Map<Character,TreeNode> successor;
        public TreeNode() {
            successor = new HashMap<>();
        }
    }

    TreeNode root;

    public TireTree() {
        root = new TreeNode();
    }

    public void insert(String word){
        TreeNode node = root;
        for(int i = 0; i < word.length();i++){
            char ch = word.charAt(i);
            if(!node.successor.containsKey(ch)) {
                node.successor.put(ch,new TreeNode());
            }
            // move node
            node = node.successor.get(ch);
        }
        // tag inserted word as true
        node.isEnd = true;
    }

    public boolean search(String word){
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!node.successor.containsKey(ch)){
                return false;
            }
            node = node.successor.get(ch);
        }

        return node.isEnd;
    }

    public boolean startWith(String word){
        TreeNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!node.successor.containsKey(ch)){
                return false;
            }
            node = node.successor.get(ch);
        }

        return true;
    }
}
