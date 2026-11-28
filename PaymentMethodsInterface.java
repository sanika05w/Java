public class PaymentMethodsInterface
{
    public static void main(String[] args) {
        Payment[] p = {new Card(), new Upi(), new Cash()};
        for (Payment x : p) x.pay(499.0);
    }

    interface Payment { void pay(double amt); }
    static class Card implements Payment { public void pay(double a) { System.out.println("Paid " + a + " by card"); } }
    static class Upi implements Payment { public void pay(double a) { System.out.println("Paid " + a + " by UPI"); } }
    static class Cash implements Payment { public void pay(double a) { System.out.println("Paid " + a + " in cash"); } }
}
