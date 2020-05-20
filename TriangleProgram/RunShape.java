import java.util.*;
import java.util.concurrent.TimeUnit;

public class RunShape {

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
    Shape.tryError();
    int startStop = Shape.userin.nextInt();
    if (startStop == 0) {
      System.out.println("Bye...");
      return false;
    }
    System.out.println("Restarting...");
    iSleep(2);
    return true;
  }

  public static void main(String[] args) {

    TriangleTypes.introMessage();
    iSleep(2);

    /**
     * We need the program to run at least once. The user can then choose to run it
     * again.
     */
    do {

      // We create a new object here and run the checks with the values we already
      // have
      TriangleTypes at = new TriangleTypes();
      at.determineTriangleType(at, at.getCalculateShape());

      System.out.println("Do you want to try again?(1 = YES, 0 = NO)");

    } while (isContinue());

  }

}