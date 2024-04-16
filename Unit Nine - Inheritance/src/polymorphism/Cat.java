package polymorphism;

public class Cat extends Animal{
    private int age;
    private String name;
    
    public Cat(int age, String name){
        super(7);
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "I am a Cat. My name is " + name;
    }

    public boolean equals(Object obj){
        if (obj instanceof Cat){
            return age == ((Cat)obj).age && name.equals(((Cat)obj).name);
        }

        return false;
    }

    public void makeSound(){    // overwritten Parent Version
        meow();
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
