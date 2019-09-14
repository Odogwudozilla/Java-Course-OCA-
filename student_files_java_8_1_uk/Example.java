class Example {
  public static void main(String args[]) {
    Item p = new Item("pen", 1.5);
    System.out.println(p);
  }

}

/**
 * InnerExample
 */
class Item {
  private String name;
  private double price;

  Item(String name, double price) {
    this.name = name;
    this.price = price;
  }

}
