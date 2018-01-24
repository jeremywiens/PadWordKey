package test;

import static org.junit.Assert.*;

import org.junit.Test;
import words.WordLengths;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsTesting {

	@Test
	public void test() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(PWKTest.get(3).contains("the"));
			System.out.println(PWKTest.get(3));
		} catch (Exception e) {
		}
		;
	}

	@Test
	public void test1() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(PWKTest.get(5).contains("fatty"));
		} catch (Exception e) {
		}
		;
	}

	@Test
	public void test2() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(!PWKTest.get(7).contains("tennis"));
		} catch (Exception e) {
		}
		;
	}

	@Test
	public void test3() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(!PWKTest.get(4).contains("jkhg"));
		} catch (Exception e) {
		}
		;
	}

	@Test
	public void test4() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(!PWKTest.get(9).contains("penis"));
		} catch (Exception e) {
		}
	}
	@Test
	public void test5() throws IOException{
		HashMap<Integer, List<String>> PWKTest = WordLengths.createWordMap();
		Set<String> bossman = new HashSet<>();
		for(String s : PWKTest.get(5)){
			bossman.add(s);
		}
		assertTrue(bossman.size() == PWKTest.get(5).size());
	}

}