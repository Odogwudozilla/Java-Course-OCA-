import java.util.*;

class Shape {

  double[] theSides;

  public Shape objectInFocus;

  public static String name = "SHAPE";

  public String riderMessage = "\nA shape is defined by enclosed sides.";

  public void introMessage() {
    System.out.println(
        "This program collects any number of inputs (representing 'sides') from the user and then determines the type of shape, given those sides."
            + riderMessage + " \nLet's begin...");

  }

  public void chosenShape() {
    System.out.println("The chosen " + Shape.name + " is a " + objectInFocus.getName());
  }

  public Shape chooseYourShape() {

    int input = new Scanner(System.in).nextInt();
    switch (input) {
      case 1:
        objectInFocus = new TriangleTypes();
        chosenShape();
        break;
      case 2:
        objectInFocus = new QuadrilateralTypes();
        chosenShape();
        break;
      case 3:
        System.out.println("big bat");
        break;
      default:
        System.out
            .println("The value chosen does not match any " + Shape.name + " in the program. \nPlease try again:");
        chooseYourShape();
    }

    return objectInFocus;

  }

  public boolean eachSide() {
    // each side of a shape object must have a value greater than zero
    for (double eachSide : getSides()) {
      if (eachSide <= 0) {
        return false;
      }
    }
    return true;
  }

  public double[] calculateShape() {

    for (int i = 0; i < getSides().length; i++) {
      // Get user input and check for errors/exception
      System.out.println("Enter a Value for Side " + (i + 1) + " of " + getName() + ":");

      // set absolute value of user input to each array element.
      getSides()[i] = Math.abs(RunShape.tryError());
      System.out.println("The entered value is " + getSides()[i]);

    }
    // Output array values to console
    System.out.println("The Sides of the " + getName() + " are:");
    System.out.println(Arrays.toString(getSides()));

    return getSides();

  }

  public void getIntroMessage(Shape shapeType) {
    shapeType.introMessage();
  }

  public String getName() {
    return name;
  }

  public double[] getSides() {
    return this.theSides;
  }

}