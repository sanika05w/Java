public class PythagoreanTriplets
{
    public static void main(String[] args) {
        for (int a = 1; a <= 30; a++)
            for (int b = a; b <= 30; b++)
                for (int c = b; c <= 30; c++)
                    if (a * a + b * b == c * c) System.out.println(a + ", " + b + ", " + c);
    }
}
