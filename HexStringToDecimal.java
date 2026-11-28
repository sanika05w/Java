public class HexStringToDecimal
{
    public static void main(String[] args) {
        String hex = "1A3F";
        System.out.println(hex + " = " + Integer.parseInt(hex, 16));
    }
}
