import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        exampleOne();
        
    }

    private static void exampleOne() {
        ArrayList<String> words = new ArrayList<String>();

        words.add("hi");
        words.add("bye");
        System.out.println(words.size());

        words.add(1,"hello");
        words.add(1,"hello");

        System.out.println(words.size());

        // using for loop
        // int sum = 0;
        // for (int i = 0; i < words.size(); i++) {
        //     sum += words.get(i).length();
        // }

        // using foreach loop
        int sum = 0;

        for (String s : words) {
            sum += s.length();    
        }

        System.out.println("Average words length is: " + sum / words.size());
        

        //words.remove(0);

        for (String string : words) {
            System.out.println(string);
        }

        //remove any word that is more than 3 characters
        int i = 0;
        for (String s : words) {
            if (s.length() > 1){
                words.remove(i);
                
            }
            i++;
        }

        // for (String string : words) {
        //     if (string.length()>3)
        //         words.add("blah");
        // }
    
    //     List<Integer> integers = new ArrayList();
    //     integers.add(1);
    //     integers.add(2);
    //     integers.add(3);

    // for (Integer integer : integers) {
    //     integers.remove(1);
    // }
    
    }
}
