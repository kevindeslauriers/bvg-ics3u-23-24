import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
            
        }
    }

    public int numMatches(){
        int num = 0;
        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond()))
                num++;
        }

        return num;
    }

}
