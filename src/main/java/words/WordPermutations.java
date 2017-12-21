package words;

import java.util.*;

/**
 * WordPermutations - Given a number, (as a string) a list of all permutations of
 * possible letter orderings will be returned. This is based on the standard
 * number-to-letter association on the typical phone keypad.
 */
public class WordPermutations {
    //See method below for standard keypad layout
    private static HashMap<Integer, List<String>> keyPad = new HashMap<>();

    /**
     * Given a number, a list of all permutations of possible letter
     * orderings will be returned. This is based on the standard
     * number-to-letter association on the typical phone keypad.
     * Requires: number contains only numerical characters [2,9]
     * (For reasonable time, number< 13 digits)
     *
     * @param number is a string representing the number to find all permutations for.
     * @return A list of strings which are all permutations based on the number given.
     */
    public static List<String> possibleWords(String number) {
        List<String> possibleWords = new ArrayList<>();
        int[] numberArray = new int[number.length()];
        //Convert the string number into an array of ints.
        for (int i = 0; i < number.length(); i++) {
            char x = number.charAt(i);
            int y = x - '0';
            numberArray[i] = y;
        }
        createKeyPad();

        //the int array "magnitude" is an array of either threes
        //or fours. These are the number of different letters this digit
        //has on a standard keyboard. i.e. number 2 has three
        //letters "a", "b", and "c".

        //the int array "switchNow" has each element correlate to the
        // given digit from the string in the parameter.
        int[] magnitude = new int[number.length()];
        int[] switchNow = new int[number.length()];
        int totalMag = 1;
        int count = 0;
        for (int i : numberArray) {
            int thisMag = keyPad.get(i).size();
            switchNow[count] = totalMag;
            magnitude[count] = thisMag;
            totalMag = totalMag * thisMag;
            count++;
        }

        //the int array "magnitude" is used to ensure the the indices
        // do not exceed their limits. In the hashmap "keyPad", the
        // value of key two is a list of "a", "b", and "c". There is
        //no value at index 3.

        //the int  array "switchNow" is the core of the algorithm.
        // Ex: in the given number "23" The possible permutations are:
        // [ad, bd, cd, ae, be, ce, af, bf, cf]. The first letter switches
        // at every iterations and switchNow[0] == 1. The second letter
        // switches every three iterations and switchNow[1] == 3.
        int[] currentIndex = new int[number.length()];
        for (int i = 1; i < totalMag + 1; i++) {
            count = 0;
            String currentWord = "";
            for (int j : numberArray) {
                currentWord = currentWord + keyPad.get(j).get(currentIndex[count]);
                if (i % switchNow[count] == 0) {
                    currentIndex[count]++;
                    if (!(magnitude[count] > currentIndex[count])) {
                        currentIndex[count] = 0;
                    }
                }
                count++;
            }
            possibleWords.add(currentWord);
        }
        return possibleWords;
    }

    //This hashmap exists as a typcal keypad on a phone does.
    //With the numbers having three or four associated letters.
    private static void createKeyPad() {
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
