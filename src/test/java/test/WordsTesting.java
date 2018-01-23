package test;

import static org.junit.Assert.*;

import org.junit.Test;
import words.WordLengths;

import java.util.HashMap;
import java.util.List;

public class WordsTesting {

	@Test
	public void test() {
		HashMap<Integer, List<String>> PWKTest;
		try {
			PWKTest = WordLengths.createWordMap();
			assertTrue(PWKTest.get(3).contains("the"));
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
		;
	}

}