public class HouseRobber
{
    public static void main(String[] args) {
        int[] a = {2, 7, 9, 3, 1};
        int prev = 0, cur = 0;
        for (int x : a) {
            int t = Math.max(cur, prev + x);
            prev = cur;
            cur = t;
        }
        System.out.println("Max loot = " + cur);
    }
}
