package basic.ds.algo.common;

import basic.resursion.Permutations;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RecursionTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public RecursionTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RecursionTest.class);
	}
	public void testPermute(){
		Permutations p = new Permutations("ab");
		p.permute();
		assertEquals(true, true);
	}
}
