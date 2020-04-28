public class Switch {
  public void switchString(String input) {
    // Each switch case should essentially have an accompanying break statement,
    // otherwise java evaluates all cases and the default
    switch (input) {
      case "a":
        System.out.println("apple");
        break;
      case "b":
        System.out.println("bat");
        break;
      case "B":
        System.out.println("big bat");
        break;
      default:
        System.out.println("none");
    }

  }

  public static void main(String[] args) {
    Switch sw = new Switch();

    sw.switchString("hthth");
  }

}