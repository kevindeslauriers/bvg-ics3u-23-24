package lesson1;

public class IfStatementExample {
    public static void main(String[] args) {
        boolean isHappy = false;
        boolean hasBlueShoes = false;
        int x = 12;

        // if(isHappy){
        //     System.out.println("I am glad you are happy.");
        //     System.out.println("Sometimes it is hard to be happy in the rain.");
        // }

        // System.out.println("Today it is raining");

        // if (!hasBlueShoes){
        //     System.out.println("You are not wearing blue shoes.");
        //     System.out.println("How dare you!");
        // }

        // if(isHappy)     // no {} then the next line is part of the if and only the next line
        //     System.out.println("I am glad you are happy.");
        //     System.out.println("Sometimes it is hard to be happy in the rain.");

        if (x > 0)
            System.out.println(x + " is positive.");  
            
        if (x % 2 == 0)
            System.out.println(x + " is even.");

        if (isHappy) 
            System.out.println("Happy");

    }
}