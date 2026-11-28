public class SearchInSortedMatrix
{
    public static void main(String[] args) {
        int[][] m = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int key = 5, r = 0, c = m[0].length - 1;
        while (r < m.length && c >= 0) {
            if (m[r][c] == key) { System.out.println("Found at (" + r + "," + c + ")"); return; }
            if (m[r][c] > key) c--; else r++;
        }
        System.out.println("Not found");
    }
}
