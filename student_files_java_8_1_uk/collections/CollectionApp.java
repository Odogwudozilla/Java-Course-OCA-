import java.util.*;

class CollectionApp {
    public static void main (String args[]) {
    Collection c = new ArrayList();
    c.add("Collection");
    c.add("array");   
    c.add("Set");
    c.add("array");
    c.add("Map");
    Iterator i = c.iterator();
    while(i.hasNext()) {
      System.out.println(i.next());
    }
  }
}
