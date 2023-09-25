package lesson4;

public class ExampleOne {

    public static void main(String[] args) {
        int mark1 = 80, mark2 = 83, mark3 = 96;
        int numTests = 3;

        //double average = (mark1 + mark2 + mark3) / numTests;      // works
        //double average = (double)(mark1 + mark2 + mark3) / numTests;  // works
        //double average = (mark1 + (double)mark2 + mark3) / numTests;  // works
        double average = (double)((mark1 + mark2 + mark3) / numTests);  // cast is too late - does not work

        // int -> double is a widening cast conversion


        System.out.println(average);
    }
}