import java.util.*;

public class ConnectedComponentsCount
{
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};
        for (int[] e : edges) { g.get(e[0]).add(e[1]); g.get(e[1]).add(e[0]); }
        boolean[] seen = new boolean[n];
        int comps = 0;
        for (int i = 0; i < n; i++) if (!seen[i]) { dfs(i, g, seen); comps++; }
        System.out.println("Components = " + comps);
    }

    static void dfs(int u, List<List<Integer>> g, boolean[] seen) {
        seen[u] = true;
        for (int v : g.get(u)) if (!seen[v]) dfs(v, g, seen);
    }
}
