package words;

import java.io.IOException;
import java.util.*;

public class Main {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            boolean quit = false;
            while(!quit) {
                System.out.println("Enter your number to find the possible words: ");
                String number = input.nextLine();
                if(number.toLowerCase().equals("quit"))
                    quit = true;
                else {
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

        public static List<String> findActualWords(String number) throws IOException{
            HashMap<Integer, List<String>> listWords = WordLengths.createWordMap();
            List<String> WordsOfLength = listWords.get(number.length());
            List<String> PossibleWords = WordPermutations.possibleWords(number);
            List<String> RealWords = new ArrayList<>();
            for(String s: WordsOfLength)
            {
                for(String k: PossibleWords){
                    if(s==k){
                        RealWords.add(s);
                    }
                }
            }
            return RealWords;
        }
    }


