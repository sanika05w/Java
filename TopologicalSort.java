import java.util.*;

public class TopologicalSort
{
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        int[][] e = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};
        int[] indeg = new int[n];
        for (int[] x : e) { g.get(x[0]).add(x[1]); indeg[x[1]]++; }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) if (indeg[i] == 0) q.add(i);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : g.get(u)) if (--indeg[v] == 0) q.add(v);
        }
        System.out.println();
    }
}
