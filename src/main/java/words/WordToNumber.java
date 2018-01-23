package words;

/**
 * WordToNumber- given any word or sequence of characters, a number will be
 * returned which represents this word on a standard telephone key-pad.
 */
public class WordToNumber {

    /**
     * This method will return a string of integers based on the given
     * word. Will return an empty string if none exists.
     *
     * @param word is the word which will be translated to a number
     * @return a string of integers
     */
    public static String getNumber(String word){
        String number = "";

        for(int i = 0; i<word.length();i++){
            char thisChar = word.toLowerCase().charAt(i);
            if(thisChar == 'a' || thisChar == 'b' || thisChar == 'c')
                number = number + 2;
            else if(thisChar == 'd' || thisChar == 'e' || thisChar == 'f')
                number = number + 3;
            else if(thisChar == 'g' || thisChar == 'h' || thisChar == 'i')
                number = number + 4;
            else if(thisChar == 'j' || thisChar == 'k' || thisChar == 'l')
                number = number + 5;
            else if(thisChar == 'm' || thisChar == 'n' || thisChar == 'o')
                number = number + 6;
            else if(thisChar == 'p' || thisChar == 'q' || thisChar == 'r' || thisChar == 's')
                number = number + 7;
            else if(thisChar == 't' || thisChar == 'u' || thisChar == 'v')
                number = number + 8;
            else if(thisChar == 'w' || thisChar == 'x' || thisChar == 'y' || thisChar == 'z')
                number = number + 9;
        }
        return number;
    }
}
