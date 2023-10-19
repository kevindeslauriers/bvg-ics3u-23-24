package extrahelp;

public class oct17 {
    public static void main(String[] args) {
        //System.out.println(1 + 2 + "hi" + 5 + 7);

        // 4 + 6 = 10 because both are strings
        // 4 + "hi" => "4hi"

        //System.out.println(1 + 2 + "hi" + (5 + 7));  // "3hi12"



        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s1));

        System.out.println(4 == 4);     // == meant to check if primitives are equal
        System.out.println(4 == (1+3));

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1.length());

        






    }
}
