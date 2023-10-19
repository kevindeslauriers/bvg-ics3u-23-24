package lesson3;

public class RandomMethodExample {
    public static void main(String[] args) {
        // for (int i = 0; i < 15; i++) {
        //     System.out.println((int)(Math.random()*10)+1);
        // }

        // for (int i = 0; i < 25; i++) {
        //     System.out.println((int)(Math.random()*21)-10);
        // }

        int lowerBound = -10;
        int upperBound = 10;
        // upperBound-lowerBound+1 => number of possible random numbers

        for (int i = 0; i < 15; i++) {
            System.out.println(((int)Math.random()*(upperBound-lowerBound+1))+lowerBound);
        }
    }
}
