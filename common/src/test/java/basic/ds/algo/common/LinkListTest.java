package basic.ds.algo.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LinkListTest extends TestCase{

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LinkListTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LinkListTest.class );
    }
    public void testIsLinkListCyclic(){
    
    	LinkList<Integer> linkList = new LinkList<Integer>();
        linkList.insertAtBegning(10);
        linkList.insertAtBegning(20);
        linkList.insertAtBegning(30);
       // linkList.insertCircularAtLast(100);
        assertEquals(false, linkList.isLinkListCyclic(linkList));
    }
    public void testGetNthElementFromLast(){
    	
        LinkList<Integer> linkList = new LinkList<Integer>();
        //linkList.AddAfter(null);
        
        linkList.insertAtBegning(10);
        linkList.insertAtBegning(20);
        linkList.insertAtBegning(30);
        linkList.insertAtBegning(40);
        linkList.insertAtBegning(50);
        linkList.insertAtBegning(60);
        linkList.insertAtBegning(70);
        
        int result = linkList.getNthElementFromLast(3);
        assertEquals(30, result);
    }
    
}
