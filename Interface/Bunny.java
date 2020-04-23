public class Bunny implements Hop {
  public void printDetails() {
    // A static method in an interface is not available in the subclass.
    // It must be explicitly refrenced (Hop.)
    System.out.println(Hop.getJumpHeight());
  }

  public static void main(String[] args) {
    new Bunny().printDetails();
  }
}