public class Mouse extends Rodent {
  protected int tailLength = 8;

  public void getMouseDetails() {
    System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
  }

  public static void main(String[] args) {
    Mouse mouse = new Mouse();
    mouse.getRodentDetails();
    mouse.getMouseDetails();
    System.out.println("The mouse tail length is " + mouse.tailLength + "/n while the Rodent tail length is "
        + new Rodent().tailLength);
  }
}