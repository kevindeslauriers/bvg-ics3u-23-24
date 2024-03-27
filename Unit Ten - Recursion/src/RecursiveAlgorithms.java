/**
 * RecursiveAlgorithms
 */
public class RecursiveAlgorithms {

    public static void main(String[] args) {
        // int fact = factorial(7);
        // System.out.println(fact);

        for (int i = 1; i <= 100; i++) {
            long fib = fibonacci(i);
            System.out.println(i + ": " + fib);
        }
        
    }

    // returns the nth number in the fibonacci sequence
    private static long fibonacci(int n) {
        if (n==1 || n==2)
            return 1;
        
        return fibonacci(n-1) + fibonacci(n-2);
    }


    // returns n!
    private static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n-1);
    }

    // 1,1,2,3,5,8,13,21,34
}