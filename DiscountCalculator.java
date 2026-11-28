public class DiscountCalculator
{
    public static void main(String[] args) {
        double price = 2500;
        double discount = price > 2000 ? 0.20 : 0.10;
        System.out.println("Final price = " + (price - price * discount));
    }
}
