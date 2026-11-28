public class TypeCastingObjects
{
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Dog d = (Dog) a;
        d.fetch();
    }

    static class Animal { void sound() { System.out.println("Some sound"); } }
    static class Dog extends Animal {
        void sound() { System.out.println("Woof"); }
        void fetch() { System.out.println("Fetching ball"); }
    }
}
