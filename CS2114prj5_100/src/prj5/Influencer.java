// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- marcosk
// -- Eva Edwards (evae)
// -- ptogno
// -- Dhemeanth

package prj5;

// -------------------------------------------------------------------------
/**
 * Influencer Class to get the user's information / month data
 * 
 * @author Eva
 * @version Nov 21, 2024
 */
public class Influencer 
{
    // ~ Fields ................................................................
    //private String[] months =
        //{ "January", "February", "March", "April", "May", "June", "July",
            //"August", "September", "October", "November", "Decemeber" };
    private int month;
    private String username;
    private String channel;
    private String country;
    private String mainTopic;
    private int[] likes;
    // private int likes;
    private int[] posts;
    // private int posts;
    private int[] followers;
    // private int followers;
    private int[] comments;
    // private int comments;
    private int[] views;
    // private int views;

    // ~ Constructors ..........................................................
    /**
     * The constructor for the Influencer class.
     * 
     * @param month
     *            the months
     * @param username
     *            the username
     * @param channel
     *            the channel name
     * @param country
     *            the country
     * @param mainTopic
     *            the main topic
     * @param likes
     *            amount of likes
     * @param posts
     *            amount of posts
     * @param followers
     *            amount of followers
     * @param comments
     *            amount of comments
     * @param views
     *            amount of views
     */
    public Influencer(
        String month,
        String username,
        String channel,
        String country,
        String mainTopic,
        int likes,
        int posts,
        int followers,
        int comments,
        int views)
    {
        /*
         * months = {"January", "February", "March", "April", "May", "June",
         * "July", "August", "September", "October", "November", "Decemeber"};
         */
        this.month = getMonth(month);
        this.username = username;
        this.channel = channel;
        this.country = country;
        this.mainTopic = mainTopic;

        this.likes = new int[12];
        this.likes[this.month] = likes;
        this.posts = new int[12];
        this.posts[this.month] = posts;
        this.followers = new int[12];
        this.followers[this.month] = followers;
        this.comments = new int[12];
        this.comments[this.month] = comments;
        this.views = new int[12];
        this.views[this.month] = views;

        /*
         * this.likes = likes;
         * this.posts = posts;
         * this.followers = followers;
         * this.comments = comments;
         * this.views = views;
         */

    }


    // ~Public Methods ........................................................
    /**
     * Getter for the month
     * 
     * @param a
     *            the month
     * @return the month number
     */
    public int getMonth(String a)
    {
        switch (a)
        {
            case ("January"):
                return 0;
            case ("january"):
                return 0;
            case ("February"):
                return 1;
            case ("february"):
                return 1;
            case ("March"):
                return 2;
            case ("march"):
                return 2;
            case ("April"):
                return 3;
            case ("april"):
                return 3;
            case ("May"):
                return 4;
            case ("may"):
                return 4;
            case ("June"):
                return 5;
            case ("june"):
                return 5;
            case ("July"):
                return 6;
            case ("july"):
                return 6;
            case ("August"):
                return 7;
            case ("august"):
                return 7;
            case ("September"):
                return 8;
            case ("september"):
                return 8;
            case ("October"):
                return 9;
            case ("october"):
                return 9;
            case ("November"):
                return 10;
            case ("november"):
                return 10;
            case ("December"):
                return 11;
            case ("december"):
                return 11;
            default:
                return 0;
        }
    }


    /**
     * Getter for the month
     * 
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }


    /**
     * Setter for the month
     * 
     * @param m
     *            the string of the month
     */
    public void setMonth(String m)
    {
        this.month = getMonth(m);
    }


    /**
     * Getter for retrieving the username
     *
     * @return the username
     */
    public String getUsername()
    {
        return username;
    }


    /**
     * Getter for retrieving the channel string
     *
     * @return the channel
     */
    public String getChannel()
    {
        return channel;
    }


    /**
     * Getter for retrieving the country
     *
     * @return the country
     */
    public String getCountry()
    {
        return country;
    }


    /**
     * Getter for retrieving the main topic
     *
     * @return the main topic
     */
    public String getMainTopic()
    {
        return mainTopic;
    }


    /**
     * Getter for the like amount
     * 
     * @param a is the int rep of the month
     * @return the amount
     */
    public int getLikes(int a)
    {
        return likes[a];
        // return likes;
    }


    /**
     * Getter for the like amount
     * 
     * @param m is the month
     * @param num is the likes for that month
     */
    public void setLikes(int m, int num)
    {
        // return likes[a];
        likes[m] = num;
    }


    

    /**
     * Getter for the follower amount
     * 
     * @param a is the month
     * @return the amount
     */
    public int getFollowers(int a)
    {
        return followers[a];
        // return followers;
    }


    /**
     * Setter for the follower amount
     * 
     * @param m is the month
     * @param num
     *            the number of followers
     */
    public void setFollowers(int m, int num)
    {
        followers[m] = num;
        // return followers;
    }


   

    /**
     * Getter for the view amount
     * 
     * @param a is the month
     * @return the amount
     */
    public int getViews(int a)
    {
        return views[a];
        // return views;
    }


    /**
     * Setter for the view amount
     * 
     * @param m is the month
     * @param num is the num of views for that month
     */
    public void setViews(int m, int num)
    {
        views[m] = num;
        // return views;
    }


    

    /**
     * Getter for the post amount
     * 
     * @param a is the month
     * @return the amount
     */
    public int getPosts(int a)
    {
        return posts[a];
        // return posts;
    }


    /**
     * Setter for the post amount
     * 
     * @param m is the month
     * @param num is the posts for that month
     */
    public void setPosts(int m, int num)
    {
        posts[m] = num;
        // return posts;
    }


   


    /**
     * Getter for the comment amount
     * 
     * @param a is the month
     * @return the amount
     */
    public int getComments(int a)
    {
        return comments[a];
        // return comments;
    }


    /**
     * Getter for the comment amount
     * 
     * @param m is the month
     * @param num is the num of comments for that month
     */
    public void setComments(int m, int num)
    {
        comments[m] = num;
        // return comments;
    }



    /**
     * toString method
     * 
     * @return the string
     */
    public String toString()
    {
        return channel;
    }


    /**
     * Method to tell if two channels are equal
     * 
     * @param obj is an object
     * @return boolean
     */
    @Override
    public boolean equals(Object obj)
    {
        return channel.equals(((Influencer)obj).getChannel());
    }
}
