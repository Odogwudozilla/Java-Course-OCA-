public class Bunny {

  private String color;
  private int height;
  private int length;

  public static void canYou() {
    System.out.println("b.length +  + b.height +  + b.color");
  }

  public Bunny(int length, int theHeight, String thecolor) {
    System.out.println("the constructor is printing");
    length = this.length; // backwards – no good!
    height = theHeight; // fine because a different name
    this.color = thecolor; // fine, but redundant
  }

  public static void main(String[] args) {

    canYou();

    Bunny b = new Bunny(1, 2, "whitey");
    System.out.println(b.length + " " + b.height + " " + b.color);
  }
}