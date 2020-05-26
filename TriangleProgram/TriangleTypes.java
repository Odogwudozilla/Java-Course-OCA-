import java.util.*;

class TriangleTypes extends Shape implements ShapeProperty {

  // set the final variables for the shape. There is no reason for these to change
  public static final int TRIANGLE_SIDE_LENGTH = 3;
  public static final String NAME = "TRIANGLE";
  public static final String PREFIX = "Your Triangle is ";
  public static final String EQUI = "EQUILATERAL";
  public static final String ISOS = "ISOSCELES";
  public static final String SCAL = "SCALENE";
  // create an array. The length is the same for all instances of a Triangle
  static double[] theSides = new double[TRIANGLE_SIDE_LENGTH];

  public String riderMessage = "\nRemember, for a " + getName()
      + " to be valid, the sum of any 2 sides will always be greater than the third side.";

  // Prints a welcome message to the console
  @Override
  public void introMessage() {
    System.out.println(
        "This program collects three inputs (representing 'sides') from the user and then determines the type of "
            + getName() + ", given those sides." + riderMessage);
  }

  /**
   * The method below checks if the 3 sides can form a valid triangle The
   * condition is that sum of any two sides must be greater than the third side
   */
  @Override
  public boolean isShapeValid(double[] theSides) {

    if ((theSides[0] + theSides[1]) > theSides[2] && (theSides[0] + theSides[2]) > theSides[1]
        && (theSides[1] + theSides[2]) > theSides[0]) {
      return true;
    }
    // check for null values
    eachSide();

    return false;

  }

  /**
   * Method checks if the triangle is valid and then otputs the type of triangle,
   * or an error message otherwise
   */
  @Override
  public void determineShapeType() {
    // the triangle must be valid in the first place
    if (isShapeValid(theSides)) {
      // check for "Equilateral"
      if (theSides[0] == theSides[1] && theSides[0] == theSides[2]) {
        System.out.println(PREFIX + EQUI);
        // check for "Isosceles"
      } else if ((theSides[0] == theSides[1] && theSides[0] != theSides[2])
          || (theSides[0] == theSides[2] && theSides[0] != theSides[1])
          || (theSides[1] == theSides[2] && theSides[1] != theSides[0])) {
        System.out.println(PREFIX + ISOS);
        // If the two above don't hold, then "Scalene" must be true
      } else {
        System.out.println(PREFIX + SCAL);
      }
    } else {
      System.out.println("Sides entered cannot form a " + getName() + ". " + riderMessage);

    }

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