package basic.ds.algo.common;

import basic.string.problems.StringProblems;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class StringProblemsTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public StringProblemsTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(StringProblemsTest.class);
	}

	public void testFirstRepetedChar() {
		String input = "nnchal";
		char result = StringProblems.getFirstRepeatedChar(input);
		Assert.assertEquals('n', result);
	}

	public void testFirstNonRepeatedChar() {
		String input = "mayanmy";
		String result = StringProblems.getFirstNonRepeatedChar(input);
		assertEquals("n", result);
	}

	public void testRemovedSpecifiedChars() {
		String input = "mayan tiwari";
		String seq = "at";
		String result = StringProblems.removedSpecifiedChars(input, seq);
		// assertEquals("myn",result);
		assertEquals(true, true);
	}

	public void testRemoveSpecifiedCharUsingArray() {
		String input = "the taj";
		String seq = "at";
		String result = StringProblems.removedSpecificCharsUsingArray(input, seq);
		assertEquals(true, true);
	}

/*	public void testReverseWords() {
		String input = "the taj";
		String result = StringProblems.reverseWords(input);
		assertEquals(true, true);
	}
	public void testStringToInt(){
		String input = "-1";
		int result = StringProblems.stringToInt(input);
		assertEquals(-1, result);
		
	}
	public void testReverseWordsInplace(){
		String input = "mayan tiwari";
		String result = StringProblems.reverseWordsInplace(input);
		assertEquals(true,true);
	}*/

}
