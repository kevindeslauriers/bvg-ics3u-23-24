package lesson1;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        //exampleOne();
        // int num = exampleTwo("This is the best day ever!");
        // System.out.println(num);

        int answer = exampleThree();
    }

    private static int exampleThree() {
        System.out.println("Please enter a number [1-10]: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for(;number <1 || number >10;){
            System.out.println("Please enter a number [1-10]: ");
            number = in.nextInt();
        }

        return number;
    }

    private static int exampleTwo(String str) {
        // count how many "E" and "e" there are in str
        int numE = 0;

        for(int index = 0; index < str.length(); index++){
            String letter = str.substring(index, index+1);

            if (letter.equals("E") || letter.equals("e"))
                numE++;
        }

        return numE;
    }

    private static void exampleOne() {
        // for loop is meant when you wantto repeat a specific number of times
        // the loop counts to ensure that it does it that number of times.
        // below i is our counter.

        // for loop takes 3 things
        // int i = 0;  says where to start counting from
        // i < 10; is the condition that says keep repeating as long as this is true
        // i++ tells the for loop for to count or increment the counter
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
