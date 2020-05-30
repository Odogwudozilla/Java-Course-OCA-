public class Mouse {
  private int numTeeth;
  private int numWhiskers;
  private int weight;

  public Mouse(int weight) {
    this(weight, 16, 6); // calls constructor with 2 parameters
    System.out.println("Constructor 1");
  }

  public Mouse(int weight, int numTeeth) {
    // this(weight, numTeeth, 6); // calls constructor with 3 parameters
    System.out.println("Constructor 2");
  }

  public Mouse(int weight, int numTeeth, int numWhiskers) {
    this.weight = weight;
    this.numTeeth = numTeeth;
    this.numWhiskers = numWhiskers;
    System.out.println("Constructor 3");
  }

  public void print() {
    System.out.println(weight + " " + numTeeth + " " + numWhiskers);
  }

  public static void main(String[] args) {
    Mouse mouse = new Mouse(15);
    mouse.print();
  }
}