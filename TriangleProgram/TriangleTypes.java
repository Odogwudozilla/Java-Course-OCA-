import java.util.*;

class TriangleTypes extends Shape implements ShapeProperty {

  // set the final variables for the shape
  public final int TRIANGLE_SIDE_LENGTH = 3;
  public final String name = "TRIANGLE";
  public final String PREFIX = "Your Triangle is ";
  public final String EQUI = "EQUILATERAL";
  public final String ISOS = "ISOSCELES";
  public final String SCAL = "SCALENE";

  public String riderMessage = "\nRemember, for a triangle to be valid, the sum of any 2 sides will always be greater than the third side.";

  double[] theSides = new double[TRIANGLE_SIDE_LENGTH]; // create an array
  // Prints a welcome message to the console

  @Override
  public void introMessage() {
    System.out.println(
        "This program collects three inputs (representing 'sides') from the user and then determines the type of triangle, given those sides."
            + riderMessage + " \nLet's begin...");
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
    return false;

  }

  /**
   * Method checks if the triangle is valid and then otputs the type of triangle,
   * or an error message otherwise
   */
  @Override
  public void determineShapeType() {

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
      System.out.println("Sides entered cannot form a triangle. " + riderMessage);

    }

  }

  @Override
  public double[] calculateShape() {

    for (int i = 0; i < theSides.length; i++) {
      // Get user input and check for errors/exception
      System.out.println("Enter a Value for Side " + (i + 1) + " of triangle:");
      RunShape.tryError();
      // set absolute value of user input to each array element.
      theSides[i] = Math.abs(RunShape.userin.nextDouble());
      System.out.println("The entered value is " + theSides[i]);

    }
    // Output array values to console
    System.out.println("The Sides of the triangle are:");
    System.out.println(Arrays.toString(theSides));

    return theSides;

  }

  @Override
  public String getName() {
    return this.name;
  }

}