// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Eva Edwards (evae)
// -- marcosk
// -- Dhemeanth

package prj5;

import student.TestCase;

// -------------------------------------------------------------------------
/**
 * TestCase for the Influencer class
 * 
 * @author Eva
 * @version Nov 21, 2024
 */
public class InfluencerTest
    extends TestCase
{
    // ~ Fields ................................................................
    private Influencer b; // January
    private Influencer c; // February
    private Influencer a; // March

    // ~ Constructors ..........................................................
    /**
     * The setUp method
     */
    public void setUp()
    {
        b = new Influencer(
            "January",
            "sonic",
            "gottagofast",
            "US",
            "Sports",
            2,
            4,
            6,
            8,
            10);

        c = new Influencer(
            "February",
            "sonic",
            "gottagofast",
            "EU",
            "Sports",
            3,
            6,
            9,
            12,
            15);

        a = new Influencer(
            "March",
            "sonic",
            "gottagofast",
            "US",
            "Sports",
            5,
            10,
            15,
            20,
            25);
    }


    // ~Public Methods ........................................................
    /**
     * Test case for the Getter methods within constructor
     */
    public void testGetters()
    {
        assertEquals(a.getMonth("March"), 2); // method not yet done
        assertEquals(a.getUsername(), "sonic");
        assertEquals(a.getChannel(), "gottagofast");
        assertEquals(a.getCountry(), "US");
        assertEquals(a.getMainTopic(), "Sports");

        assertEquals(b.getUsername(), "sonic");

        assertEquals(c.getCountry(), "EU");

        // these require an int for the month it is

        assertEquals(5, a.getLikes(2));
        assertEquals(a.getPosts(2), 10);
        assertEquals(a.getFollowers(2), 15);
        assertEquals(a.getComments(2), 20);
        assertEquals(a.getViews(2), 25);

    }


    

    /**
     * Test case for toString()
     */
    public void testEquals()
    {
        Influencer d = new Influencer(
            "March",
            "sonic",
            "x",
            "US",
            "Sports",
            5,
            10,
            15,
            20,
            25);
        
        assertFalse(a.equals(d));
        assertTrue(a.equals(c));
    }
    
    /**
     * Test all the methods for the Influencer class
     */
    public void testAll()
    {
        assertEquals(a.toString(), "gottagofast");
        a.setComments(1, 5);
        assertEquals(a.getComments(1), 5);
        a.setPosts(1, 5);
        assertEquals(a.getPosts(1), 5);
        a.setViews(1, 5);
        assertEquals(a.getViews(1), 5);
        a.setFollowers(1, 5);
        assertEquals(a.getFollowers(1), 5);
        a.setLikes(1, 5);
        assertEquals(a.getLikes(1), 5);
        a.setMonth("February");
        assertEquals(0, a.getMonth("January"));
        assertEquals(0, a.getMonth("january"));
        assertEquals(1, a.getMonth("February"));
        assertEquals(1, a.getMonth("february"));
        assertEquals(2, a.getMonth("March"));
        assertEquals(2, a.getMonth("march"));
        assertEquals(3, a.getMonth("April"));
        assertEquals(3, a.getMonth("april"));
        assertEquals(4, a.getMonth("May"));
        assertEquals(4, a.getMonth("may"));
        assertEquals(5, a.getMonth("June"));
        assertEquals(5, a.getMonth("june"));
        assertEquals(6, a.getMonth("July"));
        assertEquals(6, a.getMonth("july"));
        assertEquals(7, a.getMonth("August"));
        assertEquals(7, a.getMonth("august"));
        assertEquals(8, a.getMonth("September"));
        assertEquals(8, a.getMonth("september"));
        assertEquals(9, a.getMonth("October"));
        assertEquals(9, a.getMonth("october"));
        assertEquals(10, a.getMonth("November"));
        assertEquals(10, a.getMonth("november"));
        assertEquals(11, a.getMonth("December"));
        assertEquals(11, a.getMonth("december"));
        assertEquals(0, a.getMonth(""));
        
    }
}

