public class PrintfAlignment
{
    public static void main(String[] args) {
        String[] item = {"Pen", "Notebook", "Eraser"};
        double[] price = {10.5, 45.0, 5.25};
        for (int i = 0; i < item.length; i++) System.out.printf("%-10s Rs.%8.2f%n", item[i], price[i]);
    }
}
