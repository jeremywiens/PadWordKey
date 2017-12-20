package words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordLengths {
    private static HashMap<Integer, List<String>> wordMap = new HashMap<>();
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
        } finally

        {
            //  br.close();
        }
        return wordMap;
    }
}
