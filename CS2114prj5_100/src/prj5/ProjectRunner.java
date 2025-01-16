// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those 
// who do.
// -- ptogno
// -- marcosk
// -- Dheemanth
package prj5;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Iterator;

/**
 *  Class designed to run the program written in the other classes
 * 
 *  @author togno
 *  @version Nov 21, 2024
 */
public class ProjectRunner
{
    
    /**
     * Create a new ProjectRunner object.
     */
    public ProjectRunner() {
        
    }
    /**
     * Runs the project method
     * @param args  
     * @throws IOException 
     */
    public static void main (String[] args) throws IOException {
        boolean showConsole = true;
        boolean showGUI = true;
        InputFileReader filer;

        if (args.length > 0) {
        filer = new InputFileReader(args[0]); 
        }
        else {
        filer = new InputFileReader("SampleInput1_2023.csv");
        }
        
        if (showConsole) {
            
            filer.getInfluencers().sortByChannelName();
            for (int i = 0; i < filer.getInfluencers().size(); i++) {
                InfluencerCalculator ic = 
                    new InfluencerCalculator(filer.getInfluencers().get(i));
                //DecimalFormat df = new DecimalFormat("#.#");
                System.out.println(filer.getInfluencers().get(i));
                System.out.println("traditional: " + 
                ic.getTraditionalEngagementRateForQ(1));
                System.out.println("==========");
            }
            
            System.out.println("**********");
            System.out.println("**********");
            
            filer.getInfluencers().sortByReachRate();
            for (int i = 0; i < filer.getInfluencers().size(); i++) {
                InfluencerCalculator ic = 
                    new InfluencerCalculator(filer.getInfluencers().get(i));
                //DecimalFormat df = new DecimalFormat("#.#");
                System.out.println(filer.getInfluencers().get(i));
                System.out.println("reach: " + 
                ic.getReachEngagementRateForQ(1));
                System.out.println("==========");
            }
//            System.out.println("==========");
            
            /*
            if (args.length > 0) {
                filer = new InputFileReader(args[0]); 
            }
            else {
                filer = new InputFileReader("SampleInput1_2023.csv");
            }
            */
            // Errors thrown because InputFileReader not implemented,
            // fix after implementation
            //System.out.println(filer.getInfluencers().toString());
            //
            // SORT LEXICOGRAPHICALLY
            //((LinkedList<E>)filer.getInfluencers()).sortByChannelName();
            //(filer.getInfluencers()).sortByChannelName();
            
            /*
            for (Influencer i : filer.getInfluencers())
            {
                InfluencerCalculator ic = new InfluencerCalculator(i);
                //System.out.println(i.toString());
                if (i.getMonth() == 0)
                {
                    System.out.println(i.toString());
                    DecimalFormat df = new DecimalFormat("#.#");
                    System.out.println("traditional " +
                    df.format(ic.getTraditionalEngagementRate(0)));
                    System.out.println();
                }
            }
            */
            
            //System.out.println("**********");
            //System.out.println("**********");
            
            /*
            for (Influencer i : filer.getInfluencers())
            {
                InfluencerCalculator ic = new InfluencerCalculator(i);
                //System.out.println(i.toString());
                if (i.getMonth() == 0)
                {
                    System.out.println(i.toString());
                    DecimalFormat df = new DecimalFormat("#.#");
                    System.out.println("reach " +
                    df.format(ic.getReachEngagementRate(0)));
                    System.out.println();
                }
                //System.out.println("traditional " + (i.getComments(0) + 
                //i.getLikes(0)));
                //System.out.println("Followers: " + i.getFollowers(0));
                //System.out.println("Views: " + i.getViews(0));
                //System.out.println();
            }
            */
            
            //System.out.println(filer.getInfluencers().size());
        }
        
        //System.out.println(filer.getInfluencers().toString());
        
         if (showGUI) {
            /*
            * TODO: For final Submission - Should have the GUI display for the
            * input data
            */
            GUIInfluencerWindow influencerWindow = new GUIInfluencerWindow(filer.getInfluencers());
            influencerWindow.update();
        }
    }

}
