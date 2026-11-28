public class MultilevelInheritance
{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }

    static class Animal { void eat() { System.out.println("Eating"); } }
    static class Dog extends Animal { void bark() { System.out.println("Barking"); } }
    static class Puppy extends Dog { void weep() { System.out.println("Weeping"); } }
}
