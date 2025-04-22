package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<>();
  private int maxSize = 5;

  public StringQueue(int maxsize) {
    this.maxSize = maxsize; //Fix 1: this.maxSize = maxsize weist den Parameter korrekt dem Feld zu.
  }

  @Override
  public boolean offer(String obj) {// Fix 2: Null-Check und korrekte Größenprüfung
    //Fix 2: Prüfe, ob obj null ist oder die Queue voll ist. Nur wenn beides nicht zutrifft, wird das Element hinzugefügt.
    if (obj == null || elements.size() >= maxSize){ 
       return false;
      }
      elements.add(obj);
      return false; 
    
  }

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