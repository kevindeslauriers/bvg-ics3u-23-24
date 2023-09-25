package lesson4;

public class ExampleThree {

    public static void main(String[] args) {
        int mark1 = 84, mark2 = 91, mark3 = 97;
        int numTests = 3;

        // Three  types of Errors:

        // Logic Errors: Program runs, doesn't crash but you don't get the expected output
        double average = mark1 + mark2 + mark3 / (double)numTests;

        // Runtime Errors: Runs but craches when it is running ex: divide by 0: throws an exception
        int number = 7 / 0;

        /*
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at lesson4.ExampleThree.main(ExampleThree.java:15)
         */

        // Syntax Error: Won't run (compile), red squiggle, error in the Java Code, forgetting a "" or maybe ;
        //System.out.println("Hello World);




    }
}