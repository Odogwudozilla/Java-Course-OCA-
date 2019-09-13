import java.util.*;

public class ComparatorApp {
  public static void main(String args[]) {
    List<String> list = Arrays.asList(args);
    Comparator<String> myComparator = new MyComparator(); // create comparator
    Collections.sort(list, myComparator);  // Sort using comparator
    System.out.println(list);              // Show the sorted list
  }
}

class MyComparator implements Comparator<String> {   
  public int compare(String s1, String s2) {
    return s1.compareToIgnoreCase(s2);  // Use compareToIgnoreCase() of
  }                                     // the String class as compare method
}
