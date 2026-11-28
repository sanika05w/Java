public class DefaultInterfaceMethod
{
    public static void main(String[] args) {
        new Car().start();
        new Car().honk();
    }

    interface Vehicle {
        void start();
        default void honk() { System.out.println("Beep beep"); }
    }
    static class Car implements Vehicle {
        public void start() { System.out.println("Car started"); }
    }
}
