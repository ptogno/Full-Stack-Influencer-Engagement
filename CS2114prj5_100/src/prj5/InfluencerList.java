// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those 
// who do.
// -- marcosk
// -- ptogno
// -- Dhemeanth
package prj5;

// import java.util.Comparator;
/**
 *  A linked list with influencers to manipulate and sort influencer data
 * 
 *  @author togno
 *  @version Dec 2, 2024
 */
public class InfluencerList extends LinkedList<Influencer> {
//    public Node<Influencer> firstNode;
//    private ChannelComparator channelComparator;
//    /**
//     * firstNode
//     */
//    private Node<Influencer> firstNode;
    
    // ----------------------------------------------------------
    /**
     * Create a new InfluencerList object.
     */
    public InfluencerList() {
////        firstNode = new Node<Influencer>(null);
//        channelComparator = new ChannelComparator();
//        firstNode = 
//        
//    }
//    private void insertInOrder(Node<Influencer> insertNode, 
//        Comparator<Influencer> comp) 
//    {
//        Influencer item = insertNode.getData();
//        Node<Influencer> currentNode = firstNode;
//        Node<Influencer> prevNode = null;
//        //ChannelComparator channelComparator = new ChannelComparator();
//        
//        while ((currentNode != null) && 
//            (channelComparator.compare(item, currentNode.getData()) > 0)) {
//            
//            prevNode = currentNode;
//            currentNode = currentNode.getNext();
//        }
//        
//        if (prevNode != null) {
//            prevNode.setNext(insertNode);
//            insertNode.setNext(currentNode);
//        }
//        else
//        {
//            insertNode.setNext(firstNode);
//            firstNode = insertNode;
//        }
//    } 
//    // ----------------------------------------------------------
//    /**
//     * Sort lexicographically
//     */
//    
//    // First Node next is not does NOT return null here
//    public void sortByChannelName()
//    {
//        if (size > 1)
//        {
//            Node<Influencer> unsortedPart = firstNode.getNext();
//            Node<Influencer> sortedPart = firstNode;
//            sortedPart.setNext(null);
//            
//            while (unsortedPart != null) {
//                Node<Influencer> insertNode = unsortedPart;
//                unsortedPart = unsortedPart.getNext();
//                insertInOrder(insertNode, channelComparator);
//            }
//        }
//    }
    }
    @Override
    public java.util.ListIterator<Influencer> listIterator()
    {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public java.util.ListIterator<Influencer> listIterator(int index)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
    