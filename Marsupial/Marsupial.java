public class Marsupial {
  // static method to be hidden in child class
  public static boolean isBiped() {
    return false;
  }

  public void getMarsupialDescription() {
    System.out.println("Marsupial walks on two legs: " + isBiped());
  }
}