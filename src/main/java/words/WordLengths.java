package words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * WordLengths is a class to assist in creating a map of all the words in the english
 * dictionary with keys which are there lengths, and the value is a list of all the words
 * of that length
 */
public class WordLengths {
    //WordMap must have no duplicates of a word
    private static HashMap<Integer, List<String>> wordMap = new HashMap<>();

    /**
     * To be used in order to sort words by length.
     *
     * @return a Hashmap where keys which are a word's length, and the value is a
     * list of all the words of that length
     * @throws IOException if the data file cannot be read
     */
    public static HashMap<Integer, List<String>> createWordMap() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader("Data/words_alpha.txt")))

        {
            String line = br.readLine();

            while (line != null) {
                String word = line.trim();
                int length = word.length();
                if (!wordMap.containsKey(length)) {
                    List<String> Words = new ArrayList<>();
                    Words.add(word);
                    wordMap.put(length, Words);
                } else {
                    List<String> Words = wordMap.get(length);
                    Words.add(word);
                    wordMap.put(length, Words);
                }
                line = br.readLine();
            }
        }
        return wordMap;
    }
}
