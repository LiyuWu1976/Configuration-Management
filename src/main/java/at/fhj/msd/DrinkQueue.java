package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue implementation for storing drinks with a fixed maximum size.
 */
public class DrinkQueue implements IQueue<Drink>{
    /**
     * The list storing the queue elements.
     */
    protected  List<Drink> elements = new ArrayList<>();
    /**
     * The maximum number of drinks the queue can hold.
     */
    private int maxSize;

    /**
     * Creates a DrinkQueue with the specified maximum size.
     *
     * @param maxSize the maximum number of drinks the queue can hold
     */

     public DrinkQueue(int maxSize){
        this.maxSize=maxSize;

     }

     /**
     * Adds a drink to the queue.
     *
     * @param obj the drink to add
     * @return true if the drink was added, false if the queue is full or drink is null
     */
    @Override
    public boolean offer(Drink obj) {
        if (obj == null || elements.size() >= maxSize) {
            return false;
        }
        elements.add(obj);
        return true;
    }

    /**
     * Retrieves and removes the first drink in the queue.
     *
     * @return the first drink, or null if the queue is empty
     */
    @Override
    public Drink poll() {
        if (elements.isEmpty()) {
            return null;
        }
        Drink drink = elements.get(0);
        elements.remove(0);
        return drink;
    }
    
    /**
     * Retrieves and removes the first drink, or throws an exception if empty.
     *
     * @return the first drink
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink remove() {
        Drink drink = (Drink) poll();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return drink;
    }

    /**
     * Retrieves the first drink without removing it.
     *
     * @return the first drink, or null if the queue is empty
     */
    @Override
    public Drink peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    /**
     * Retrieves the first drink without removing it, or throws an exception if empty.
     *
     * @return the first drink
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public Drink element() {
        Drink drink = peek();
        if (drink == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return drink;
    }
   /**
    * get queue elements
    * @return elements
    */
    public List<Drink> getElements(){
        return elements;
    }
}
