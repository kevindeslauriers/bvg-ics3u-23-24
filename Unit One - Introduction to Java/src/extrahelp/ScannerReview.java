package extrahelp;

import java.util.Scanner;

public class ScannerReview {

    public static void main(String[] args) {
        Scanner input; // declares a variable called input that will hold a Scanner
        
        input = new Scanner(System.in);   // creates a new Scanner and assigns ot to input (System.in is the keyboard)

        System.out.println("PLease enter an integer:");
        int x = input.nextInt();

        System.out.println(x);

        System.out.println("Please enter a decimal number: ");
        double y = input.nextDouble();

        System.out.println(y);

        
    }
}