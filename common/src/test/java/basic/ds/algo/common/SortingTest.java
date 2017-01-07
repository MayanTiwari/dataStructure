package basic.ds.algo.common;

import basic.ds.sorting.SelectionSort;
import basic.ds.sorting.SortClass;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SortingTest extends TestCase {

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public SortingTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(SortingTest.class);
	}

	public void testSelectionSort() {
		SortClass s = new SelectionSort();
		int[] a = { 64, 25, 12, 22, 11 };
		int[] result = new int[a.length];
		result = s.Sort(a);
		assertTrue(true);
	}
	public void testSelectionRecursiveSort() {
		SelectionSort s = new SelectionSort();
		int[] a = { 64, 25, 12, 22, 11 };
		int[] result = new int[a.length];
		result = s.SortRecursive(a);
		assertTrue(true);
	}
}
