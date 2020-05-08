import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * This program tells you the type of triangle given the 3 sides.
 * 
 * @author Chidozie Nnachor
 */
public class TriangleTypes {
  public static String riderMessage = "\nRemember, for a triangle to be valid, the sum of any 2 sides will always be greater than the third side.";
  // define the variable for getting user input
  static Scanner userin = new Scanner(System.in);

  // sleeps the program for the stated number of seconds
  public static void iSleep(int inSeconds) {
    try {
      System.out.println("Loading...");
      TimeUnit.SECONDS.sleep(inSeconds);

    } catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }

  // Defines the error/exception method
  static void tryError() {
    while (!userin.hasNextDouble()) {
      System.out.println("You have entered invalid data. Ensure entered data is a number");
      userin.next();
    }
  }

  // Prints a welcome message to the console
  public static void introMessage() {
    System.out.println(
        "This program collects three inputs (representing 'sides') from the user and then determines the type of triangle, given those sides."
            + riderMessage + " \nLet's begin...");
  }

  // prompts for user action. Returns @true if the user wants to continue. @false
  // otherwise
  public static boolean isExit() {
    tryError();
    int startStop = userin.nextInt();
    if (startStop == 0) {
      System.out.println("Bye...");
      return false;
    }
    System.out.println("Restarting...");
    iSleep(2);
    return true;
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
  private void determineTriangleType(TriangleTypes aTriangle, double[] theSides) {

    if (aTriangle.isTriangleValid(theSides)) {
      // check for "Equilateral"
      if (theSides[0] == theSides[1] && theSides[0] == theSides[2]) {
        System.out.println("Your Triangle is Equilateral");
        // check for "Isosceles"
      } else if ((theSides[0] == theSides[1] && theSides[0] != theSides[2])
          || (theSides[0] == theSides[2] && theSides[0] != theSides[1])
          || (theSides[1] == theSides[2] && theSides[1] != theSides[0])) {
        System.out.println("Your Triangle is Isosceles");
        // If the two above don't hold, then "Scalene" must be true
      } else {
        System.out.println("Your Triangle is Scalene");
      }
    } else {
      System.out.println("Sides entered cannot form a triangle. " + riderMessage);

    }

  }

  public static void main(String[] args) {

    introMessage();
    iSleep(2);

    /**
     * We need the program to run at least once. The user can then choose to run it
     * again.
     */
    do {

      double[] sidesArray = new double[3]; // create an array

      for (int i = 0; i < sidesArray.length; i++) {
        // Get user input and check for errors/exception
        System.out.println("Enter a Value for Side " + (i + 1) + " of triangle:");
        tryError();
        // set absolute value of user input to each array element.
        sidesArray[i] = Math.abs(userin.nextDouble());
        System.out.println("The entered value is " + sidesArray[i]);

      }
      // Output array values to console
      System.out.println("The Sides of the triangle are:");
      System.out.println(Arrays.toString(sidesArray));

      // We create a new object here and run the checks with the values we already
      // have
      TriangleTypes at = new TriangleTypes();
      at.determineTriangleType(at, sidesArray);

      System.out.println("Do you want to try again?(1 = YES, 0 = NO)");

    } while (isExit());

  }

}