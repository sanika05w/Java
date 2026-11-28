import java.util.*;

public class DijkstraShortestPath
{
    public static void main(String[] args) {
        int[][] w = {{0, 4, 1, 0}, {4, 0, 2, 5}, {1, 2, 0, 8}, {0, 5, 8, 0}};
        int n = 4;
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean[] done = new boolean[n];
        for (int k = 0; k < n; k++) {
            int u = -1;
            for (int i = 0; i < n; i++) if (!done[i] && (u == -1 || dist[i] < dist[u])) u = i;
            done[u] = true;
            for (int v = 0; v < n; v++)
                if (w[u][v] > 0 && dist[u] + w[u][v] < dist[v]) dist[v] = dist[u] + w[u][v];
        }
        System.out.println(Arrays.toString(dist));
    }
}
