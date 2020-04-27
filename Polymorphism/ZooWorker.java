public class ZooWorker {
  // Polymorphic Parameters
  public static void feed(Reptile reptile) {
    System.out.println("Feeding reptile " + reptile.getName());
  }

  int count;

  public ZooWorker() {
    count = 4;
  }

  public static void main(String[] args) {
    feed(new Alligator());
    feed(new Crocodile());
    feed(new Reptile());

    // new instance initialises the constructor which then assigns the new value of
    // 'count' and prints it
    ZooWorker zoo = new ZooWorker();
    System.out.println(zoo.count);

  }
}