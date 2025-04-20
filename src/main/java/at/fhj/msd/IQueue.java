package at.fhj.msd;
// define an interface IQueue with the following methods
// offer(String obj): boolean

public interface IQueue {
/**
 * Adds an element to the queue.
 *
 * @param obj the string to add
 * @return true if the element was added successfully
 */
  boolean offer(String obj);

  //returns + del 1st element; null if nothing in there
   //
  String poll();

  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  String remove();

  // 1st element without dlete, otherwise null
   
  String peek();

  // element is to peek what remove is to poll
  
  String element();
}