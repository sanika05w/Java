public class ArrayChunkSums
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        for (int i = 0; i < a.length; i += k) {
            int s = 0;
            for (int j = i; j < Math.min(i + k, a.length); j++) s += a[j];
            System.out.println("Chunk sum = " + s);
        }
    }
}
