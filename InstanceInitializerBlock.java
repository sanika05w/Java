public class InstanceInitializerBlock
{
    public static void main(String[] args) {
        new Demo();
        new Demo();
    }

    static class Demo {
        {
            System.out.println("Instance block runs before constructor");
        }
        Demo() { System.out.println("Constructor"); }
    }
}
