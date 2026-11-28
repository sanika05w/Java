public class ProfitOrLoss
{
    public static void main(String[] args) {
        int cost = 1200, selling = 1500;
        if (selling > cost) System.out.println("Profit = " + (selling - cost));
        else if (cost > selling) System.out.println("Loss = " + (cost - selling));
        else System.out.println("No profit, no loss");
    }
}
