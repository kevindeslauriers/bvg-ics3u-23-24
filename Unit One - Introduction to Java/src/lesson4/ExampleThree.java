package lesson4;

public class ExampleThree {
    public static void main(String[] args) {
        int mark1 = 80, mark2 = 83, mark3 = 96;
        // Types of Errors

        // Logic Error -Program runs, does not CRASH but gives wrong results
        double average = mark1 + mark2 + mark3 / 3;

        // Runtime Error - When the program is running and it crashes - throws an exception
        /*
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
                at lesson4.ExampleThree.main(ExampleThree.java:12)
         */
        int result = 3 / 0;
        // Syntax Error - Anything Java does not understand (gives a red squiggle like missing a ")
        // System.out.println("Hello World);


    }
}
