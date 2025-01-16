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

import java.util.*;

/**
 *  Linked List to for Influencers
 * 
 *  @author dheem
 *  @version Nov 21, 2024
 * @param <E> The object
 */
public abstract class LinkedList<E>
    implements List<E>
{
    //~ Private Class .........................................................
    
    // -------------------------------------------------------------------------
    /**
     *  LinkedList class to be populated with influencer objects
     *  @param <E>
     * 
     *  @author togno
     *  @version Dec 2, 2024
     */
    public class Node<E>
    {
        
        private E data;
        
        private Node<E> next;
        
        // ----------------------------------------------------------
        /**
         * Create a new Node object.
         * @param e data of the node
         */        
        public Node(E e) 
        { 
            data = e; 
        }
        
        //~Public  Methods ....................................................
        
        /**
         * Gets the data of the node
         * @return data
         */
        public E getData()
        {
            return data;
        }
        
        /**
         * Gets the next node
         * @return the next node
         */
        @SuppressWarnings("unused")
        public Node<E> getNext()
        {
            return next;
        }
        
        /**
         * Sets the next node
         * @param n is the new next node
         */
        public void setNext(Node<E> n)
        {
            next = n;
        }
    }
    
    // -------------------------------------------------------------------------
    /**
     *  Iterator for list
     * 
     *  @author dheem
     *  @version Dec 4, 2024
     */
    public class ListIterator implements Iterator<E>
    {
        private Node<E> next;
        
        // ----------------------------------------------------------
        /**
         * Create a new ListIterator object.
         */
        public ListIterator()
        {
            next = firstNode;
        }
        
        @Override
        public boolean hasNext()
        {
            return (next.data != null || next == null);
        }

        @Override
        public E next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException("No more elems");
            }
            Node<E> temp = next;
            next = next.next;
            return temp.data;
        }

        
        
    }

    /**
     * Channel comparator used by the InfluencerList class
     */
//    private ChannelComparator channelComparator;
    /**
     * FirstNode used by the InfluencerList class
     */
    private Node<E> firstNode; // sentinel node
    /**
     * Size of the linked list
     */
    private int size;
    
    // ----------------------------------------------------------
    /**
     * Create a new LinkedList object.
     */
    public LinkedList() {
        firstNode = null;
        size = 0;
    }
    
    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO Auto-generated method stub
        return size == 0;
    }

    @Override
    public boolean contains(Object o)
    {
        Node<E> current = firstNode;
        while (current != null) {
            if (o.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    /**
     * Method to check whether a Influencer contains a certain channel name
     * @param o influencer object
     * @return boolean true if it contains channel, false if otherwise
     */
    public boolean containsChannel(Influencer o)
    {
        @SuppressWarnings("unchecked")
        Node<Influencer> current = 
            (LinkedList<E>.Node<Influencer>)firstNode;
        while (current != null) {
            if (o.getChannel().equals(current.data.getChannel())) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    /*
    private class ListIterator implements Iterator<E> {
        private Node<E> next = firstNode;
        private boolean newCurr = false;
        
        public boolean hasNext() {
            return (next != null);
        }

        @Override
        public E next()
        {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = next.data;
            next = next.getNext(); 
            newCurr = true;
            return data;
        }
    }
    */
    
    @Override
    public Iterator<E> iterator()
    {
        return new ListIterator();
    }

    @Override
    public Object[] toArray()
    {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return null;
    }

    @Override
    public boolean add(E obj)
    {
        if (obj == null) {
            throw new IllegalArgumentException("Object is null");
        }
        Node<E> current = firstNode;
        
        if (isEmpty()) {
            firstNode = new Node<E>(obj);
        }
        
        else {
            while (current.next != null) {
                current = current.next;
            }
            current.setNext(new Node<E>(obj));
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o)
    {
        //unused method
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        //unused method
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        //unused method
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        //unused method
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        //unused method
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
        //unused method
    }

    @Override
    public void clear()
    {
        // unused method
    }

    @Override
    public E get(int index)
    {
        Node<E> current = firstNode;
        int currentIndex = 0;
        E data = null;
        while (current != null) {
            if (currentIndex == index) {
                data = current.data;
            }
            currentIndex++;
            current = current.next;
        }
        if (data == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data;
    }

    @Override
    public E set(int index, E element)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(int index, E element)
    {
        if (element == null) {
            throw new IllegalArgumentException("Object is null");
        }
        if (index < 0 || (index > size())) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        
        Node<E> current = firstNode;
        
        if (isEmpty()) {
            firstNode = new Node<E>(element); 
        }
        else {
            if (index == 0) {
                Node<E> newNode = new Node<E>(element);
                newNode.setNext(firstNode);
                firstNode = newNode;
            }
            else {
                int currentIndex = 0;
                while (current != null) {
                    if ((currentIndex + 1) == index) {
                        Node<E> nextNext = current.next;
                        Node<E> newNode = new Node<E>(element);
                        current.setNext(newNode);
                        newNode.setNext(nextNext);
                        break;
                    }
                    current = current.next;
                }
            }
        }
        size++;
    }

    @Override
    public E remove(int index)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Object o)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int lastIndexOf(Object o)
    {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public List<E> subList(int fromIndex, int toIndex)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /**
     * Sorts by channel name
     */
    @SuppressWarnings("null")
    public void sortByChannelName()
    {
        boolean swapped = (firstNode != null);
        ChannelComparator c = new ChannelComparator();
        while (swapped)
        {
            swapped = false;
            Node<E> curr = firstNode;
            Node<E> next = curr.next;
            Node<E> prev = null;
            while (next != null)
            {
                if (c.compare((Influencer)curr.data, (Influencer)next.data) < 0)
                {
                    swapped = true;
                    if (curr == firstNode)
                    {
                        firstNode = next;
                        Node<E> temp = next.next;
                        next.next = curr;
                        curr.next = temp;
                        curr = firstNode;
                    }
                    else
                    {
                        prev.next = curr.next;
                        curr.next = next.next;
                        next.next = curr;
                        curr = next;
                    }
                }
                prev = curr;
                curr = curr.next;
                next = curr.next;
            }
        }
    }
    
    /**
     * Sorts by reach rate in descending order
     */
    public void sortByReachRate()
    {
        boolean swapped = (firstNode != null);
        ReachComparator c = new ReachComparator();
        while (swapped)
        {
            swapped = false;
            Node<E> curr = firstNode;
            Node<E> next = curr.next;
            Node<E> prev = null;
            while (next != null)
            {
                if (c.compare((Influencer)curr.data, (Influencer)next.data) < 0)
                {
                    swapped = true;
                    if (curr == firstNode)
                    {
                        firstNode = next;
                        Node<E> temp = next.next;
                        next.next = curr;
                        curr.next = temp;
                        curr = firstNode;
                    }
                    else
                    {
                        prev.next = curr.next;
                        curr.next = next.next;
                        next.next = curr;
                        curr = next;
                    }
                }
                prev = curr;
                curr = curr.next;
                next = curr.next;
            }
        }
    }
    
    /**
     * Sorts by trad rate in ascending order
     */
    public void sortByTradRate()
    {
        boolean swapped = (firstNode != null);
        TraditionalComparator c = new TraditionalComparator();
        while (swapped)
        {
            swapped = false;
            Node<E> curr = firstNode;
            Node<E> next = curr.next;
            Node<E> prev = null;
            while (next != null)
            {
                if (c.compare((Influencer)curr.data, (Influencer)next.data) < 0)
                {
                    swapped = true;
                    if (curr == firstNode)
                    {
                        firstNode = next;
                        Node<E> temp = next.next;
                        next.next = curr;
                        curr.next = temp;
                        curr = firstNode;
                    }
                    else
                    {
                        prev.next = curr.next;
                        curr.next = next.next;
                        next.next = curr;
                        curr = next;
                    }
                }
                prev = curr;
                curr = curr.next;
                next = curr.next;
            }
        }
    }
}