package words;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<String> findActualWords(String number) throws IOException{
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






