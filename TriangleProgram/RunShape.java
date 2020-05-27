
/**
 * This program determinees the type of plane shape given any number of sides as input. The user can choose to check for:
 * <ul>
 * <li>@TriangleTypes</li>
 * <li>@Quadrilaterals</li>
 * </ul>
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

  // handle user input
  static double tryError() {
    // the input must be a positive number
    do {
      System.out.println("Please enter a positive number!");
      while (!userin.hasNextDouble()) {
        System.out.println("That's not a number!");
        userin.next(); // this is important!
      }
      useableValue = userin.nextDouble();
      // keep asking for user input if the entered number is not greater than zero
      // (since any side must be greater than zero)
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
    System.out.println("Do you want to continue?(0 = NO , any other key = YES)");
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
    // Instanciates the particular shape (objectInFocus) via the superclass
    Shape thisRun = new Shape().chooseYourShape();
    // print intro message for that objectInFocus
    thisRun.getIntroMessage(thisRun);
    iSleep(2);

    // repeat the operations below as many times as the user wants
    while (isContinue()) {

      // calculate the shape of the objectInFocus
      thisRun.calculateShape();

      // We create a new object here (with the interface reference) and run the check.
      // The object is cast to the interface because it is a 'Shape'.
      ShapeProperty sp = (ShapeProperty) thisRun;
      sp.determineShapeType();

    }

  }

}
