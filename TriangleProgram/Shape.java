import java.util.*;

class Shape {

  // define the variable for getting user input
  static Scanner userin = new Scanner(System.in);

  // Defines the error/exception method
  static void tryError() {
    while (!userin.hasNextDouble()) {
      System.out.println("You have entered invalid data. Ensure entered data is a number");
      userin.next();
    }
  }

}