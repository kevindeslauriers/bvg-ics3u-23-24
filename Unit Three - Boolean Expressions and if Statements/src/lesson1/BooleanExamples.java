package lesson1;


public class BooleanExamples {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasBlueShoes = false;

        System.out.println(isHappy);    // true
        System.out.println(hasBlueShoes);   // false

        System.out.println(4>3);        // true
        System.out.println(4<3);        // false

        System.out.println(4>=3);       // true
        System.out.println(4<=3);       // false

        System.out.println(4==3);       // false
        String str = new String("Hello");
        System.out.println("Hi".equals(str));   // false
        System.out.println("Hello".equals(str));    // true
        System.out.println(str == "Hello");     // false 

        System.out.println(4!=3);       // true (!= is not equal)

        System.out.println(!isHappy);  // false because !true = false
        System.out.println(isHappy == false);

        System.out.println(!"Hello".equals(str));



    }
}