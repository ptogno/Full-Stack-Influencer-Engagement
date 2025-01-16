// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those 
// who do.
// -- ptogno
// -- Eva Edwards (evae)
// -- marcosk
// -- Dheemanth
package prj5;

import student.TestCase; 
// -------------------------------------------------------------------------
/**
 *  Test class of the ChannelComparator class
 * 
 *  @author dheem
 *  @version Dec 6, 2024
 */
public class ChannelComparatorTest extends TestCase
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
     * Tests all the methods in the ChannelComparator
     */
    public void testAll()
    {
        ChannelComparator c = new ChannelComparator();
        Influencer i1 = new Influencer("February",
            "sonic",
            "gottagofast",
            "EU",
            "Sports",
            3,
            6,
            9,
            12,
            15);
        Influencer i2 = new Influencer("February",
            "sonic",
            "gottagofast",
            "EU",
            "Sports",
            3,
            6,
            9,
            12,
            15);
        assertEquals(0, c.compare(i1, i2));
    }
}
