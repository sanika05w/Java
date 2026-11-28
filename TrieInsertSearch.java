public class TrieInsertSearch
{
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("apple"); t.insert("app"); t.insert("bat");
        System.out.println(t.search("app"));
        System.out.println(t.search("appl"));
        System.out.println(t.startsWith("ba"));
    }

    static class Trie {
        Trie[] next = new Trie[26]; boolean end;
        void insert(String w) {
            Trie t = this;
            for (char c : w.toCharArray()) {
                if (t.next[c - 'a'] == null) t.next[c - 'a'] = new Trie();
                t = t.next[c - 'a'];
            }
            t.end = true;
        }
        Trie find(String w) {
            Trie t = this;
            for (char c : w.toCharArray()) {
                t = t.next[c - 'a'];
                if (t == null) return null;
            }
            return t;
        }
        boolean search(String w) { Trie t = find(w); return t != null && t.end; }
        boolean startsWith(String p) { return find(p) != null; }
    }
}
