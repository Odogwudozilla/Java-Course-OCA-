import java.util.*;

class Shape {

  public Shape objectInFocus;

  public static String name = "SHAPE";

  public String riderMessage = "\nA shape is defined by enclosed sides.";

  public void introMessage() {
    System.out.println(
        "This program collects any number of inputs (representing 'sides') from the user and then determines the type of shape, given those sides."
            + riderMessage + " \nLet's begin...");

  }

  public void chosenShape() {
    System.out.println("The chosen " + Shape.name + " is a " + objectInFocus.getName());
  }

  public void getIntroMessage(Shape shapeType) {
    shapeType.introMessage();
  }

  public Shape chooseYourShape() {

    int input = new Scanner(System.in).nextInt();
    switch (input) {
      case 1:
        objectInFocus = new TriangleTypes();
        chosenShape();
        break;
      case 2:
        System.out.println("bat");
        break;
      case 3:
        System.out.println("big bat");
        break;
      default:
        System.out
            .println("The value chosen does not match any " + Shape.name + " in the program. \nPlease try again:");
        chooseYourShape();
    }

    return objectInFocus;

  }

  public String getName() {
    return name;
  }

}