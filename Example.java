//import java.util.Array;

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
}

class Example {
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
  }

}
