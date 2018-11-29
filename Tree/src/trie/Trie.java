package trie;

public class Trie {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
        root.setVal(' ');
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (node.getChildren()[c - 'a'] == null)
                node.getChildren()[c - 'a'] = new TrieNode(c);
            node = node.getChildren()[c - 'a'];
        }
        node.setWord(true);
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if (node.getChildren()[c-'a'] == null) return false;
            node = node.getChildren()[c-'a'];
        }
        return node.isWord();
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if (node.getChildren()[c-'a']==null) return false;
            node = node.getChildren()[c-'a'];
        }
        return true;
    }
}
