public class ZooWorker {
  // Polymorphic Parameters
  public static void feed(Reptile reptile) {
    System.out.println("Feeding reptile " + reptile.getName());
  }

  public static void main(String[] args) {
    feed(new Alligator());
    feed(new Crocodile());
    feed(new Reptile());
  }
}