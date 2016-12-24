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
	 public void testFirstRepetedChar(){
		String input  = "nnchal";
		char result= StringProblems.getFirstRepeatedChar(input);
		Assert.assertEquals('n', result);
	}

}
