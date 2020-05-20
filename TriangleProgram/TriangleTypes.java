import java.util.*;

/**
 * This program determins the type of triangle given any 3 sides as input.
 * 
 * @author Chidozie Nnachor
 */
class TriangleTypes extends Shape {
  public static String riderMessage = "\nRemember, for a triangle to be valid, the sum of any 2 sides will always be greater than the third side.";

  // set the final Strings for the shapes
  public final String PREFIX = "Your Triangle is ";
  public final String EQUI = "EQUILATERAL";
  public final String ISOS = "ISOSCELES";
  public final String SCAL = "SCALENE";

  // Prints a welcome message to the console
  public static void introMessage() {
    System.out.println(
        "This program collects three inputs (representing 'sides') from the user and then determines the type of triangle, given those sides."
            + riderMessage + " \nLet's begin...");
  }

  /**
   * The private method below checks if the 3 sides can form a valid triangle The
   * condition is that sum of any two sides must be greater than the third side
   */
  private boolean isTriangleValid(double[] theSides) {
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
  void determineTriangleType(TriangleTypes aTriangle, double[] theSides) {

    if (aTriangle.isTriangleValid(theSides)) {
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

  private double[] calculateShape() {

    double[] sidesArray = new double[3]; // create an array

    for (int i = 0; i < sidesArray.length; i++) {
      // Get user input and check for errors/exception
      System.out.println("Enter a Value for Side " + (i + 1) + " of triangle:");
      Shape.tryError();
      // set absolute value of user input to each array element.
      sidesArray[i] = Math.abs(userin.nextDouble());
      System.out.println("The entered value is " + sidesArray[i]);

    }
    // Output array values to console
    System.out.println("The Sides of the triangle are:");
    System.out.println(Arrays.toString(sidesArray));

    return sidesArray;

  }

  public double[] getCalculateShape() {
    return calculateShape();
  }

}