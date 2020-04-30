public class Switch {
  public void switchString(String input) {
    // Each switch case should essentially have an accompanying break statement,
    // otherwise java evaluates all cases (unti it finds a break, otherwise the
    // default is evaluated too) if it finds a match
    switch (input) {
      case "a":
        System.out.println("apple");
        break;
      case "b":
        System.out.println("bat");
        // break;
      case "B":
        System.out.println("big bat");
        break;
      default:
        System.out.println("none");
    }

  }

  public static void main(String[] args) {
    Switch sw = new Switch();

    sw.switchString("b");

    // x is printed three times for each 'value'
    int[] values = { 10, 30, 50 };
    for (int val : values) {
      int x = 0;
      while (x < values.length) {
        System.out.println(x + " " + val);
        x++;
      }
    }

    System.out.println(new Switch());

    boolean b = false;
    int i = 1;
    do {
      System.out.println("i before increment: " + i);
      i++;
      System.out.println("i after increment: " + i);
    } while (b = !b);
    System.out.println(i);

  }

}