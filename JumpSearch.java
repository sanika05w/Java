public class JumpSearch
{
    public static void main(String[] args) {
        int[] a = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int key = 55, step = (int) Math.sqrt(a.length), prev = 0;
        while (prev < a.length && a[Math.min(step, a.length) - 1] < key) {
            prev = step;
            step += (int) Math.sqrt(a.length);
        }
        for (int i = prev; i < Math.min(step, a.length); i++) {
            if (a[i] == key) { System.out.println("Found at " + i); return; }
        }
        System.out.println("Not found");
    }
}
