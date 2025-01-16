// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Eva Edwards (evae)
// -- ptogno
// -- marcosk
// -- Dhemeanth

package prj5;


import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Test case for InfluencerCalculator
 * 
 * @author Eva
 * @version Nov 21, 2024
 */
public class InfluencerCalculatorTest
    extends TestCase
{
    // ~ Fields ................................................................
    private Influencer a;
    private InfluencerCalculator calc;
    // ~ Constructors ..........................................................
    /**
     * setUp method
     */
    public void setUp()
    {
        a = new Influencer(
            "January",
            "mario",
            "yahoo",
            "US",
            "Sports",
            5, //likes
            10, //posts
            15, //followers
            20, //comments
            25); //views
        
        
        
        calc = new InfluencerCalculator(a);
        
    }


    // ~Public Methods ........................................................
    /**
     * Test case for the Getter methods
     */
    public void testGetEngagmentRates()
    {
        assertEquals(calc.getReachEngagementRate(0), "100");
        
        assertEquals(calc.getTraditionalEngagementRate(0), "166.7");
    }
    
    /**
     * tests reach engagement rates for q with valid entries
     * and with switch cases
     * */
    public void testGetEngagementRatesForQs()
    {
        a.setLikes(1, 10);
        a.setLikes(2, 5);
        a.setComments(1, 10);
        a.setComments(2, 5);
        a.setViews(1, 15);
        a.setViews(2, 30);
        a.setFollowers(2, 5);
        
        assertEquals(calc.getReachEngagementRateForQ(1), "78.6");
        assertEquals(calc.getTraditionalEngagementRateForQ(1), "1100");
        
        a.setLikes(3, 5);
        a.setLikes(4, 10);
        a.setLikes(5, 5);
        a.setComments(3, 5);
        a.setComments(4, 10);
        a.setComments(5, 5);
        a.setViews(3, 5);
        a.setViews(4, 10);
        a.setViews(5, 5);
        a.setFollowers(5, 20);
        
        assertEquals(calc.getReachEngagementRateForQ(2), "200");
        assertEquals(calc.getTraditionalEngagementRateForQ(2), "200");
        
        a.setLikes(6, 5);
        a.setLikes(7, 10);
        a.setLikes(8, 5);
        a.setComments(6, 5);
        a.setComments(7, 10);
        a.setComments(8, 5);
        a.setViews(6, 5);
        a.setViews(7, 10);
        a.setViews(8, 5);
        a.setFollowers(8, 20);
        
        assertEquals(calc.getReachEngagementRateForQ(3), "200");
        assertEquals(calc.getTraditionalEngagementRateForQ(3), "200");
        
        a.setLikes(9, 5);
        a.setLikes(10, 10);
        a.setLikes(11, 5);
        a.setComments(9, 5);
        a.setComments(10, 10);
        a.setComments(11, 5);
        a.setViews(9, 5);
        a.setViews(10, 10);
        a.setViews(11, 5);
        a.setFollowers(11, 20);
        
        assertEquals(calc.getReachEngagementRateForQ(4), "200");
        assertEquals(calc.getTraditionalEngagementRateForQ(4), "200");
        assertEquals(calc.getTraditionalEngagementRateForQ(5), "0");

    }
    
    /**
     * tests engagement rates with zero views entries
     * */
    public void testEngagementRatesForQBad()
    {
        a.setLikes(1, 10);
        a.setLikes(2, 5);
        a.setComments(1, 10);
        a.setComments(2, 5);
        a.setViews(0, 0);
        a.setViews(1, 0);
        a.setViews(2, 0);
        
        assertEquals(calc.getReachEngagementRateForQ(1), "na");
        
        a.setLikes(3, 5);
        a.setLikes(4, 10);
        a.setLikes(5, 5);
        a.setComments(3, 5);
        a.setComments(4, 10);
        a.setComments(5, 5);
        a.setViews(3, 0);
        a.setViews(4, 0);
        a.setViews(5, 0);
        
        assertEquals(calc.getReachEngagementRateForQ(2), "na");
        
        a.setLikes(6, 5);
        a.setLikes(7, 10);
        a.setLikes(8, 5);
        a.setComments(6, 5);
        a.setComments(7, 10);
        a.setComments(8, 5);
        a.setViews(6, 0);
        a.setViews(7, 0);
        a.setViews(8, 0);
        
        assertEquals(calc.getReachEngagementRateForQ(3), "na");
        
        a.setLikes(9, 5);
        a.setLikes(10, 10);
        a.setLikes(11, 5);
        a.setComments(9, 5);
        a.setComments(10, 10);
        a.setComments(11, 5);
        a.setViews(9, 0);
        a.setViews(10, 0);
        a.setViews(11, 0);
        
        assertEquals(calc.getReachEngagementRateForQ(4), "na");
        
        assertEquals(calc.getReachEngagementRateForQ(5), "0");
    }
}
