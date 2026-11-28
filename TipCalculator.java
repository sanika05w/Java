public class TipCalculator
{
    public static void main(String[] args) {
        double bill = 850, tipPercent = 10;
        double tip = bill * tipPercent / 100;
        System.out.println("Tip = " + tip + ", Total = " + (bill + tip));
    }
}
