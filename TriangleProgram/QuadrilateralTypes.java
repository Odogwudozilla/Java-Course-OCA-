import java.util.*;

class QuadrilateralTypes extends Shape implements ShapeProperty {

  // set the final variables for the shape. There is no reason for these to change
  public static final int QUADRILATERAL_SIDE_LENGTH = 4;
  public static final String NAME = "QUADRILATERAL";
  public static final String PREFIX = "Your Quadrilateral is ";
  public static final String RECT = "RECTANGLE";
  public static final String SQUA = "SQUARE";
  public static final String TRAP = "TRAPEZIUM";
  // create an array. The length is the same for all instances of a Quadrilateral
  static double[] theSides = new double[QUADRILATERAL_SIDE_LENGTH];

  public String riderMessage = "\nRemember, for a " + getName()
      + " to be valid, it must be an enclosed shape with exactly " + QUADRILATERAL_SIDE_LENGTH + " sides";

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
        // If the above don't hold, then it must be some other polygon
      } else {
        System.out.println(PREFIX + " some other type of polygon.");
      }
    } else {
      System.out.println("Sides entered cannot form a " + getName() + ". " + riderMessage);

    }

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
    eachSide();

    return true;
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public double[] getSides() {
    return theSides;
  }

}