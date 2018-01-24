package words;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Character.isLetter;

public class Main {

    /**
     * Main method to run program from the command line.
     *
     * @param args not relevant
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your number to find the possible words or \nenter a word to find the number: ");
            String number = input.nextLine();
            if (number.toLowerCase().equals("quit"))
                quit = true;
            else {
                if (isLetter(number.charAt(0))) {
                    System.out.println(WordToNumber.getNumber(number));
                } else {
                    List<String> words = null;
                    try {
                        words = findActualWords(number);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println(words);
                }
            }
        }
    }

    /**
     * findActualWords will find the words which can be created when using
     * the number to letter association on a telephone keypad.
     *
     * @param number is a string which is the number which all the english words
     *               associated with it will be found
     * @return a List of all of the words associated with the given number
     * @throws IOException if Data file cannot be read
     */
    public static List<String> findActualWords(String number) throws IOException {
        HashMap<Integer, List<String>> listWords = WordLengths.createWordMap();
        List<String> WordsOfLength = listWords.get(number.length());
        List<String> PossibleWords = WordPermutations.possibleWords(number);

        List<String> RealWords = PossibleWords.parallelStream().filter(p -> WordsOfLength.contains(p))
              .collect(Collectors.toList());

        return RealWords;
    }
}


