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

import java.util.Comparator;

/**
 * Method to compare two influencers by channel name
 * 
 * @author togno
 * @version Dec 2, 2024
 */
public class ChannelComparator
    implements Comparator<Influencer>
{
    /**
     * Method to compare the influencer channel names
     * 
     * @param o1
     *            first influencer
     * @param o2
     *            second influencer
     * @return the result
     */
    @Override
    public int compare(Influencer o1, Influencer o2)
    {
        return o1.getChannel().compareToIgnoreCase(o2.getChannel());
    }
}
