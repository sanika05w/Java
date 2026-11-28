public class MaskCreditCard
{
    public static void main(String[] args) {
        String card = "1234567812345678";
        String masked = "*".repeat(card.length() - 4) + card.substring(card.length() - 4);
        System.out.println(masked);
    }
}
