import java.text.DecimalFormat;

public class DecimalFormatDemo
{
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println(df.format(1234567.891));
        System.out.println(new DecimalFormat("0.0%").format(0.256));
    }
}
