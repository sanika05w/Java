import java.util.Scanner;

public class ReadWithScanner
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.hasNextLine() ? sc.nextLine() : "Guest";
        System.out.println("Hello, " + name);
    }
}
