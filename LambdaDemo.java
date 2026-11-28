public class LambdaDemo
{
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator mul = (a, b) -> a * b;
        System.out.println(add.op(6, 7));
        System.out.println(mul.op(6, 7));
    }

    interface Calculator { int op(int a, int b); }
}
