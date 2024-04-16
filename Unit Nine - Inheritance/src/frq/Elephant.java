package frq;

public class Elephant extends Herbivore{
    private double length;

    public Elephant(String name, double length){
        super("elephant", name);
        this.length = length;
    }

    public String toString(){
        return super.toString() + " with tusks " + length + " meters long";
    }
}
