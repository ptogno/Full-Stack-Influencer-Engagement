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

import java.util.LinkedList;
import java.util.Scanner;
import student.IOHelper;
import java.io.File;
import java.text.ParseException;

/**
 *  Class to read input files
 * 
 *  @author togno
 *  @version Nov 21, 2024
 */
public class InputFileReader
{
    /**
     * LinkedList of Influencers
     */
    private InfluencerList influencers;
    //private LinkedList<Influencer> influencers;
    /**
     * String representation of file name
     */
    //public String fileName;
    
    /**
     * Create a new InputFileReader object.
     * @param fileName
     */
    public InputFileReader(String fileName) {
        //this.fileName = fileName;
        influencers = new InfluencerList(); 
        //influencers = new LinkedList<Influencer>();
        readInputFile(fileName);
    }
    /**
     * A constant for the month tokens
     */
    public static final int MONTHS_TOKENS = 12;
    /**
     * A constant for the user tokens
     */
    public static final int USER_TOKENS = 4;
    
    /**
     * Method to read the input file 
     * @param fileName name of the file being read
     */
    public void readInputFile(String fileName) {
    
  
    File newFile = new File(fileName);
    Scanner inStream = IOHelper.createScanner(newFile);
    inStream.nextLine();
    while (inStream.hasNextLine()) {

        
        String line = inStream.nextLine().replaceAll(" ", "");
        String[] values = line.split(",");
        String month = values[0];
        /*
        if (!isValidMonth(month))
        {
            continue;
        }
        */
        String username = values[1];
        String channel = values[2];
        String country = values[3];
        String mainTopic = values[4];
        int likes = toInt(values[5]);
        int posts = toInt(values[6]);
        int followers = toInt(values[7]);
        int comments = toInt(values[8]);
        int views = toInt(values[9]); 


        Influencer newInfluencer = new Influencer(month, username, channel, 
            country, mainTopic, likes, posts, followers, comments, views);
        //influencers.add(newInfluencer);
        //System.out.println(newInfluencer.getMonth(month));
        
        if (influencers.containsChannel(newInfluencer))
        {
            for (int j = 0; j < influencers.size(); j++)
            {
                Influencer i = influencers.get(j);
                /*
                if (!newInfluencer.equals(i))
                {
                    //influencers.add(newInfluencer);
                    //i.setMonth(month);
                }
                */
                if (newInfluencer.equals(i))
                {
                    i.setMonth(month);
                    int m = i.getMonth(month);
                    i.setLikes(m, likes);
                    i.setPosts(m, posts);
                    i.setFollowers(m, followers);
                    i.setComments(m, comments);
                    i.setViews(m, views);
                }
            }
        }
        else
        {
            influencers.add(newInfluencer);
        }
        //System.out.println(newInfluencer.toString());
        //System.out.println(influencers.size());
        /*
        if (!influencers.contains(newInfluencer))
        {
            influencers.add(newInfluencer);
        }
        */
        } //end while
    //System.out.println(influencers.toString());
    //inStream.close();
    } 
    /**
     * Private helper method to convert string data to integer
     * @param str String to convert to integer
     * 
     * @return integer to represent string data
     */
    private int toInt(String str) {

        try{
            return Integer.parseInt(str);
        }
        catch(Exception e){
            return 0;
        }
    }
    /**
     * Private helper method to check if month is valid
     * @param month
     * @return boolean for if month is valid 
     */
    private boolean isValidMonth(String month) {
        String[] validMonths = {"January", "February", "March", 
            "April", "May", "June", "July", "August", "September", 
            "October", "November", "Decemeber"};
        for (String validMonth : validMonths) {
            if (validMonth.equals(month)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * gives the list of influencers
     * @return influencers as a linked list
     * */
    public InfluencerList getInfluencers()
    //public LinkedList<Influencer> getInfluencers()
    {
        return influencers;
    }
    
    /*
    public void calculateEngagmentRates()
    {
        int totalLikes = 0;
        int totalPosts = 0;
        int totalFollowers = 0;
        int totalComments = 0;
        int totalViews = 0;
        
        for (Influencer influencer: influencers)
        {
            //
        }
    }
    */
}
