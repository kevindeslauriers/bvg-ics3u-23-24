package lesson2;

public class CompoundBooleanExpressions {

    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasRedShoes = false;

        System.out.println(true && true);   // true - both are T to be T
        System.out.println(true && false);
        System.out.println(false && true);  // short-circuit because both need to be true and it has false &&
        System.out.println(false && false);

        int x = 7;
        int y = 6;

        System.out.println(x > y && x < 6); // false

        System.out.println(true || true);      // short circuit because T || anything is T
        System.out.println(true || false);
        System.out.println(false || true);  
        System.out.println(false || false);

    }
}