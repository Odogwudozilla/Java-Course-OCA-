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

  public static void banner(String bumperOrFender) {
    switch (bumperOrFender) {
    case "bumper":
      System.out.printf("%n%n|------THIS IS ANOTHER BLOCK OF RESULTS-----|%n");
      break;

    case "fender":
      System.out.printf("-------------END OF RESULTS block------------%n");
      break;
    }

  }

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

    banner("bumper");
    StringBuilder sb = new StringBuilder("animals");
    sb.insert(7, "-");
    sb.insert(0, "-");
    sb.insert(4, "-");
    System.out.println(sb);

    banner("bumper");
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();

    banner("bumper");
    List<String> list = new ArrayList<>();
    List<String> newList = new ArrayList<>();

    list.add("Abc");
    list.add("ABC");
    list.add("abc");
    Collections.sort(list);
    System.out.println(list);

    banner("bumper");
    int[][] twoD = new int[3][2];
    for (int i = 0; i < twoD.length; i++) {
      for (int j = 0; j < twoD[i].length; j++)
        System.out.print(twoD[i][j] + " "); // print element
      System.out.println(); // time for a new row
    }

    banner("bumper");
    myPig.fly((short) 1);

    banner("bumper");
    int i = 1, j = 10;
    int k = 1;
    do {
      System.out.println("Iteration " + k + ": i=" + i + " j=" + j);
      k++;
      if (i++ > --j)
        continue;
    } while (i < 5);
    System.out.println("i=" + i + " j=" + j);

    banner("bumper");
    Example tc = new Example();
    tc.switchString("b");

    banner("bumper");
    Integer ia = 128;
    Integer iib = 128;
    System.out.println(ia.equals(iib));
    System.out.println(ia == iib);

    banner("bumper");
    List<String> bunnies = new ArrayList<>();
    bunnies.add("long ear");
    bunnies.add("floppy");
    bunnies.add("hoppy");
    System.out.println(bunnies); // [long ear, floppy, hoppy]
    bunnies.removeIf(noH -> noH.charAt(0) != 'h');
    System.out.println(bunnies); // [hoppy

    banner("bumper");
    int iE = 1234567890;
    float f = iE;
    System.out.println(iE + " " + f + " " + (iE - (int) f));

  }

}
