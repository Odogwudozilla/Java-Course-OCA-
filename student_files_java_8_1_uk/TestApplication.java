import java.util.Random;

class TestApplication {

  public static void main(String args[]) {
    // Lines beginning with // are comment.
    // Write the code to run in the application in the space below.
    // A variable can be shown on the screen in the following way:
    // System.out.println(variable);
    final double EX_RATE_EURO = 2.20371; // Constatnt for the exchange rate

    double costOfPotatoes = 2.25;
    double potatoBagInGuilders = costOfPotatoes * EX_RATE_EURO;

    System.out.println("The cost of a bag of potatoes in Guilders is: " + potatoBagInGuilders);

    double length, height, width;
    length = 5;
    height = 6;
    width = 4;

    Box b = new Box(length, height, width);
    System.out.println("Volume: " + b.volume());

    // throwDice
    System.out.println("Random number: " + throwDice());
    System.out.println(args[1]);

  }

  // Method that returns a random number between 1 and six
  static double throwDice() {
    return (int) (Math.random() * 5 + 1);
  }

}

class Box {

  private double length, height, width;

  Box(double l, double h, double w) {
    length = l;
    height = h;
    width = w;
  }

  double volume() {
    return length * height * width;
  }
}
