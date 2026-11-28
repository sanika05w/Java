public class MajorityElement
{
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        int cand = 0, count = 0;
        for (int x : a) {
            if (count == 0) cand = x;
            count += (x == cand) ? 1 : -1;
        }
        System.out.println("Majority element = " + cand);
    }
}
