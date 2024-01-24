import java.util.ArrayList;

public class ArrayListExamples1 {
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne() {
        ArrayList<String> words = new ArrayList<String>();  // in the <> is the type of data in the list
                                                            // refernce types only

        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(3);

        words.add("hi");
        words.add("bye");
        //System.out.println(words.size());
        words.add("hello");
        words.add("happy");
        words.add("hungry");
        words.add("house");
        words.add("hamburger");
        words.add(1, "cough");

        // String s = words.set(2, " bird");
        // String t = words.remove(0);

        // int sum = 0;
        // for (int i = 0; i < words.size(); i++) {
        //     sum += words.get(i).length();
        // }

        // System.out.println(sum / words.size());

        // int sum = 0;

        // for(String s : words){      // for each loop iterates through all elements of the list
        //     sum += s.length();
        // }

        // System.out.println(sum / words.size());

            // concurrentmodificationexception -> do not use foreach if you are changing the size of the list
        // int i = 0;
        // for (String s : words) {
        //     if (s.length() > 1){
        //         words.remove(i);
                
        //     }
        //     i++;
        // }

        // remove the words that start with h
        // for (int i = 0; i < words.size(); i++) {
        //     if (words.get(i).substring(0, 1).equals("h")){
        //         words.remove(i);
        //         i--;
        //     }
        // }

        for (int i = words.size()-1; i >=0; i--) {
            if (words.get(i).substring(0, 1).equals("h")){
                words.remove(i);
            }
        }

        for (String str : words) {
            System.out.println(str);
        }


        
    }
}
