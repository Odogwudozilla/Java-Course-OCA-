public class Switch {
  public void switchString(String input) {
    switch (input) {
      case "a":
        System.out.println("apple");
        // break;
      case "b":
        System.out.println("bat");
      case "B":
        System.out.println("big bat");
        // break;
      default:
        System.out.println("none");
    }

  }

  public static void main(String[] args) {
    Switch sw = new Switch();

    sw.switchString("a");
  }

}