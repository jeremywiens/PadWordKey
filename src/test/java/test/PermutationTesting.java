package test;
import static org.junit.Assert.*;

import org.junit.Test;
import words.WordPermutations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationTesting {
    @Test
    public void test() {
        //These make sense
        //System.out.println(WordPermutations.possibleWords("23"));
        //System.out.println(WordPermutations.possibleWords("572"));
        List<String> testList = WordPermutations.possibleWords("23");
        assertEquals("[ad, bd, cd, ae, be, ce, af, bf, cf]", testList.toString());

        List<String> testList2 = WordPermutations.possibleWords("577455");
        assertTrue(testList2.size()==1296);

        Set<String> set = new HashSet<String>(testList2);
        // There are duplicates?
        assertTrue(set.size() == testList2.size());
        assertTrue(testList2.contains("jprhlj") && testList2.contains("krsgjj") && testList2.contains("lssill"));
        assertFalse(testList.contains("aprhlj"));

        //System.out.println("Starting");
        //Takes roughly one second to finish a 12 digit number
        //WordPermutations.possibleWords("898664783487");
        //System.out.println("Finished");
    }
}
