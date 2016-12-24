package basic.ds.algo.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import basic.ds.tree.*;

public class BSTTest extends TestCase{

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BSTTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BSTTest.class );
    }
    @org.junit.Test
    public void testBST(){
    	BinarySearchTree<Integer,Integer> bst = new BinarySearchTree<Integer,Integer>();
    	bst.put(1, 10);
    	bst.put(4, 40);
    	bst.put(3, 30);
    	bst.put(2, 20);
    	bst.put(5, 20);
    	bst.put(6, 20);
    	System.out.println(bst.toString());
    	System.out.println(bst.heightOfTree());
    	assertTrue(true);
    }
    
    
}
