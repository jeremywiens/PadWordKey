package words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordPermutations {
    List<String> possibleWords = new ArrayList<>();
    private static HashMap<Integer, List<String>> keyPad = new HashMap<>();
    public List<String> possibleWords(String number){
        int[] numberArray = new int[number.length()];
        for(int i = 0; i<number.length();i++) {
            char x = number.charAt(i);
            int y = x - '0';
            numberArray[i] = y;
        }
        createKeyPad();
        List<String> possibleWords = new ArrayList<>();
        List<String> actualWords = new ArrayList<>();


        return actualWords;
    }

    private void createKeyPad(){
        List<String> two = Arrays.asList("a", "b", "c");
        List<String> three = Arrays.asList("d", "e", "f");
        List<String> four = Arrays.asList("g", "h", "i");
        List<String> five = Arrays.asList("j", "k", "l");
        List<String> six = Arrays.asList("m", "n", "o");
        List<String> seven = Arrays.asList("p", "q", "r", "s");
        List<String> eight = Arrays.asList("t", "u", "v");
        List<String> nine = Arrays.asList("w", "x", "y", "z");
        keyPad.put(1, new ArrayList<String>());
        keyPad.put(2, two);
        keyPad.put(3, three);
        keyPad.put(4, four);
        keyPad.put(5, five);
        keyPad.put(6, six);
        keyPad.put(7, seven);
        keyPad.put(8, eight);
        keyPad.put(9, nine);
    }

}
