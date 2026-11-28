public class MinHeapImplementation
{
    public static void main(String[] args) {
        MinHeap h = new MinHeap();
        for (int x : new int[]{5, 3, 8, 1, 9, 2}) h.add(x);
        while (h.size > 0) System.out.print(h.poll() + " ");
        System.out.println();
    }

    static class MinHeap {
        int[] a = new int[20]; int size = 0;
        void add(int x) {
            a[size] = x;
            int i = size++;
            while (i > 0 && a[(i - 1) / 2] > a[i]) {
                int p = (i - 1) / 2, t = a[p]; a[p] = a[i]; a[i] = t;
                i = p;
            }
        }
        int poll() {
            int top = a[0];
            a[0] = a[--size];
            int i = 0;
            while (true) {
                int l = 2 * i + 1, r = l + 1, s = i;
                if (l < size && a[l] < a[s]) s = l;
                if (r < size && a[r] < a[s]) s = r;
                if (s == i) break;
                int t = a[s]; a[s] = a[i]; a[i] = t;
                i = s;
            }
            return top;
        }
    }
}
