public class CommandLineArgsDemo
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No arguments passed. Run: java CommandLineArgsDemo one two");
        } else {
            for (int i = 0; i < args.length; i++) System.out.println("arg[" + i + "] = " + args[i]);
        }
    }
}
