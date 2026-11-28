public class UnionFindDemo
{
    public static void main(String[] args) {
        int[] parent = new int[6];
        for (int i = 0; i < 6; i++) parent[i] = i;
        union(parent, 0, 1); union(parent, 1, 2); union(parent, 3, 4);
        System.out.println("0 and 2 connected? " + (find(parent, 0) == find(parent, 2)));
        System.out.println("0 and 3 connected? " + (find(parent, 0) == find(parent, 3)));
    }

    static int find(int[] p, int x) { return p[x] == x ? x : (p[x] = find(p, p[x])); }
    static void union(int[] p, int a, int b) { p[find(p, a)] = find(p, b); }
}
