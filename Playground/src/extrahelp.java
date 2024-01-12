import java.util.Scanner;

public class extrahelp {
    public static void main(String[] args) {
        // [0,10) [] inclusive () exclusive
        // for(int counter = 0; counter < 10; counter++){
        //     System.out.println(counter);
        // }

        // for(int counter = 10; counter > -10; counter--){
        //     System.out.println(counter);
        // }


        // String str = "alphabet";

        // for(int i=0; i<str.length(); i++){
        //     System.out.print(str.substring(i, i+1) + " ");
        // }
        // System.out.println();

        // for(int i=str.length()-1; i>=0; i--){
        //     System.out.print(str.substring(i, i+1) + " ");
        // }

        int rows = 7;
        int columns = 12;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < columns; c++){
                System.out.print(".");
            }

            System.out.println();
        }


        // does not do the same thing because we have to print a row at a time.
        // for(int c = 0; c < columns; c++){
        //     for(int r = 0; r < rows; r++){
        //         System.out.print(".");
        //     }
        //     System.out.println();
        // }

        boolean gameOver = false;
        int actual = 8;
        Scanner in = new Scanner(System.in);
        if(!gameOver){
            System.out.print("Guess: ");
            int guess = in.nextInt();
            if (actual == guess)
                gameOver = true;
        }
    }
}
