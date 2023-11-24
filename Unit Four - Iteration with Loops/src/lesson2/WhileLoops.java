package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        //int number = exampleOne();
        //int number2 = exampleTwo(1,10);

        int result = exampleThree(1,100);
        System.out.println(result);
        result = exampleFour(1,100);
        System.out.println(result);


        
    }

    private static int exampleFour(int min, int max) {
        int sum = 0;

        int i = min;
        while(i <= max){
            sum += i;
            i++;
        }


        return sum;

    }

    private static int exampleThree(int min, int max) {
        int sum = 0;
        for(int i = min; i <= max; i++){
            sum += i;
        }

        return sum;
    }

    private static int exampleTwo(int min, int max) {
        int result = 0;
        boolean isValid = false;
        Scanner in = new Scanner(System.in);
        while(!isValid){
            System.out.print("Please enter a number from " + min + " to " + max + ": ");
            try{
                result = Integer.parseInt(in.nextLine());   // parseInt takes a String and converts to an int
                if (result >= min && result <= max){
                    isValid = true;
                }
            }catch(NumberFormatException badThing){
                System.out.println("I said a number!!!!");
            }
        }

        return result;
    }

    private static int exampleOne() {
        Scanner in = new Scanner(System.in);
        int result = -1;

        //while(result < 1 || result > 10){
        while(!(result>=1 && result<=10)){
            System.out.println("Please enter a number from 1 to 10: ");
            result = in.nextInt();
        }

        in.close();

        return result;




    }
}