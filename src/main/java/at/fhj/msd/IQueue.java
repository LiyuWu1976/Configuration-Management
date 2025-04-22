package at.fhj.msd;
// define an interface IQueue with the following methods
// offer(String obj): boolean
//Erklärung <T>:Da die Anleitung vorschreibt, dass DrinkQueue IQueue implementieren soll,
// werden wir IQueue zu einem generischen Interface machen.

public interface IQueue<T> {
/**
 * Adds an object to the queue.
 *
 * @param obj the object to add
 * @return true if the object was added, false if the queue is full or obj is null
 */
  boolean offer(T obj);

  /**
     * Retrieves and removes the first element in the queue.
     *
     * @return the first element, or null if the queue is empty
     */
  T poll();

  /**
     * Retrieves and removes the first element, or throws an exception if empty.
     *
     * @return the first element
     * @throws java.util.NoSuchElementException if the queue is empty
     */
  T remove();

  /**
     * Retrieves the first element without removing it.
     *
     * @return the first element, or null if the queue is empty
     */
   
  T peek();

  /**
     * Retrieves the first element without removing it, or throws an exception if empty.
     *
     * @return the first element
     * @throws java.util.NoSuchElementException if the queue is empty
     */
  
  T element();
}