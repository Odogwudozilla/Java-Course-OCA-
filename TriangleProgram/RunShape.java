
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
  static double useableValue;

  // Defines the error/exception method
  static void wrongOption() {
    while (!userin.hasNextDouble()) {
      System.out.println("You have entered invalid data. Ensure entered data is a number");
      userin.next();
    }

  }

  static double tryError() {

    do {
      System.out.println("Please enter a positive number!");
      while (!userin.hasNextDouble()) {
        System.out.println("That's not a number!");
        userin.next(); // this is important!
      }
      useableValue = userin.nextDouble();
    } while (useableValue <= 0.0);

    return useableValue;

  }

  // sleeps the program for the stated number of seconds
  public static void iSleep(int inSeconds) {
    try {
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
    wrongOption();
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
    // Instanciates the particular shape via the superclass
    Shape thisRun = new Shape().chooseYourShape();

    thisRun.getIntroMessage(thisRun);
    iSleep(2);

    while (isContinue()) {

      // We create a new object here (with the interface reference) and run the check.
      // The object is cast to the interface because it has 'Shape' properties
      ShapeProperty sp = (ShapeProperty) thisRun;
      sp.calculateShape();
      sp.determineShapeType();

    }

  }

}
