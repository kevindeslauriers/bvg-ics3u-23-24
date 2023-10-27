package lesson3;

public class TheMathClass {
 public static void main(String[] args) {
    
    System.out.println(Math.abs(-5));
    System.out.println(Math.abs(-5.98));

    double radius = 3.5;

    double area = Math.PI * Math.pow(radius, 2);
    System.out.println(area);

    System.out.println(Math.pow(8,1/3));    // is 1 because 1/3 = 0

    System.out.println(Math.pow(8,1.0/3));

    System.out.println(Math.sqrt(2));



 }   
}
