import java.util.SortedSet;
import java.util.TreeSet;

public class RectangleApp {
  public static void main (String args[]) {
    SortedSet<Rectangle> set = new TreeSet<Rectangle>();
    
    Rectangle r1 = new Rectangle(3,5);  // area = 15
    Rectangle r2 = new Rectangle(4,5);  // area = 20
    Rectangle r3 = new Rectangle(3,6);  // area = 18
    Rectangle r4 = new Rectangle(2,6);  // area = 12
    
    set.add(r1);  // adds r1 to the set
    set.add(r2);  // adds r2 to the set
    set.add(r3);  // adds r3 to the set
    set.add(r4);  // adds r4 to the set

    System.out.println(set);
  }
}
