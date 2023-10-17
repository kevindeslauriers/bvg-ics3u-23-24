package lesson2;

public class Homework {

    public static void main(String[] args) {
        //1
        String tag = "[[]]";
        String word = "Yay";

        String result = tag.substring(0, 2) + word + tag.substring(2);
        System.out.println(result);


        
        //4
        String a = "pizza";
        String b = "pie";
        System.out.println(a+b+a);
    }
}