public class CountPositiveNegative
{
    public static void main(String[] args) {
        int[] a = {4, -2, 7, 0, -9, 3};
        int pos = 0, neg = 0, zero = 0;
        for (int x : a) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }
        System.out.println("Positive=" + pos + " Negative=" + neg + " Zero=" + zero);
    }
}
