// Virginia Tech Honor Code Pledge:
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those 
// who do.
// -- ptogno
// -- marcosk
// -- Dhemeanth
package prj5;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 *  Test class for the LinkedList class
 * 
 *  @author togno
 *  @version Dec 6, 2024
 */
public class LinkedListTest
    extends TestCase
{
    //~ Fields ................................................................

    /**
     * Creates an InfluencerList object
     */
    private InfluencerList x = new InfluencerList();
    /**
     * Influencer for testing
     */
    private Influencer influencer1 = new Influencer("jan", "name", "country", 
        "something", "null", 1, 1, 1, 1, 1);
    /**
     * Influencer for testing
     */
    private Influencer influencer2 = new Influencer("feb", "name1", "country1", 
        "something1", "null1", 2, 2, 2, 2, 2);
    /**
     * Influencer for testing
     */
    private Influencer influencer3 = new Influencer("mar", "name2", "country2", 
        "something2", "null2", 3, 3, 3, 3, 3);
    /**
     * Influencer for testing
     */
    private Influencer influencer4 = new Influencer("q", "name4", "country3", 
        "something3", "null3", 4, 4, 4, 4, 4);


    
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Test method for isEmpty
     */
    public void testIsEmpty()
    {
        assertTrue(x.isEmpty());
    }
    // ----------------------------------------------------------
    /**
     * Test method to test the size of the LinkedList
     */
    public void testSize() {
        assertEquals(x.size(), 0);
        x.add(influencer1);
        assertEquals(x.size(), 1);
    }
    /**
     * Test method to test Contains
     */
    public void testContains() {
        assertFalse(x.contains(influencer1));
        x.add(influencer1);
        x.add(influencer2);
        assertTrue(x.contains(influencer1));
        assertTrue(x.contains(influencer2));
    }
    /**
     * Test method to test contains channel
     */
    public void testContainsChannel() {
        x.add(influencer1);
        assertTrue(x.containsChannel(influencer1));
        assertFalse(x.containsChannel(influencer2));
    }
    /**
     * Test method to test toArray
     */
    public void testToArray() {
        // unused method
        assertNull(x.toArray());
    }
    /**
     * Test method to test remove
     */
    public void testRemove() {
        // unused method
        assertFalse(x.remove(influencer1));
    }
    /**
     * Test method to test contains all
     */
    public void testContainsAll() {
        // unused method
        assertFalse(x.containsAll(x));
    }
    /**
     * Test method to test add all
     */
    public void testAddAll() {
        // unused method
        assertFalse(x.addAll(x));
    }
    /**
     * Test method to remove all
     */
    public void testRemoveAll() {
        // unused method
        assertFalse(x.removeAll(x));
    }
    /**
     * Test method to retain all
     */
    public void testRetainAll() {
        assertFalse(x.retainAll(x));
    }
    /**
     * Test method to test get
     */
    public void testGet() {
        Exception exception = null;
        x.add(influencer1);
        x.add(influencer2);
        
      //  assertEquals(x.getNext());
        assertEquals(x.get(1), influencer2);
        assertEquals(x.get(0), influencer1);
        
        try {
            x.get(2);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }
    /**
     * Method to test add method
     */
    public void testAddWithNull() {
        Exception exception = null;
        try {
            x.add(null);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IllegalArgumentException);   
    }
    /**
     * Method to test add out of bounds
     */
    public void testAddWithOutOfBounds() {
        Exception exception = null;
        
        try {
            x.add(-1, influencer1);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);
        
        try {
            x.add(influencer1);
            x.add(2, influencer2);
        }
        catch (Exception e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception instanceof IndexOutOfBoundsException);
    }
    /**
     * Test method to test add method
     */
    public void testAdd() {
        x.add(influencer1);
        assertEquals(x.size(), 1);
        assertEquals(x.get(0), influencer1);
    }
    /**
     * Test method for remove
     */
    public void testRemoveInt() {
        //unused method
        assertNull(x.remove(0));
    }
    /**
     * Test method of indexOf
     */
    public void testIndexOf() {
        //ununsed method
        assertEquals(x.indexOf(influencer1), 0);
    }
    /**
     * 
     */
    public void testLastIndexOf() {
        //unused method
        assertEquals(x.lastIndexOf(influencer1), 0);
    }
    /**
     * Tests by name
     */
    public void testSortByChannelName() {
        x.add(influencer4);
        x.add(influencer3);
        x.add(influencer2);
        x.add(influencer1);
        x.sortByChannelName();
        assertEquals(influencer1, x.get(0));
        assertEquals(influencer2, x.get(1));
        assertEquals(influencer3, x.get(2));
        assertEquals(influencer4, x.get(3));
    }
    /**
     * Tests by trate
     */
    public void testSortByTradAndReach() {
        influencer1.setViews(1, 1);
        influencer1.setViews(2, 1);
        influencer2.setViews(1, 1);
        influencer2.setViews(2, 1);
        influencer3.setViews(1, 1);
        influencer3.setViews(2, 1);
        influencer4.setViews(1, 1);
        influencer4.setViews(2, 1);
        
        influencer1.setFollowers(2, 1);
        influencer2.setFollowers(2, 1);
        influencer3.setFollowers(2, 1);
        influencer4.setFollowers(2, 1);
        x.add(influencer4);
        x.add(influencer3);
        x.add(influencer2);
        x.add(influencer1);
        x.sortByTradRate();
        assertEquals(influencer1, x.get(3));
        assertEquals(influencer2, x.get(2));
        assertEquals(influencer3, x.get(1));
        assertEquals(influencer4, x.get(0));
    }
}
