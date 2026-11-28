public class ImmutableClassDemo
{
    public static void main(String[] args) {
        Money m = new Money(100, "INR");
        Money n = m.add(50);
        System.out.println(m + " " + n);
    }

    static final class Money {
        private final double amount; private final String cur;
        Money(double a, String c) { amount = a; cur = c; }
        Money add(double x) { return new Money(amount + x, cur); }
        public String toString() { return amount + " " + cur; }
    }
}
