// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those 
// who do.
// -- ptogno
// -- marcosk
// -- Dhemeanth
package prj5;

import junit.framework.TestCase;

// -------------------------------------------------------------------------
/**
 *  Class to test reach and trad comparators
 * 
 *  @author dheem
 *  @version Dec 6, 2024
 */
public class ReachAndTradComparatorTest
    extends TestCase
{
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

    /**
     * Sets up the initial conditions for testing
     */
    public void setUp()
    {
        //intentionally blank
    }
    
    /**
     * Tests all the methods
     */
    public void testAll()
    {
        ReachComparator c = new ReachComparator();
        TraditionalComparator t = new TraditionalComparator();
        Influencer i1 = new Influencer("February",
            "x",
            "x",
            "x",
            "x",
            1,
            1,
            1,
            1,
            1);
        Influencer i2 = new Influencer("February",
            "sonic",
            "gottagofast",
            "EU",
            "Sports",
            1,
            1,
            1,
            1,
            1);
        assertEquals(0, c.compare(i1, i2));
        //assertEquals(0, t.compare(i1, i2));
        i1.setViews(1, 0);
        i2.setViews(1, 0);
        assertEquals(0, c.compare(i1, i2));
        //assertEquals(0, t.compare(i1, i2));
        i1.setViews(1, 0);
        i2.setViews(1, 1);
        assertEquals(-1, c.compare(i1, i2));
        //assertEquals(-1, t.compare(i1, i2));
        i1.setViews(1, 1);
        i2.setViews(1, 0);
        assertEquals(1, c.compare(i1, i2));
        //assertEquals(1, t.compare(i1, i2));
        
        i1 = new Influencer("March",
            "x",
            "x",
            "x",
            "x",
            1,
            1,
            1,
            1,
            1);
        i2 = new Influencer("March",
            "sonic",
            "gottagofast",
            "EU",
            "Sports",
            1,
            1,
            1,
            1,
            1);
        assertEquals(0, t.compare(i1, i2));
        /*
        i1.setFollowers(1, 0);
        i2.setFollowers(1, 0);
        assertEquals(0, t.compare(i1, i2));
        i1.setFollowers(1, 0);
        i2.setFollowers(1, 1);
        assertEquals(-1, t.compare(i1, i2));
        i1.setFollowers(1, 1);
        i2.setFollowers(1, 0);
        assertEquals(1, t.compare(i1, i2));
        */
    }
}