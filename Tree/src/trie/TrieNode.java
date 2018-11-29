package trie;

public class TrieNode {
    private char val;
    private boolean isWord;
    private TrieNode[] children = new TrieNode[26];
    public TrieNode(){}
    public TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }

    public char getVal() {
        return val;
    }

    public void setVal(char val) {
        this.val = val;
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public TrieNode[] getChildren() {
        return children;
    }

    public void setChildren(TrieNode[] children) {
        this.children = children;
    }
}
