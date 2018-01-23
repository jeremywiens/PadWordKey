package test;

import static org.junit.Assert.*;

import org.junit.Test;
import words.WordToNumber;

public class WordToNumTest {
    @Test
    public void Test(){
        String word = "The quick brown fox jumped over the lazy dog.";
        String returnNum = "843784252769636958673368378435299364";
        assertEquals(returnNum, WordToNumber.getNumber(word));
    }
    @Test
    public void Test2(){
        String word = "";
        assertEquals("", WordToNumber.getNumber(word));
        String word2 = "HelloBoss";
        String returnNum = "435562677";
        assertEquals(returnNum, WordToNumber.getNumber(word2));
    }
}
