package lesson2;

public class ElseIfExamples {
    public static void main(String[] args) {
        boolean isHappy = true;

        // if (isHappy)
        //     System.out.println("I am glad you are happy on Halloween");
        // if (!isHappy)
        //     System.out.println("I am sorry you cant be happy on Halloween!");

        // if (isHappy)
        //     System.out.println("I am glad you are happy on Halloween");
        // else if (!isHappy)
        //     System.out.println("I am sorry you cant be happy on Halloween!");

        // if (isHappy)
        //     System.out.println("I am glad you are happy on Halloween");
        // else
        //     System.out.println("I am sorry you cant be happy on Halloween!");

        int mark = 63;

        // if (mark >= 80)
        //     System.out.println("A");
        // else if (mark >= 70)
        //     System.out.println("B");
        // else if (mark >= 60)
        //     System.out.println("C");
        // else if (mark >= 50)
        //     System.out.println("D");
        // else 
        //     System.out.println("F");

        if (mark >= 80)
            System.out.println("A");
        if (mark >= 70)
            System.out.println("B");
        if (mark >= 60)
            System.out.println("C");
        if (mark >= 50)
            System.out.println("D");
        else 
            System.out.println("F");

    }
}
