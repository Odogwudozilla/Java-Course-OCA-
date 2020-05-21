
/**
 * This program determins the type of triangle given any 3 sides as input.
 * 
 * @author Chidozie Nnachor
 */

import java.util.*;
import java.util.concurrent.TimeUnit;

public class RunShape {

  public static void welcomeMessage() {
    System.out.println(
        "Please choose the type of " + Shape.name + " you want to check \n(HINT: 1 = TRIANGLE, 2 = QUADRILATERAL)");
  }

  // define the variable for getting user input
  static Scanner userin = new Scanner(System.in);

  // Defines the error/exception method
  static void tryError() {
    while (!userin.hasNextDouble()) {
      System.out.println("You have entered invalid data. Ensure entered data is a number");
      userin.next();
    }
  }

  // sleeps the program for the stated number of seconds
  public static void iSleep(int inSeconds) {
    try {
      System.out.println("Loading...");
      TimeUnit.SECONDS.sleep(inSeconds);

    } catch (InterruptedException ex) {
      System.out.println("The sleep was interrupted");
      Thread.currentThread().interrupt();
    }
  }

  // prompts for user action. Returns @true if the user wants to continue. @false
  // otherwise
  public static boolean isContinue() {
    System.out.println("Do you want to continue?(1 = YES, 0 = NO)");
    tryError();
    int startStop = userin.nextInt();
    if (startStop == 0) {
      System.out.println("Bye...");
      return false;
    }
    System.out.println("Starting...");
    iSleep(1);
    return true;
  }

  public static void main(String[] args) {
    RunShape.welcomeMessage();

    Shape thisRun = new Shape().chooseYourShape();

    thisRun.getIntroMessage(thisRun);
    iSleep(2);

    while (isContinue()) {

      // We create a new object here and run the checks with the values we already
      // have
      ShapeProperty sp = (ShapeProperty) thisRun; // cast the object to the interface
      sp.calculateShape();
      sp.determineShapeType();

    }

  }

}