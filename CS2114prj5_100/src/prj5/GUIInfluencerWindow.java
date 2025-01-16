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

import cs2.*;
import cs2.Button;
import cs2.Shape;
import cs2.Window;

import java.awt.*;

// -------------------------------------------------------------------------
/**
 * Influencer stats gui window that displays the channels sorted by their
 * channel and engagment rates through different months. the user can choose
 * which month to display and how to sort the information
 * 
 * @author marcos
 * @version Dec 4, 2024
 */
public class GUIInfluencerWindow
{
    // ~ Fields ................................................................
    private Window window;
    private Button jan;
    private InfluencerList influencers;
    
    private boolean clickedReach;
    private boolean clickedTrad;
    private boolean clickedSort;
    private boolean clickedJan;
    private boolean clickedFeb;
    private boolean clickedMar;
    private boolean clickedQ;
    private boolean clickedName;

    private static final double DISPLAY_FACTOR = 1.5;
    
    private static final int MARGIN = 150;
    
    //private AList<Shape[]> statRectangles;
    
    //private Shape[] influencerShapes = new Shape[4];
    
    private static final int GRAPH_WIDTH = 50;
    // ~ Constructors ..........................................................
    // ----------------------------------------------------------
    /**
     * Create a new InfluencerWindow object.
     * 
     * @param influencer InfluencerList to populate the 
     */
    
    public GUIInfluencerWindow(InfluencerList influencer)
    {
        window = new Window("marcosk ptogno");
        window
            .setSize((int)(600 * DISPLAY_FACTOR), (int)(500 * DISPLAY_FACTOR));

        this.influencers = influencer;

        
        clickedReach = false;
       
        clickedTrad = false;
        clickedSort = false;
        clickedJan = false;
        clickedFeb = false;
        clickedMar = false;
        clickedQ = false;
        clickedName = false;
        Button feb;
        Button mar;
        Button quar;
        Button trad;
        Button reach;
        Button name;
        Button rate;
        Button quit;

        jan = new Button("January");
        window.addButton(jan, WindowSide.SOUTH);
        jan.onClick(this, "clickedJan");

        feb = new Button("February");
        window.addButton(feb, WindowSide.SOUTH);
        feb.onClick(this, "clickedFeb");

        mar = new Button("March");
        window.addButton(mar, WindowSide.SOUTH);
        mar.onClick(this, "clickedMar");

        quar = new Button("First Quarter(Jan - March)");
        window.addButton(quar, WindowSide.SOUTH);
        quar.onClick(this, "clickedQuar");

        trad = new Button("Traditional Engagment Rate");
        window.addButton(trad, WindowSide.WEST);
        trad.onClick(this, "clickedTrad");

        reach = new Button("Reach Engagment Rate");
        window.addButton(reach, WindowSide.WEST);
        reach.onClick(this, "clickedReach");

        name = new Button("Sort by Channel Name");
        window.addButton(name, WindowSide.NORTH);
        name.onClick(this, "clickedName");

        rate = new Button("Sort by Engagment Rate");
        window.addButton(rate, WindowSide.NORTH);
        rate.onClick(this, "clickedSort");

        quit = new Button("Quit");
        window.addButton(quit, WindowSide.NORTH);
        quit.onClick(this, "clickedQuit");
        
        
        //this.statRectangles = new AList<Shape[]>();
        
        
    }
    
    // ----------------------------------------------------------
    /**
     * Button to return clicked January button
     * @param button janButton
     */
    public void clickedJan(Button button)
    {
        clickedFeb = false;
        clickedMar = false;
        clickedQ = false;
        clickedJan = true;
        update();

    }
    /**
     * Button to return clicked Feb button
     * @param button febButton
     */
    public void clickedFeb(Button button)
    {
        clickedFeb = true;
        clickedMar = false;
        clickedQ = false;
        clickedJan = false;
        update();

    }
    /**
     * Button to return clicked Mar button
     * @param button marButton
     */
    public void clickedMar(Button button)
    {
        clickedFeb = false;
        clickedMar = true;
        clickedQ = false;
        clickedJan = false;
        update();
    }
    /**
     * Button to return clicked Quarter button
     * @param button QButton
     */
    public void clickedQuar(Button button)
    {
        clickedFeb = false;
        clickedMar = false;
        clickedQ = true;
        clickedJan = false;
        update();
    }
    
    /**
     * Method to sort graphs by Traditional Engagement rate
     * @param button button to sort the graphs by Trad
     */
    public void clickedTrad(Button button)
    {
        clickedReach = false;
        clickedTrad = true;
        update();
    }
    
    // ----------------------------------------------------------
    /**
     * Method to sort the data by reach rate
     * @param button button to sort by reach engagement rate
     */
    public void clickedReach(Button button)
    {
        clickedTrad = false;
        clickedReach = true;
        update();    }
    
    // ----------------------------------------------------------
    /**
     * Method to press a button then sort the data by name
     * @param button button to sort by name
     */
    public void clickedName(Button button)
    {
        clickedSort = false;
        clickedName = true;
        influencers.sortByChannelName();
        update();
    }
    
    // ----------------------------------------------------------
    /**
     * Method to sort the data by reach rate
     * @param button button to sort by reach engagement rate
     */
    public void clickedSort(Button button)
    {
        clickedName = false;
        clickedSort = true;
        
        if (clickedReach)
        {
            influencers.sortByReachRate();
        }
        else if (clickedTrad)
        {
            influencers.sortByTradRate();
        }
        update();
    }
    
    /**
     * Method to populate the window with data and graphs
     */
    public void drawGraph() {
        int graphWidth = GRAPH_WIDTH;
        double graphHeight = 200;
        InfluencerCalculator influencerCalc;

        for (int i = 0; i < influencers.size(); i++) {
            
            influencerCalc = new InfluencerCalculator(influencers.get(i));
            if (clickedReach) {
                if (clickedJan) {
                        
                    graphHeight = Double.valueOf
                        (influencerCalc.getReachEngagementRate(0));
                }
                else if (clickedFeb) {
                      
                    graphHeight = Double.valueOf
                        (influencerCalc.getReachEngagementRate(1));
                }
                else if (clickedMar) {
                        
                    graphHeight = Double.valueOf
                        (influencerCalc.getReachEngagementRate(2));
                }
                else if (clickedQ) { 
                    graphHeight = Double.valueOf
                        (influencerCalc.getReachEngagementRateForQ(1));
                }
            }
             if (clickedTrad) {
                if (clickedJan) {
                            
                    graphHeight = Double.valueOf
                        (influencerCalc.getTraditionalEngagementRate(0));
                }
                else if (clickedFeb) {
                            
                    graphHeight = Double.valueOf
                        (influencerCalc.getTraditionalEngagementRate(1));
                }
                else if (clickedMar) {
                            
                    graphHeight = Double.valueOf
                        (influencerCalc.getTraditionalEngagementRate(2));
                }
                else if (clickedQ) { 
                    graphHeight = Double.valueOf
                        (influencerCalc.getTraditionalEngagementRateForQ(1));
                }
            }
            Shape data = new Shape(jan.getX() - 175 + (MARGIN * i), 
                jan.getY() + 500 - (int)graphHeight, 
                graphWidth, (int)graphHeight, Color.BLACK);
            Shape name = new TextShape(jan.getX() - 175 + (MARGIN * i), 
                jan.getY() + 500, "" + influencers.get(i));
//            Shape data = new Shape
//                (jan.getX() - 175 + (MARGIN * i),
//                    jan.getY() + 500 - (int)graphHeight, 
//                    graphWidth, (int)graphHeight);
            window.addShape(data);
            window.addShape(name);
        }  
        
    }
    
        
    
    public void update() {
        window.removeAllShapes();
        drawGraph();
        
        
    }
    /**
     * quits out of the window
     * @param button button clicked
     * */
    public void clickedQuit(Button button)
    {
        System.exit(0);
    }
}
