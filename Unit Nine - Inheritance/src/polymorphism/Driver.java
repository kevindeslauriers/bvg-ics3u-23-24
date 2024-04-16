package polymorphism;

public class Driver {
    public static void main(String[] args) {
        // Dog dog1 = new Dog();
        // dog1.makeSound();
        // dog1.bark();

        Cat cat1 = new Cat(7,"Steve");
        System.out.println(cat1);
        // cat1.makeSound();
        // cat1.meow();

        //cat1.bark() - cannot do this

        // Animal animal1 = new Dog();
        //Dog animal2 = new Animal();   not all animals are dogs

        // animal1.makeSound();        // dynamic binding
        // animal1.bark();
        // animal1 = cat1;
        // animal1.makeSound();

        // animal1.bark();

    }
    
}
