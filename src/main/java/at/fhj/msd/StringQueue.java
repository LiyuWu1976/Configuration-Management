package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/**
 * A queue implementation for storing strings with a fixed maximum size.
 */

public class StringQueue implements IQueue<String> {//Übergeben Sie StringQueue.java, um die generische Schnittstelle zu verwenden

  /**
     * The list storing the queue elements.
     */
  protected  List<String> elements = new ArrayList<>();
  /**
     * The maximum number of elements the queue can hold.
     */
  private int maxSize;

  /**
     * Creates a StringQueue with the specified maximum size.
     *
     * @param maxSize the maximum number of elements the queue can hold
     */
  public StringQueue(int maxsize) {
    this.maxSize = maxsize; //Fix 1: this.maxSize = maxsize weist den Parameter korrekt dem Feld zu.
  }

  /**
     * Adds  Adds a string to the queue.
     *
     * @param obj the string to add
     * @return true if the string was added, false if the queue is full or obj is null
     */
  @Override
  public boolean offer(String obj) {// Fix 2: Null-Check und korrekte Größenprüfung
    //Fix 2: Prüfe, ob obj null ist oder die Queue voll ist. Nur wenn beides nicht zutrifft, wird das Element hinzugefügt.
    if (obj == null || elements.size() >= maxSize){ 
       return false;
      }
      elements.add(obj);
      return true; 
    
  }

  /**
     * Retrieves and removes the first string in the queue.
     *
     * @return the first string, or null if the queue is empty
     */
  @Override
  public String poll() {
      if (elements.isEmpty()) {
      return null;
      }
      String element = elements.get(0);     
      //Fix 3: Entferne das erste Element nur, wenn die Queue nicht leer ist.
      //Verwende isEmpty() für klareren Code.
      elements.remove(0); // Fix 3: Entferne Element, wenn Queue nicht leer
      return element;
  }

  /**
     * Retrieves and removes the first string, or throws an exception if empty.
     *
     * @return the first string
     * @throws NoSuchElementException if the queue is empty
     */
  @Override
  public String remove() {
    String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element; // Fix 4: Entferne unnötige Zuweisung
        //Fix 4: Entferne die Zuweisung element = "", 
        //damit das von poll() zurückgegebene Element korrekt zurückgegeben wird.
  }

  /**
     * Retrieves the first string without removing it.
     *
     * @return the first string, or null if the queue is empty
     */
  @Override
  public String peek() {
      if (elements.isEmpty()) {
          return null;
      }
      return elements.get(0);
  }
  /**
     * Retrieves the first string without removing it, or throws an exception if empty.
     *
     * @return the first string
     * @throws NoSuchElementException if the queue is empty
     */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
}