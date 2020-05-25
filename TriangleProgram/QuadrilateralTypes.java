import java.util.*;

class QuadrilateralTypes extends Shape implements ShapeProperty {

  // set the final variables for the shape
  public static final int QUADRILATERAL_SIDE_LENGTH = 4;
  public static final String NAME = "QUADRILATERAL";
  public static final String PREFIX = "Your Quadrilateral is ";
  public static final String RECT = "RECTANGLE";
  public static final String SQUA = "SQUARE";
  public static final String TRAP = "TRAPEZIUM";

  public String riderMessage = "\nRemember, for a " + getName()
      + " to be valid, it must be an enclosed shape with exactly " + QUADRILATERAL_SIDE_LENGTH + " sides";

  static double[] theSides = new double[QUADRILATERAL_SIDE_LENGTH]; // create an array

  // Prints a welcome message to the console
  @Override
  public void introMessage() {
    System.out
        .println("This program collects inputs (representing 'sides') from the user and then determines the type of "
            + getName() + ", given those sides." + riderMessage);
  }

  @Override
  public void determineShapeType() {
    // Check if the shape is valid
    if (isShapeValid(theSides)) {
      // check for "Square"
      if ((theSides[0] == theSides[1]) && (theSides[0] == theSides[2]) && (theSides[0] == theSides[3])
          && (theSides[1] == theSides[2]) && (theSides[1] == theSides[3]) && (theSides[2] == theSides[3])) {
        System.out.println(PREFIX + SQUA);
        // check for "Rectangle"
      } else if ((theSides[0] == theSides[1] && theSides[2] == theSides[3])
          || (theSides[0] == theSides[2] && theSides[1] == theSides[3])
          || (theSides[0] == theSides[3] && theSides[1] == theSides[2])) {
        System.out.println(PREFIX + RECT);
        // check for "Trapezium"
      } else if ((theSides[0] == theSides[1] && theSides[2] != theSides[3])
          || (theSides[0] == theSides[2] && theSides[1] != theSides[3])
          || (theSides[0] == theSides[3] && theSides[1] != theSides[2])
          || (theSides[1] == theSides[2] && theSides[0] != theSides[3])
          || (theSides[1] == theSides[3] && theSides[0] != theSides[2])
          || (theSides[2] == theSides[3] && theSides[1] != theSides[0])) {
        System.out.println(PREFIX + TRAP);
        // If the above don't hold, then it must be some toher polygon
      } else {
        System.out.println(PREFIX + " some other type of polygon.");
      }
    } else {
      System.out.println("Sides entered cannot form a " + getName() + ". " + riderMessage);

    }

  }

  @Override
  public double[] calculateShape() {
    for (int i = 0; i < theSides.length; i++) {
      // Get user input and check for errors/exception
      System.out.println("Enter a Value for Side " + (i + 1) + " of " + getName() + ":");

      // set absolute value of user input to each array element.
      theSides[i] = Math.abs(RunShape.tryError());
      System.out.println("The entered value is " + theSides[i]);

    }
    // Output array values to console
    System.out.println("The Sides of the " + getName() + " are:");
    System.out.println(Arrays.toString(theSides));

    return theSides;
  }

  /**
   * The method below checks if the sides can form a valid Quadrilateral.
   */
  @Override
  public boolean isShapeValid(double[] theSides) {
    // the length of the array of sides must be equal to 4
    if (theSides.length != QUADRILATERAL_SIDE_LENGTH) {
      return false;
    }
    // each side must have a value greater than zero
    // eachSide();

    return true;
  }

  @Override
  public String getName() {
    return this.NAME;
  }

}