import java.util.*;
import java.time.*;

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();

  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }

  public void fly(int numMiles) {
    System.out.println("int");
  }

  public void fly(short numMiles) {
    System.out.println("short");
  }
}

class Example {

  public void switchString(String input) {
    switch (input) {
    case "a":
      System.out.println("apple");
      break;
    case "b":
      System.out.println("bat");
    case "B":
      System.out.println("big bat");
      break;
    default:
      System.out.println("none");
    }
  }

  public static void main(String[] args) {

    String str = "animals";
    System.out.println("abc".startsWith("A"));
    System.out.println("abc".startsWith("A".toLowerCase()));
    System.out.println("abc".toUpperCase().startsWith("A".toLowerCase()));
    System.out.println(str.indexOf("n"));
    System.out.println("AniMaL    ".trim().toLowerCase().replace('a', 'A'));

    StringBuilder alpha = new StringBuilder();
    for (char current = 'a'; current <= 'z'; current++) {
      alpha.append(current);
      System.out.println(alpha);
    }

    StringBuilder sb = new StringBuilder("animals");
    sb.insert(7, "-");
    sb.insert(0, "-");
    sb.insert(4, "-");
    System.out.println(sb);

    // int[] numbers = { 6, 9, 1 };
    // Array.sort(numbers);
    // for (int i = 0; i < numbers.length; i++)
    // System.out.println(numbers[i] + " ");

    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();

    List<String> list = new ArrayList<>();
    List<String> newList = new ArrayList<>();

    list.add("Abc");
    list.add("ABC");
    list.add("abc");
    Collections.sort(list);
    System.out.println(list);

    int[][] twoD = new int[3][2];
    for (int i = 0; i < twoD.length; i++) {
      for (int j = 0; j < twoD[i].length; j++)
        System.out.print(twoD[i][j] + " "); // print element
      System.out.println(); // time for a new row
    }

    List<Integer> list1 = Arrays.asList(4, 8, 15, 16, 23, 42);
    System.out.println(list1);

    System.out.println("------THIS IS ANOTHER BLOCK OF COD RESULTS-----");
    LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(5, 15);
    LocalDateTime dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30);

    myPig.fly((short) 1);

    int i = 1, j = 10;
    int k = 1;
    do {
      System.out.println("Iteration " + k + ": i=" + i + " j=" + j);
      k++;
      if (i++ > --j)
        continue;
    } while (i < 5);
    System.out.println("i=" + i + " j=" + j);

    Example tc = new Example();
    tc.switchString("b");

    // Integer ia, iib;
    // ia = iib = 36464;

    Integer ia = 128;
    Integer iib = 128;

    System.out.println(ia.equals(iib));
    System.out.println(ia == iib);

  }

}
