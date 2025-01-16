// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- ptogno
// -- Eva Edwards (evae)
// -- marcosk
// -- Dhemeanth
package prj5;

import java.util.Comparator;

// -------------------------------------------------------------------------
/**
 * A comparator class with a method to compare two influencer's traditional
 * engagement value
 * 
 * @author togno
 * @version Dec 2, 2024
 */
public class TraditionalComparator
    implements Comparator<Influencer>
{
    /**
     * A compare method for two influencer's traditional engagement value
     * 
     * @param o1
     *            the first influencer
     * @param o2
     *            the second influencer
     * @return the result of the compare
     */
    @Override
    public int compare(Influencer o1, Influencer o2)
    {
        /*
        InfluencerCalculator ic1 = new InfluencerCalculator(o1);
        InfluencerCalculator ic2 = new InfluencerCalculator(o2);
        return Integer.valueOf(
            (String.valueOf(
                (Double.valueOf(ic1.getTraditionalEngagementRateForQ(1)))
                    - (Double
                        .valueOf(ic2.getTraditionalEngagementRateForQ(1))))));
        */
        InfluencerCalculator ic1 = new InfluencerCalculator(o1);
        InfluencerCalculator ic2 = new InfluencerCalculator(o2);
        /*
        Double o1Reach = Double.valueOf(ic1.getReachEngagementRateForQ(1));
        Double o2Reach = Double.valueOf(ic2.getReachEngagementRateForQ(1));
        return (int)(o1Reach - o2Reach);
        */
        
        /*
        if ((ic1.getTraditionalEngagementRateForQ(1)).equals("na"))
        {
            if (!ic2.getTraditionalEngagementRateForQ(1).equals("na"))
            {
                return -1;
            }
            return 0;
        }
        if ((ic2.getTraditionalEngagementRateForQ(1)).equals("na"))
        {
            return 1;
        }
        */
        return (int)((Double.valueOf(ic1.getTraditionalEngagementRateForQ(1))) 
            - Double.valueOf(ic2.getTraditionalEngagementRateForQ(1)));
    }
}
