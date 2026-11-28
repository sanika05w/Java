public class PolymorphismDemo
{
    public static void main(String[] args) {
        Animal[] zoo = {new Cat(), new Cow(), new Animal()};
        for (Animal a : zoo) a.sound();
    }

    static class Animal {
        void sound() { System.out.println("Some sound"); }
    }
    static class Cat extends Animal {
        void sound() { System.out.println("Meow"); }
    }
    static class Cow extends Animal {
        void sound() { System.out.println("Moo"); }
    }
}
