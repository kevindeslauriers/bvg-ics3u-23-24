package arrays;

public class ArrayExamplesOne {
    public static void main(String[] args) {
        //exampleOne();
       // exampleTwo();
    //    exampleThree();

        exampleFour();
        
    }

    private static void exampleFour() {
        int[] arr = {4,2,8,0,1,12,-5};

        for (int el : arr) {
            System.out.println(el);
        }

        // arr = {7, 9}; not allowed
    }

    private static void exampleThree() {
        int[] marks = new int[10];

        for (int mark : marks) {
            mark = (int)(Math.random()*41) + 60;
        }

        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    private static void exampleTwo() {
        int[] marks = new int[10];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random()*41) + 60;
        }

        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    private static void exampleOne() {
        int[] arr = new int[5];

        for (int el : arr) {
           System.out.println(el); 
        }

        int index = 2;

        arr[index] = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i +": " + arr[i]);
        }


    }
}
