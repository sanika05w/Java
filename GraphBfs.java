import java.util.*;

public class GraphBfs
{
    public static void main(String[] args) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < 6; i++) g.add(new ArrayList<>());
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 5}};
        for (int[] e : edges) { g.get(e[0]).add(e[1]); g.get(e[1]).add(e[0]); }
        boolean[] seen = new boolean[6];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); seen[0] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : g.get(u)) if (!seen[v]) { seen[v] = true; q.add(v); }
        }
        System.out.println();
    }
}
