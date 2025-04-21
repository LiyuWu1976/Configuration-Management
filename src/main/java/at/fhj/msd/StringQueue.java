package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
    maxSize = maxsize; //fix the bug here, it should be maxsize
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize) //fix the bug here, it should be < maxSize
      {elements.add(obj);
      return true;
    } else{
      return false; //fix the bug here, it should return false if the size is >= maxSize
    }
  }

  @Override
  public String poll() {
    String element = peek();
    if (elements.size() == 0) {
      return null; //fix the bug here, when the size is 0, it should return null
    }
    return elements.remove(0); //fix the bug here, it should remove the first element
  }

  @Override
  public String remove() {
    String element = poll();
    //element = ""; //fix the bug here, this statement should not exist
    if (element == null)
      throw new NoSuchElementException("there's no element any more");
    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      return elements.get(0);
    else
      return null;    
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }
}