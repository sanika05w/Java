public class InverseOf2x2
{
    public static void main(String[] args) {
        double a = 4, b = 7, c = 2, d = 6;
        double det = a * d - b * c;
        System.out.println(d / det + " " + (-b / det));
        System.out.println(-c / det + " " + a / det);
    }
}
