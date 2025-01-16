// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- marcosk
// -- Eva Edwards (evae)
// -- Dhemeanth
package prj5;

import java.text.DecimalFormat;

// -------------------------------------------------------------------------
/**
 * A calculator for the Influencer class to get the engagement rates
 * 
 * @author Eva
 * @version Nov 21, 2024
 */
public class InfluencerCalculator
{
    // ~ Fields ................................................................
    private Influencer user;
    //private double engagement;
    //private double traditionalEngagement;

    // ~ Constructors ..........................................................
    /**
     * Constructor for InfluencerCalculator
     * 
     * @param user
     *            The Influencer to calculate on
     */
    public InfluencerCalculator(Influencer user)
    {
        // comments, likes, followers, views needed from Influencer
        // this.user = new Influencer();
        this.user = user;
        

    }


    // ~Public Methods ........................................................
    /**
     * Getter to calculate the Reach Engagement Rate
     * 
     * @param a month we want reach engagement rate for
     * @return Reach Engagement Rate
     */
    public String getReachEngagementRate(int a)
    {
        double engagement =
            (((user.getComments(a) + user.getLikes(a)) * 100.0) / 
                user.getViews(a));
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(engagement);
        //return engagement;
    }


    /**
     * Getter to calculate the Reach Engagement Rate for quarter
     * 
     * @param a quarter we want reach engagement for
     * @return Reach Engagement Rate for quarter
     */
    public String getReachEngagementRateForQ(int a)
    {
        double total = 0.0;
        long views = 0;
        DecimalFormat df = new DecimalFormat("#.#");
        switch (a)
        {
            case (1):
                for (int i = 0; i < 3; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                    views += user.getViews(i);
                }
                if (views != 0)
                {
                    total /= views;
                }
                else
                {
                    return "na";
                }
                total *= 100;
                return df.format(total);
            case (2):
                for (int i = 3; i < 6; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                    views += user.getViews(i);
                }
                if (views != 0)
                {
                    total /= views;
                }
                else
                {
                    return "na";
                }
                total *= 100;
                return df.format(total);
            case (3):
                for (int i = 6; i < 9; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                    views += user.getViews(i);
                }
                if (views != 0)
                {
                    total /= views;
                }
                else
                {
                    return "na";
                }
                total *= 100;
                return df.format(total);
            case (4):
                for (int i = 9; i < 12; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                    views += user.getViews(i);
                }
                if (views != 0)
                {
                    total /= views;
                }
                else
                {
                    return "na";
                }
                total *= 100;
                return df.format(total);
            default:
                break;
        }
        return df.format(total);
    }


    /**
     * Getter to calculate the Traditional Engagement Rate
     * 
     * @param a month we want engagement rate for 
     * @return Traditional Engagement Rate
     */
    public String getTraditionalEngagementRate(int a)
    {
        double traditionalEngagement =
            (((user.getComments(a) + user.getLikes(a)) * 100.0) /
                user.getFollowers(a));
        DecimalFormat df = new DecimalFormat("#.#");
        return df.format(traditionalEngagement);
        //return traditionalEngagement;
    }


    /**
     * Getter to calculate the Traditional Engagement Rate for quarter
     * 
     * @param a quarter we want trad engagement rate for
     * @return Traditional Engagement Rate for quarter
     */
    public String getTraditionalEngagementRateForQ(int a)
    {
        double total = 0.0;
        DecimalFormat df = new DecimalFormat("#.#");
        switch (a)
        {
            case (1):
                for (int i = 0; i < 3; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                }
                total /= user.getFollowers(2);
                total *= 100;
                return df.format(total);
            case (2):
                for (int i = 3; i < 6; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                }
                total /= user.getFollowers(5);
                total *= 100;
                return df.format(total);
            case (3):
                for (int i = 6; i < 9; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                }
                total /= user.getFollowers(8);
                total *= 100;
                return df.format(total);
            case (4):
                for (int i = 9; i < 12; i++)
                {
                    total +=
                        user.getComments(i) + user.getLikes(i);
                }
                total /= user.getFollowers(11);
                total *= 100;
                return df.format(total);
            default:
                break;
        }
        return df.format(total);
    }
}
