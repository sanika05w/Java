public class GstCalculator
{
    public static void main(String[] args) {
        double price = 1000, gstRate = 18;
        double gst = price * gstRate / 100;
        System.out.println("GST = " + gst);
        System.out.println("Total = " + (price + gst));
    }
}
